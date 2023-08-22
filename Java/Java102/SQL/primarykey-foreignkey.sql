CREATE TABLE book( 
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author(id) --foreign key oluşturma yöntemi. author_id sutununu author tablosundaki id sutununa references gösterdik.
);


-- insert into book (title, page_number, author_id) values ('White Banners', 62, 99999); bu satırı çalıştırmayı denediğimizde hata alırız çünkü author_idye 99999 değeri verilmiş ancak bu değer author tablosundaki id sutununda bulunmadığı için hata verir.

insert into book (title, page_number, author_id) values ('White Banners', 62, 1); 
insert into book (title, page_number, author_id) values ('Saving Shiloh', 580, 10); 
insert into book (title, page_number, author_id) values ('Abe Lincoln in Illinois', 105, 7); 
insert into book (title, page_number, author_id) values ('Apache Territory', 286, 1);  
insert into book (title, page_number, author_id) values ('Out 1: Spectre', 402, 9);
insert into book (title, page_number, author_id) values ('Trials of Muhammad Ali, The', 164, 5);
insert into book (title, page_number, author_id) values ('B.U.S.T.E.D (Everybody Loves Sunshine) (Busted)', 84, 10); 
insert into book (title, page_number, author_id) values ('Father Sergius (Otets Sergiy)', 265, 9);
insert into book (title, page_number, author_id) values ('It Started in Naples', 838, 8);
insert into book (title, page_number, author_id) values ('Thirty Seconds Over Tokyo', 586, 1);
insert into book (title, page_number, author_id) values ('Return to Homs, The', 588, 9); 
insert into book (title, page_number, author_id) values ('Cutie Honey', 788, 8); 
insert into book (title, page_number, author_id) values ('Jackass 3.5', 834, 1);
insert into book (title, page_number, author_id) values ('Baby On Board', 339, 7);
insert into book (title, page_number, author_id) values ('Making Plans for Lena (Non ma fille, tu n''iras pas danser)', 375, 7);

SELECT * FROM book;

-- primary key o satır için benzersiz olmalı, bir tabloda sadece 1 tane primary key sutunu olabilir
-- primary key değerleri değiştirilemez, genelde id ismi verilir.
-- foreign key referans belirtir, bu sayede tablolar arasında ilişki belirtir.
-- foreign keyde unique olma zorunluluğu yok. buradaki duruma örnek olarak bazı kitaplar aynı yazarlar tarafından yazılmış olabilir.
-- foreign key referans aldığı yerdeki değer aralığında olmak zorunda. referans aldığı yerdeki değerler 1 den 100'e kadarsa foreign keydeki değerlerde 1-100 arasında olmak zorunda
-- foreign keyler satır bazında değiştirilebilir.

SELECT * FROM book
WHERE author_id = 1;

SELECT * FROM book
JOIN author ON author.id = book.author_id; -- kitap tablosundaki id ile yazar tablosunda idleri eşleştirip, tabloları birleştirme işlemi





