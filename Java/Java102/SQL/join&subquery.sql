-- önce ortalama sayfa sayısını buluyoruz(subquery), sonra ortalamadan fazla kitap isimlerini gösteriyoruz(select),sonra join yardımıyla yazarların isim soyisimlerini yazıyoruz.
SELECT author.first_name,author.last_name,book.title,book.page_number FROM author
INNER JOIN book ON book.author_id = author.id
WHERE page_number > 
(
	SELECT AVG(page_number) FROM book
);


-- bu örnekte 2 adet iç içe inner join kullandık çünkü actor ile film arasındaki tabloda direk bağlantı yok ara bir film_actor isimli tablo var.
SELECT actor.first_name,actor.last_name,film.title,film.length FROM actor
INNER JOIN film_actor ON actor.actor_id = film_actor.actor_id
INNER JOIN film ON film.film_id = film_actor.film_id
WHERE film.length = 
(
	SELECT MAX(length) FROM film
);