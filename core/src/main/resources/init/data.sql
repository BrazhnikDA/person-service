insert into medical_card (id, client_status, med_status, registry_dt, comment) values (0, 'Wz', 'v3W', '2022/7/11', 'qgfMu');
insert into medical_card (id, client_status, med_status, registry_dt, comment) values (1, 'Wz', 'v3W', '2022/8/11', 'qgfMu');
insert into medical_card (id, client_status, med_status, registry_dt, comment) values (2, 'Wz', 'v3W', '2022/9/11', 'qgfMu');
insert into medical_card (id, client_status, med_status, registry_dt, comment) values (3, 'Wz', 'v3W', '2022/10/15', 'qgfMu');
insert into medical_card (id, client_status, med_status, registry_dt, comment) values (4, 'Wz', 'v3W', '2022/7/17', 'qgfMu');
insert into medical_card (id, client_status, med_status, registry_dt, comment) values (5, 'Wz', 'v3W', '2022/7/21', 'qgfMu');

insert into contact(id, phone_number, email, profile_link) values (0, '+79065554678', 'email@yandex.ru', 'https://profile_link.com');
insert into contact(id, phone_number, email, profile_link) values (1, '+79065554678', 'email@yandex.ru', 'https://profile_link.com');
insert into contact(id, phone_number, email, profile_link) values (2, '+79065554678', 'email@yandex.ru', 'https://profile_link.com');
insert into contact(id, phone_number, email, profile_link) values (3, '+79065554678', 'email@yandex.ru', 'https://profile_link.com');
insert into contact(id, phone_number, email, profile_link) values (4, '+79065554678', 'email@yandex.ru', 'https://profile_link.com');
insert into contact(id, phone_number, email, profile_link) values (5, '+79065554678', 'email@yandex.ru', 'https://profile_link.com');

insert into illnes(id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) values (0, 0, 0, 'b', '2022-10-21 10:37:22', '2022-10-20');
insert into illnes(id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) values (1, 1, 1, 'b', '2022-10-21 10:37:22', '2022-10-20');
insert into illnes(id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) values (2, 2, 2, 'b', '2022-10-21 10:37:22', '2022-10-20');
insert into illnes(id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) values (3, 3, 3, 'b', '2022-10-21 10:37:22', '2022-10-20');
insert into illnes(id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) values (4, 4, 4, 'b', '2022-10-21 10:37:22', '2022-10-20');
insert into illnes(id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) values (5, 5, 5, 'b', '2022-10-21 10:37:22', '2022-10-20');

insert into address(id, contact_id, country_id, city, index, street, building, flat) VALUES (0, 0, 0, 'Moscow', 352, 'Pushkina', '25B', 'f');
insert into address(id, contact_id, country_id, city, index, street, building, flat) VALUES (1, 1, 1, 'Moscow', 352, 'Pushkina', '25B', 'f');
insert into address(id, contact_id, country_id, city, index, street, building, flat) VALUES (2, 2, 2, 'Moscow', 352, 'Pushkina', '25B', 'f');
insert into address(id, contact_id, country_id, city, index, street, building, flat) VALUES (3, 3, 3, 'Moscow', 352, 'Pushkina', '25B', 'f');
insert into address(id, contact_id, country_id, city, index, street, building, flat) VALUES (4, 4, 4, 'Moscow', 352, 'Pushkina', '25B', 'f');
insert into address(id, contact_id, country_id, city, index, street, building, flat) VALUES (5, 5, 5, 'Moscow', 352, 'Pushkina', '25B', 'f');

insert into person_data(id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (0, 'nameL', 'nameF', '2022-10-5', 32, 'm', 0, 0, null);
insert into person_data(id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (1, 'nameL', 'nameF', '2022-10-21', 32, 'm', 1, 1, 0);
insert into person_data(id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (2, 'nameL', 'nameF', '2022-10-21', 32, 'm', 2, 2, 1);
insert into person_data(id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (3, 'nameL', 'nameF', '2022-10-21', 32, 'm', 3, 3, 2);
insert into person_data(id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (4, 'nameL', 'nameF', '2022-10-21', 32, 'm', 4, 4, null);
insert into person_data(id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id) VALUES (5, 'nameL', 'nameF', '2022-10-21', 32, 'm', 5, 5, 3);