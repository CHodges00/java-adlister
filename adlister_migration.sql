use adlister_db;


DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;



CREATE TABLE IF NOT EXISTS users(
    id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(25) DEFAULT 'NoName',
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);
ALTER TABLE users
    ADD UNIQUE (username, email);




CREATE TABLE IF NOT EXISTS ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(45),
    description VARCHAR(500),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);