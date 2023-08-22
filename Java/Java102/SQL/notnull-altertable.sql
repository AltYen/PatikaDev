CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(20),
	email VARCHAR(50),
	age INTEGER
);

SELECT * FROM users;

INSERT INTO users(username,email,age)
VALUES
	('Tester','tester@gmail.com',23);
	
INSERT INTO users(email,age) -- username null kabul eder.
VALUES
	('gamer@gmail.com',23);
	
DELETE FROM users -- user tablosunda username'i null olan tüm kayıtları silme komutu
WHERE username IS NULL
RETURNING *;

ALTER TABLE users -- var olan users tablosundaki username' sutununa NOT NULL koşulu ekleme
ALTER COLUMN username
SET NOT NULL;

INSERT INTO users(username,email,age) -- değerin '' ile null olması farklı durumdur.
VALUES
	('','tester@gmail.com',35);
	