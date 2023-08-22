SElECT title,length FROM film
WHERE length >= 90 AND length <= 120;
-- yukarıdaki kod ile aynı işlemi yapıyor.
SElECT title,length FROM film
WHERE length BETWEEN 90 and 120; --sınır değerleri dahil.

SElECT title,length FROM film
WHERE length NOT BETWEEN 90 and 120; -- not betweende sınırlar dahil değil.

SElECT rental_rate, replacement_cost FROM film
WHERE (rental_rate BETWEEN 2 and 4) AND (replacement_cost BETWEEN 10 and 20);

SELECT * FROM film
WHERE length IN (40, 50, 60); -- IN() içerisindeki 1'e1 aynı değerlere bakar.

SELECT * FROM film
WHERE replacement_cost NOT IN (10.99, 12.99, 16.99);








