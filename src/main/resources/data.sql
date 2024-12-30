INSERT INTO meet (id, topic, date) VALUES (1,'Progreso personal', '2023-06-12');
INSERT INTO meet (id, topic, date) VALUES (2,'Daily', '2023-08-15');
INSERT INTO meet (id, topic, date) VALUES (3,'Sprint review', '2023-09-20');

INSERT INTO people (id, name, lastname) VALUES (1,'Josefo', 'Pulgarin');
INSERT INTO people (id, name, lastname) VALUES (2,'Laura', 'Lorduy');
INSERT INTO people (id, name, lastname) VALUES (3,'Maria', 'Perez');
INSERT INTO people (id, name, lastname) VALUES (4,'Esteban', 'Lopez');
INSERT INTO people (id, name, lastname) VALUES (5,'Arturo', 'Niño');
INSERT INTO people (id, name, lastname) VALUES (6,'Isabella', 'Marin');

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