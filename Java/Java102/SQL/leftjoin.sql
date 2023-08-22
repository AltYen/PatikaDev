--author tablo 1 book tablo 2 oluyor
--left joinde 1 tablodaki ve 1 ve 2. tablonun keşimini göster demek.
--yani tüm yazarları getir ve eşleşme olan veya olmayanda tüm kitap isimlerini getir, eşleşme yoksa null yazar.
-- kısaca kitabı olsun yada olmasın tüm yazarları getir.
SELECT author.first_name, author.last_name,book.title  FROM author 
LEFT JOIN book ON author.id = book.author_id
WHERE book.id IS NOT NULL -- null değerleri hiç göstermemesini sağlama.
ORDER BY book.title;

--left join simetrik değildir.
--book tablosundaki tüm verileri al, eşleşen yazarları getir, eşleşmeyenlere null ver.
--önce book tablosundan tüm verileri al,yazar tablosundaki veriye eşlemeye çalış,eşlemediği yerde null yazacak.
SELECT first_name, last_name,title  FROM book 
LEFT JOIN author ON author.id = book.author_id;

ALTER TABLE book
DROP CONSTRAINT book_author_id_fkey; -- book_author_id_fkey isimli kısıtlamayı kaldırma

INSERT INTO book(title,page_number,author_id)
VALUES
	('Gulun Adı',466,44),
	('Yapay Zeka', 108,55);
