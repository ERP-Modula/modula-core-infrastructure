-- changeset filimonsha:id-1
insert into provider (id, name, label, description, alert_notification, code_uri, auth_type)
values (
    'a1b2c3d4-1234-5678-9101-112131415161',
    'bitrix',
    'Bitrix24',
    'Интеграция с CRM Bitrix24. Документация по подключению: {ссылка на нашу доку}',
    'Прежде чем создавать подключение в Modula, потребуется добавить приложение на стороне Битрикс24.
    1. В Категории приложения ерез поисковую строку находите приложение нашего сервиса.
    2. Установите приложение Modula.
    3. Подключите аккаунт Bitrix24 в Modula',
    'https://${domain}/oauth/authorize/',
    'OAUTH2'
);

-- changeset filimonsha:id-2
insert into provider_additional_param (id, param_key, label, description, provider_id)
values (
    'c1b2c3d4-1234-5678-9101-112131415161',
    'domain',
    'Домен Bitrix24',
    'Укажите поддомен (например: mycompany.bitrix24.ru). Берется из адресной строки браузера, со страницы с открытым Битрикс24.',
    'a1b2c3d4-1234-5678-9101-112131415161'
);

-- changeset filimonsha:id-3
insert into oauth2_provider (id, client_id, client_secret, token_uri)
values (
    'a1b2c3d4-1234-5678-9101-112131415161',
    'local.680d21d64adf80.26641630',
    '1zKDBAOKhue2Wfu3Ii2Ya49Gb5aXv4ED34PUGFHyMTjI0OgJFe',
    'https://oauth.bitrix.info/oauth/token/'
);


-- 2. Добавляем конфигурацию модуля Bitrix
insert into module_configuration (id, name, label, description, icon_path, is_public, theme, author_id, auth_type, provider_id, rest_api_base_url, webhook_base_url)
values (
    'b2c3d4e5-2345-6789-1011-121314151617',
    'bitrix',
    'Bitrix24',
    'Официальная интеграция с Bitrix24',
    '/icons/bitrix.png',
    true,
    'blue',
    'system',
    'OAUTH2',
    'a1b2c3d4-1234-5678-9101-112131415161' ,-- Ссылка на provider.id,
    'https://${domain}/rest',
    ''
);

-- 4. Добавляем действие "Создать сделку" (action)

    insert into module_action (id, name, label, description, category, endpoint_url)
    values (
        'c3d4e5f6-3456-7891-0111-213141516172',
        'create_deal',
        'Создать сделку',
        'Создает новую сделку в CRM Bitrix24',
        'crm',
        '/crm.deal.add'
    );

-- Связываем действие с модулем
insert into module_configuration_actions (module_configuration_id, actions_id)
values (
    'b2c3d4e5-2345-6789-1011-121314151617',
    'c3d4e5f6-3456-7891-0111-213141516172'
);
-- 3. Добавляем основной обязательный параметр connection
INSERT INTO input_parameter (id, name, label, required, help, type)
VALUES (
    'd1e2f3a4-5678-90ab-cdef-1234567890ab',
    'connectionId',
    'ID подключения',
    true,
    'Внутренний идентификатор подключения к Bitrix24',
    'CONNECTION'
);
-- Связываем с действием
INSERT INTO module_action_input_parameters (module_action_id, input_parameters_id)
VALUES (
    (SELECT id FROM module_action WHERE name = 'create_deal'),
    'd1e2f3a4-5678-90ab-cdef-1234567890ab'
);
-- 4. Создаем родительский параметр FIELDS
INSERT INTO input_parameter (id, name, label, required, help, type)
VALUES (
    'a1b2c3d4-5678-90ab-cdef-1234567890ab',
    'FIELDS',
    'Поля сделки',
    true,
    'Объект с полями сделки Bitrix24',
    'COLLECTION'
);
-- Связываем с действием
INSERT INTO module_action_input_parameters (module_action_id, input_parameters_id)
VALUES (
    (SELECT id FROM module_action WHERE name = 'create_deal'),
    'a1b2c3d4-5678-90ab-cdef-1234567890ab'
);
-- 5. Добавляем вложенные параметры для FIELDS
-- Основные поля
INSERT INTO input_parameter (id, name, label, required, help, type)
VALUES
    ('b1c2d3e4-5678-90ab-cdef-1234567890ab', 'TITLE', 'Название сделки', true, 'Обязательное поле', 'STRING'),
    ('c1d2e3f4-5678-90ab-cdef-1234567890ab', 'TYPE_ID', 'Тип сделки', false, 'Например: COMPLEX', 'STRING'),
    ('17128338-e799-49d7-a952-62d911b81fad', 'STAGE_ID', 'Стадия', true, 'Например: PREPARATION', 'STRING'),
    ('9c00d48f-de4d-4710-bc58-eb75238a45f0', 'CURRENCY_ID', 'Валюта', false, 'Например: EUR', 'STRING');
--     ('f1g2h3i4-5678-90ab-cdef-1234567890ab', 'OPPORTUNITY', 'Сумма', false, 'Числовое значение', 'NUMBER'),
--         ('g1h2i3j4-5678-90ab-cdef-1234567890ab', 'CONTACT_IDS', 'ID контактов', false, 'Массив ID контактов', 'ARRAY'),
--     ('h1i2j3k4-5678-90ab-cdef-1234567890ab', 'BEGINDATE', 'Дата начала', false, 'Формат ISO 8601', 'DATE'),
--     ('i1j2k3l4-5678-90ab-cdef-1234567890ab', 'CLOSEDATE', 'Дата завершения', false, 'Формат ISO 8601', 'DATE'),
--     ('j1k2l3m4-5678-90ab-cdef-1234567890ab', 'CONTACT_ID_ITEM', 'ID контакта', false, 'Один ID контакта', 'NUMBER'),
--         ('k1l2m3n4-5678-90ab-cdef-1234567890ab', 'IS_RECURRING', 'Повторяющаяся', false, 'Y/N', 'BOOLEAN'),
--     ('l1m2n3o4-5678-90ab-cdef-1234567890ab', 'OPENED', 'Открыта', false, 'Y/N', 'BOOLEAN');

-- Связываем с FIELDS
INSERT INTO input_parameter_spec (input_parameter_id, spec_id)
VALUES
    ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'b1c2d3e4-5678-90ab-cdef-1234567890ab'),
    ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'c1d2e3f4-5678-90ab-cdef-1234567890ab'),
    ('a1b2c3d4-5678-90ab-cdef-1234567890ab', '17128338-e799-49d7-a952-62d911b81fad'),
    ('a1b2c3d4-5678-90ab-cdef-1234567890ab', '9c00d48f-de4d-4710-bc58-eb75238a45f0');
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'f1g2h3i4-5678-90ab-cdef-1234567890ab'),
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'g1h2i3j4-5678-90ab-cdef-1234567890ab'),
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'h1i2j3k4-5678-90ab-cdef-1234567890ab'),
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'i1j2k3l4-5678-90ab-cdef-1234567890ab'),
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'j1k2l3m4-5678-90ab-cdef-1234567890ab'),
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'k1l2m3n4-5678-90ab-cdef-1234567890ab'),
--     ('a1b2c3d4-5678-90ab-cdef-1234567890ab', 'l1m2n3o4-5678-90ab-cdef-1234567890ab');



