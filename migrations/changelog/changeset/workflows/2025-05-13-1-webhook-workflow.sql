-- 1. Создаем рабочее пространство

insert INTO workspace (id,description,favorite,last_edit,"name",workspace_icon_path) VALUES
	 ('a95b051e-702f-40e3-b71d-cc5a84656581'::uuid,'Битрикс Автоматизация',true,'2025-04-15 18:21:34.048','Test',2,'string');


INSERT INTO folder (id,"name",parent_folder_id,workspace_id) VALUES
	 ('8e8bf041-f690-4abe-889e-8d990ecb51ac'::uuid,'CRM Автоматизация',NULL,'a95b051e-702f-40e3-b71d-cc5a84656581'::uuid);


INSERT INTO workflow (id,created,created_by_user_id,description,"enable",execution_count,is_archived,last_edit,last_execution,"name","interval",once_running_date,scheduled_type,"time",updated_by_user_id,folder_id,last_polling_time) VALUES
	 ('ed4a7ff3-7085-4c94-9ce0-4248577b2c26','2025-04-15 18:22:15.685009+03',NULL,'Автоматическое создание задачи при новой сделке',false,0,false,'2025-04-15 18:22:15.685024+03',NULL,'Тестовый процесс БИТРИКС. Не трогать',NULL,NULL,NULL,NULL,NULL,'8e8bf041-f690-4abe-889e-8d990ecb51ac',NULL);

INSERT INTO step (id,x,y,parameters_configuration,"source","type") VALUES
	 ('71015fe3-4bb7-4555-9c1d-700e6ca98071',0.0,0.0,'{"connectionId": "d248064a-46ab-4565-a882-2bb9237d28fc"}','bitrix:ONCRMDEALADD','TRIGGER_WEBHOOK'),
	 ('a69e6f18-40be-4edd-997c-236276585540',1.1,1.1,'{"FIELDS": {"TITLE": "test"}, "connectionId": "d248064a-46ab-4565-a882-2bb9237d28fc"}','bitrix:create_deal','ACTION'),
	 ('dccd158f-ff0a-4223-979c-367f7054b837',2.2,2.2,'{"fields": {"TITLE": "Новая задача", "CREATED_BY": 1, "RESPONSIBLE_ID": 1}, "connectionId": "d248064a-46ab-4565-a882-2bb9237d28fc"}','bitrix:tasks.task.add','ACTION');

INSERT INTO workflow_step_mapping (workflow_id,step_id) VALUES
	 ('ed4a7ff3-7085-4c94-9ce0-4248577b2c26','71015fe3-4bb7-4555-9c1d-700e6ca98071'),
	 ('ed4a7ff3-7085-4c94-9ce0-4248577b2c26','a69e6f18-40be-4edd-997c-236276585540'),
	 ('ed4a7ff3-7085-4c94-9ce0-4248577b2c26','dccd158f-ff0a-4223-979c-367f7054b837');
