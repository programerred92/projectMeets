INSERT INTO meet (id, topic, date) VALUES (1,'Progreso personal', '2023-06-12');
INSERT INTO meet (id, topic, date) VALUES (2,'Daily', '2023-08-15');
INSERT INTO meet (id, topic, date) VALUES (3,'Sprint review', '2023-09-20');

INSERT INTO people (id,username, name, lastname, country, pass, role) VALUES (1,'Josh','Josefo', 'Pulgarin','Cordoba','1234','USER');
INSERT INTO people (id,username, name, lastname, country, pass, role) VALUES (2,'Lau','Laura', 'Lorduy','Medellin','1234','USER');
INSERT INTO people (id,username, name, lastname, country, pass, role) VALUES (3,'Mary','Maria', 'Perez','Bogota','1234','USER');
INSERT INTO people (id,username, name, lastname, country, pass, role) VALUES (4,'Teban','Esteban', 'Lopez','Cali','1234','ADMIN');
INSERT INTO people (id,username, name, lastname, country, pass, role) VALUES (5,'R2','Arturo', 'Niño','Quibdo','1234','USER');
INSERT INTO people (id,username, name, lastname, country, pass, role) VALUES (6,'Isa','Isabella', 'Marin','Barranquilla','1234','USER');

INSERT INTO assistant (meet_id, people_id) VALUES (1,2);
INSERT INTO assistant (meet_id, people_id) VALUES (1,3);
INSERT INTO assistant (meet_id, people_id) VALUES (1,4);
INSERT INTO assistant (meet_id, people_id) VALUES (2,2);
INSERT INTO assistant (meet_id, people_id) VALUES (2,1);
INSERT INTO assistant (meet_id, people_id) VALUES (2,5);
INSERT INTO assistant (meet_id, people_id) VALUES (2,3);
INSERT INTO assistant (meet_id, people_id) VALUES (3,4);
INSERT INTO assistant (meet_id, people_id) VALUES (3,5);
INSERT INTO assistant (meet_id, people_id) VALUES (3,6);