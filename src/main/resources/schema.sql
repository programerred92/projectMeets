CREATE TABLE meet (
    id BIGINT PRIMARY KEY,
    topic VARCHAR(128) NOT NULL,
    date DATETIME NOT NULL
);

CREATE TABLE people (
    id BIGINT PRIMARY KEY,
    username VARCHAR(23) NOT NULL,
    name VARCHAR(23) NOT NULL,
    lastname VARCHAR(23) NOT NULL,
    country VARCHAR(23) NOT NULL,
    pass VARCHAR(23) NOT NULL,
    role VARCHAR(23) NOT NULL
);

CREATE TABLE assistant (
    meet_id BIGINT,
    people_id BIGINT,
    PRIMARY KEY (meet_id, people_id),
    FOREIGN KEY (meet_id) REFERENCES meet(id),
    FOREIGN KEY (people_id) REFERENCES people(id)
);