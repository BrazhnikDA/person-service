INSERT INTO roles (role) VALUES ('ROLE_ADMIN');
INSERT INTO roles (role) VALUES ('ROLE_USER');

INSERT INTO users (login, password) VALUES ('admin', '$2a$10$q2e864w/cLPAQivGH8JjqeDmKfdzoVryRSeSZBqb8njOfKWue8mNa');
INSERT INTO users_roles VALUES (1 , 1);

INSERT INTO users (login, password) VALUES ('user', '$2a$12$p13WWXouJTuVzqtCaB2oOefY9wbRKr5mUoO4WiMockZDZTfCHiJDK');
INSERT INTO users_roles VALUES (2 , 1);

INSERT INTO users (login, password) VALUES ('admin32', '$2a$12$8NqOflwL3Gpx9kU2B541.uwFhttSihwMoS5CLlnUphLOn4HXdHcfS');
INSERT INTO users_roles VALUES (3 , 2);

INSERT INTO users (login, password) VALUES ('user44', '$2a$12$xxwiR8vOTde0LodO2jQcXe7OhI6sWNcCHUKRb0VEnv4FKHxG0BKFG');
INSERT INTO users_roles VALUES (4 , 1);

