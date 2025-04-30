alter table if exists module_configuration add column provider_id uuid;

create table oauth2_provider (client_id varchar(255) not null, client_secret varchar(255) not null, code_uri varchar(255) not null, token_uri varchar(255) not null, id uuid not null, primary key (id));
create table provider (id uuid not null, auth_type varchar(255) not null check (auth_type in ('OAUTH2','BASIC','API_KEY')), name varchar(255) not null, primary key (id));

alter table if exists module_configuration add constraint FK31q2trig5oxwjikp39uwkwcka foreign key (provider_id) references provider;
alter table if exists oauth2_provider add constraint FKmovvxv2m5oud71uywmwyflhsr foreign key (id) references provider;