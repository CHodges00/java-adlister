use adlister_db;

INSERT INTO users(username, email, password)
VALUES ( 'iROWurBOAT', 'dgidhui7@yahoo.com', '4495')
;


INSERT INTO ads (user_id, title, description)
VALUES ( 1, 'Couch', 'Buy now $599')
;

DESCRIBE users;
DESCRIBE ads;


SELECT * FROM users;
SELECT * FROM ads;