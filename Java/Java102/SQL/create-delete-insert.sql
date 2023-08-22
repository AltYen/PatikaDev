/*
CREATE TABLE <table_name> (
	<column_name> <data_type> <constraint>,
	...
    <column_name> <data_type> <constraint>
);
*/

-- serial veri tipi otamatik olarak artar
-- primary key unique identifier
-- NOT NULL boş olamaz.
-- sutun ismi - veri tipi - kısıtlamalar
CREATE TABLE author (
	id SERIAL PRIMARY KEY, -- serial zaten int tipi ekstra olarak otomatik artıyor.
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(50),
	birthday DATE
);

INSERT INTO author(first_name,last_name,email,birthday) -- id serial olarak oluşturduğumuz için burada vermemize gerek yok.
VALUES
	('Haruki','Murakami','haruki@murakami.com','1948-11-07'), -- tarihler yazarken date tipinde ise önce yıl-ay-gün
	('Sabahattin','Ali','sabahattin@ali.com','1914-07-11'),
	('Orhan','Pamuk','orhan@pamuk.com','1950-04-14'),
	('Halide Edip','Adıvar','halide@edip.com','1884-07-11'),
	('Zygmunt','Bauman','zygmunt@ali.com','1911-07-12');
	
SELECT * FROM author;

CREATE TABLE author2 (LIKE author); -- author tablosunu temel olarak yeni bir author2 isimli tablo oluşturma, verileri aktarmaz.

INSERT INTO author2
SELECT * FROM author
WHERE first_name = 'Sabahattin'; -- author2 tablosuna, author tablosundan first_name'i Sabahattin olan kayıtları ekleme.

SELECT * FROM author2;

CREATE TABLE author3 AS -- verileriyle beraber bir tabloyu tamamen kopyalamak için kullanılan yöntem.
SELECT * FROM author;

SELECT * FROM author3;

DROP TABLE author4;
DROP TABLE IF EXISTS author3; -- Tablo silme komutu, Ayrıca buradaki IF EXISTS eğer varsa silmi işlemi yap gibi bir anlam katıyor.
DROP TABLE author2;
