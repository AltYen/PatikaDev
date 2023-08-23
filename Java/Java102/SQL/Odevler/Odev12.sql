--1.
SELECT COUNT(*) AS "Ortalama Süreden Yüksek Film Sayısı" FROM film
WHERE length > 
(
	SELECT AVG(length) FROM film
);

--2.
SELECT COUNT(*) FROM film
WHERE rental_rate = 
(
	SELECT MAX(rental_rate) FROM film
);

--3.
SELECT * FROM film
WHERE rental_rate = 
(
	SELECT MIN(rental_rate) FROM film
) AND replacement_cost = 
(
	SELECT MIN(replacement_cost) FROM film
);

--4.
SELECT * FROM customer
WHERE customer_id = ANY
(
	SELECT customer_id FROM payment
	GROUP BY customer_id
	HAVING COUNT(*) = 
	(
		SELECT MAX(count) FROM (
			SELECT COUNT(*) FROM payment
			GROUP BY customer_id
		) AS "Count"
	)	
);