SELECT first_name AS isim,last_name AS soyisim FROM actor; -- burada as "x" yapısıyla sütun isimlerini geçiçi olarak değiştirebiliyoruz.

-- diğer bir yöntem
SELECT first_name isim,last_name soyisim FROM actor;

SELECT first_name AS "isim test",last_name AS "soyisim test" FROM actor; -- birden fazla kelime durumda " " işaretleri arasına yazılır.

SELECT COUNT(*) AS "aktor sayisi" FROM actor;

SELECT CONCAT(first_name, ' ', last_name) AS "Isim ve Soyisim" FROM actor; -- first_name ve last_name sutunlarini birleştirip, Isim ve Soyisim adlı sütun üzerinde gösterme
