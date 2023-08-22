-- full joinde tablo 1 ve 2 deki tüm değerler alınır. eşleşmeyen ifadelere null konulur.
-- önce kitap tablosundan veriler alınıyor. sonra yazar tablosundaki veriler ile eşleştiriliyor. eşleşmeyenler durumda null yerleştiriliyor.
SELECT author.first_name, author.last_name, book.title FROM book 
FULL JOIN author ON author.id = book.author_id;

-- tablo 1 ve tablo 2 yer değiştiğinde sadece yazdırılan sutun sırası değişiyor.
--simetrik yapıya sahip
SELECT * FROM author 
FULL JOIN book ON author.id = book.author_id;

SELECT * FROM author 
FULL JOIN book ON author.id = book.author_id
WHERE (book.id IS NOT NULL AND author.id IS NOT NULL); -- tüm eşleşenleri getir, kısaca inner join

-- üstteki sorgunun inner join hali
SELECT * FROM book
INNER JOIN author ON author.id = book.author_id;

-- tablolardaki ortak olmayan tüm kayıtları getir.
SELECT * FROM author 
FULL JOIN book ON author.id = book.author_id
WHERE (book.id IS NULL OR author.id IS NULL); 
