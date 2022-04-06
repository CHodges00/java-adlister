use adlister_db;

CREATE TABLE IF NOT EXISTS users(
    id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(25) DEFAULT 'NoName',
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(45),
    description VARCHAR(500)
);