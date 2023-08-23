
SELECT first_name,last_name FROM author
WHERE id = 
(
	SELECT id FROM book 
	WHERE title = 'Abe Lincoln in Illinois'
);
-- yukarıdaki örnekte alt sorgudan tek bir cevap döndüğü için sorun olmadı.
-- ancak aşağıdaki örnekteki gibi alt sorgudan birdan fazla cevap içeren sonuç döneceği zaman hata alırız
-- bu hatayı çözmek içinde aşağıdaki örnekteki gibi 'ANY' parametresi girilebilir. 
-- ANY'de herhangi bir sonuç ile eşleşmesi yeterli
SELECT first_name,last_name FROM author
WHERE id = ANY
(
	SELECT id FROM book 
	WHERE title = 'Abe Lincoln in Illinois' OR title = 'Saving Shiloh'
);

-- ALL da ise tüm kayıtlar ile eşleşip, eşleşmediğine bakar.
SELECT first_name,last_name FROM author
WHERE id > ANY
(
	SELECT id FROM book 
	WHERE title = 'Abe Lincoln in Illinois' OR title = 'Saving Shiloh'
);
