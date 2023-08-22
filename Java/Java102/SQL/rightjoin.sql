-- right join önce tablo 2deki verilerin tamamını alır. sonra yazarlarla eşlesen kitap isimlerini alır, eşleşmeyenlere null verir.
SELECT first_name, last_name,title  FROM book 
RIGHT JOIN author ON author.id = book.author_id; -- RIGHT OUTER JOIN = RIGHT JOIN

-- üstteki sorgu ile aynı işi yapan left join
SELECT first_name, last_name,title  FROM author 
LEFT JOIN book ON author.id = book.author_id;

-- temelde left ve right birbirinin aynısını, tek fark tablo öncelik sıralarının değişmesi.
