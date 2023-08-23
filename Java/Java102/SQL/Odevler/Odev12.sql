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
-- en çok işlem yapan müşterileri yazma,
SELECT * FROM customer
WHERE customer_id = ANY
(
	SELECT customer_id FROM payment
	GROUP BY customer_id
	HAVING COUNT(*) = 
	(
		SELECT MAX(Count) FROM (
			SELECT COUNT(*) FROM payment
			GROUP BY customer_id
		) AS "Count"
	)	
);

-- müşterileri işlem sayısına göre büyükten küçüğe sıralama
SELECT first_name,last_name,COUNT(*) FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY customer.first_name,customer.last_name
ORDER BY COUNT(*) DESC;