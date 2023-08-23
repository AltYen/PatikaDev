SELECT Name FROM STUDENTS
WHERE Marks > 75
ORDER BY RIGHT(Name,3),ID;
-- buradaki ORDER BY RIGHT sayesinde bir varchardaki sondan kaç karaktere göre sıralayacağımızı seçebiliyoruz, bu örnekte sondan 3 karaktere göre sıralama demişiz.
-- eğer son 3 karakterde aynıysa o zaman idlerine göre sıralama yapacak.