SELECT * FROM film
LIMIT 20; -- 20 adet veri getirir.

SELECT * FROM film
WHERE rental_rate = 4.99
ORDER BY length
LIMIT 10; -- rental_rate 4.99 olanlanları seçip, lenght'e göre sıralayıp, ardından sadece ilk 10 veriyi getir.

SELECT * FROM film
WHERE replacement_cost = 14.99 and rental_rate = 0.99
ORDER BY length DESC
LIMIT 7;

SELECT * FROM country
LIMIT 10;

SELECT * FROM country
OFFSET 6
LIMIT 4; -- buradaki offset ilk 6 veriyi geç anlamında, offset ile ilk 6 veriyi geç, limit ile de geriye kalan ilk 4'ü getir.

SELECT * FROM actor
WHERE first_name = 'Penelope'
ORDER BY last_name
OFFSET 2
LIMIT 1;







