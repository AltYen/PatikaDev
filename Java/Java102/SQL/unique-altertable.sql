INSERT INTO users(username,email,age) 
VALUES
	('tester2','tester@gmail.com',44);
	
SELECT * FROM users;

ALTER TABLE users -- var olan users tablosundaki email sutunundaki kayıtlara unique(benzersiz) olma koşulunu ekleme
ADD UNIQUE(email);

