INSERT INTO users(username,email,age)
VALUES
	('gamer3','gamer3@gmail.com',-22);
	
ALTER TABLE users -- users tablosunda age sutununa 18 den büyük girme koşulu getirme
ADD CHECK(age>18);

INSERT INTO users(username,email,age)
VALUES
	('gamer4','gamer4@gmail.com',27);
	
SELECT * FROM users;

CREATE TABLE products (
    product_no integer,
    name text,
    price numeric CHECK (price > 0), -- price 0 dan büyük olmalı
    discounted_price numeric CHECK (discounted_price > 0), -- discounted_price 0 dan büyük olmalı
    CHECK (price > discounted_price) -- price, discounted_pricedan büyük olmalı.
);

INSERT INTO products (product_no,name,price,discounted_price) -- bu sorgu eklemez hata verir çünkü price, dpricedan büyük
VALUES
	(1,'test product',10,12);
	
INSERT INTO products (product_no,name,price,discounted_price) -- çalışmaz
VALUES
	(1,'test product',-10,12);
	
INSERT INTO products (product_no,name,price,discounted_price) -- çalışmaz
VALUES
	(1,'test product',10,-12);
	
INSERT INTO products (product_no,name,price,discounted_price)
VALUES
	(1,'test product',12,10);
	
SELECT * FROM products;
