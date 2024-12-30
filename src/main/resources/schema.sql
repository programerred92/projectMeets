CREATE TABLE meet (
    id BIGSERIAL PRIMARY KEY,
    topic VARCHAR(128) NOT NULL,
    date DATETIME NOT NULL
);

CREATE TABLE people (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(23) NOT NULL,
    lastname VARCHAR(23) NOT NULL
);

CREATE TABLE assistant (
    meet_id BIGSERIAL,
    people_id BIGSERIAL,
    PRIMARY KEY (meet_id, people_id),
    FOREIGN KEY (meet_id) REFERENCES meet(id),
    FOREIGN KEY (people_id) REFERENCES people(id)
);