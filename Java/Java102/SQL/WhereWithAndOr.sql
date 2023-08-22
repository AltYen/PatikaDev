/*
-- and için kendinden önceki ve sonraki koşulu sağlaması lazım. or için yeni bir query başlıyormuş gibi düşünmeliyiz.
SELECT first_name,last_name FROM actor
WHERE first_name = 'Penelope' or first_name = 'Bob';

SELECT * FROM film
WHERE rental_rate = 4.99 and length > 90;

SELECT * FROM film
WHERE rental_rate = 4.99 AND rental_duration = 3 AND replacement_cost > 20;

SELECT * FROM film
WHERE replacement_cost < 12 OR replacement_cost > 25;

SELECT * FROM film
WHERE NOT rental_rate = 4.99; -- 4.99 olmayanları dön

SELECT * FROM film
WHERE NOT (rental_rate = 4.99 AND replacement_cost = 20.99); -- rental rate 4.99 ve replacement cost 20.99 olmayanları getir

SELECT * FROM film
WHERE NOT (NOT (rental_rate = 4.99 AND replacement_cost = 20.99)); -- rental rate 4.99 ve replacement cost 20.99 olanları getir. not not birbirlerini nötrler.

SELECT * FROM film
WHERE NOT NOT length > 110;

SELECT * FROM actor
WHERE first_name = 'Penelope' AND last_name = 'Monroe' OR first_name = 'Joe' AND last_name = 'Swankx'; --buradaki ordan itibaren yeni 0 bir sorgu başlıyormuş gibi düşünmeliyiz.
*/

SELECT * FROM actor
WHERE first_name = 'Penelope' AND last_name = 'Monroe' AND last_name = 'Swankx' OR first_name = 'Joe'; -- yalnızca ilk ismi joe olanları getirir.







