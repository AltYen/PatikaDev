SELECT MAX(length) FROM film;

SELECT MAX(length) FROM film -- 2 adet degisken yazılabilir ya group by da kullanılan sutun ismi ya da bir aggregate fonksiyon 
WHERE rental_rate = 0.99; 

SELECT rental_rate, MAX(length) FROM film
GROUP BY rental_rate; -- tablodaki benzersiz rental_ratelere ait en uzun uzunluğu bulma.

SELECT rental_rate, COUNT(*) FROM film
GROUP BY rental_rate; -- tablodaki benzersiz rental_ratelere ait film sayısı

SELECT rating, COUNT(*) FROM film
GROUP BY rating; -- ratinglere ait film sayısı


SELECT replacement_cost, MIN(length) FROM film
GROUP BY replacement_cost; -- her farklı replacement_costa karşılık gelen en kısa film

SELECT replacement_cost,rental_rate,MIN(length) FROM film
GROUP BY replacement_cost,rental_rate; -- replacement_cost ve rental_rate'e göre en kısa uzunluğu gruplama

SELECT replacement_cost,rental_rate,MIN(length) FROM film
GROUP BY replacement_cost,rental_rate
ORDER BY replacement_cost, rental_rate DESC;

SELECT replacement_cost,rental_rate,MIN(length) FROM film
GROUP BY replacement_cost,rental_rate
ORDER BY MIN(length); -- en kısa süreye göre sıralama

SELECT replacement_cost,rental_rate,MIN(length) FROM film
GROUP BY replacement_cost,rental_rate
ORDER BY MIN(length)
LIMIT 8;


