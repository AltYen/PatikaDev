SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5;

SELECT * FROM book
ORDER BY title
LIMIT 5;


-- UNION birden fazla select sorgusu sonucunda oluşlan sonucları tek bir sorgu gibi göstermeye yarar.
-- SADECE UNION'da 2 sorgu içinde kesişen veri varsa sadece 1 defa yazar. ANCAK UNION ALL dersek kesişmeleride 2 DEFA YAZAR.
(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5)
UNION 
(SELECT * FROM book
ORDER BY title
LIMIT 5);

-- UNION ALL 2 sorguda keşisen veri olsa bile o kayıdı 2 defa yazar.
(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5)
UNION ALL
(SELECT * FROM book
ORDER BY title
LIMIT 5);

-- UNION sorgularında her 2 sorgu içinde seçeceğimiz sutun sayısı eşit olmalı, yoksa hata verir.
(SELECT id,email,first_name FROM author)
UNION 
(SELECT id,title FROM book);

-- UNION sorgularında 2 sorgudaki indeteki veri tipleri aynı olmalı, aşağıdaki örnekte email varchar, page_number integer olduğu için yine hata alırız. 2' verininde tipi aynı olmak zorunda.
-- Sutunların veri tipleride birbirleriyle uyumlu olmak zorunda.
(SELECT id,email FROM author)
UNION 
(SELECT id,page_number FROM book);