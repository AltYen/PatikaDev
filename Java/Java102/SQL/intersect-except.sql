(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10)
INTERSECT -- intersect 2 sorgu içindeki keşisen kayıtları alır.
(SELECT * FROM book
ORDER BY title
LIMIT 10);

/*
(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10)
UNION
(SELECT * FROM book
ORDER BY title
LIMIT 10);
*/

(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 5)
EXCEPT -- 1. Sorguda olan ancak 2. sorguda olmayan verileri sıralar.
(SELECT * FROM book
ORDER BY title
LIMIT 5);

(SELECT * FROM book
ORDER BY page_number DESC
LIMIT 10)
EXCEPT -- 1. Sorguda olan ancak 2. sorguda olmayan verileri sıralar.
(SELECT * FROM book
ORDER BY title
LIMIT 10);

-- uniondaki eşit sutun sayısı ve aynı veri tipi koşulu, except ve intersect içinde geçerlidir.