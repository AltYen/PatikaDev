-- isminde en az 4 tane e veya E bulunan kaç film vardır?

SELECT COUNT(*) FROM film
WHERE title ILIKE '%e%e%e%e%';

-- kategori isimlerini ve kategori başına düşen film sayısını yaz.

SELECT category.name, COUNT(*) FROM category
INNER JOIN film_category ON category.category_id = film_category.category_id
INNER JOIN film ON film.film_id = film_category.film_id
GROUP BY category.name;

-- en çok film bulunan rating kategorisi nedir?

SELECT rating, COUNT(*) FROM film
GROUP BY rating
ORDER BY COUNT(*) DESC
LIMIT 1;

-- film tablosunda 'K' karakteri ile başlayan en uzun ve replacement cost en az olan 3 filmi sıralayınız

SELECT title, length, replacement_cost FROM film
WHERE title LIKE 'K%'
ORDER BY length DESC, replacement_cost
LIMIT 3;

-- en çok alışveriş yapan müşterinin adı nedir ? 

SELECT SUM(amount),customer.first_name,customer.last_name FROM payment
JOIN customer ON customer.customer_id = payment.customer_id
GROUP BY payment.customer_id,customer.first_name,customer.last_name
ORDER BY SUM(amount) DESC
LIMIT 1;