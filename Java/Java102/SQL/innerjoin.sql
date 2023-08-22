-- book ve author tablolarını author_id'ye göre birleştirip, title, first_name ve last_name sutunlarını gösterme
SELECT title, first_name, last_name FROM book 
INNER JOIN author ON book.author_id = author.id; -- ON dan sonrası eşleştirme yöntemine giriyor burada, author_idleri eşleşenleri demişiz.

-- sadece JOIN yazıldığı zamanda INNER JOIN olarak işlem yapar.

-- buda farklı bir tanımlama
SELECT book.title, author.first_name, author.last_name FROM book 
INNER JOIN author ON book.author_id = author.id;

-- inner join simetrik bir yapıya sahip
SELECT book.title, author.first_name, author.last_name FROM author 
INNER JOIN book ON book.author_id = author.id;

/*
SELECT Products.ProductName, Categories.CategoryName FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
*/

