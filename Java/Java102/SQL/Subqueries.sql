SELECT * FROM book
WHERE page_number > 466;

SELECT page_number FROM book
WHERE title = 'Gulun Adı';

-- bir sorgudan dönen sonuca göre başka bir sonucun filtrelenmesi yani subqueries
-- ÖNCE page_number > (sql sorgusu) buradaki parantez içindeki sql sorgusu çalışır bunun dönen sonucundada page_number > result sorgusu çalışır.
SELECT * FROM book
WHERE page_number > 
(
SELECT page_number FROM book
WHERE title = 'Gulun Adı'
);

SELECT * FROM book
WHERE page_number > 
(
SELECT AVG(page_number) FROM book
);


-- (SELECT MAX(page_number) FROM book) => bu subqueri ile tüm kayıtlarda max isimli sutunde en yüksek sayfa sayısının yazılması sağlandı.
-- (SELECT MAX(page_number) FROM book) - page_number AS diffrent => burada tüm kayıtlarda diffrent isimli sutunda; en yüksek sayfa sayısından o anki kayıttaki sayfa sayısını çıkartıp, arasındaki farkı yazdırmış olduk.
SELECT title,(SELECT MAX(page_number) FROM book),page_number,(SELECT MAX(page_number) FROM book) - page_number AS diffrent
FROM book
WHERE page_number > 
(
	SELECT page_number FROM book
	WHERE title='Gulun Adı'
);

