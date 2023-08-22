SELECT rental_rate, COUNT(*) FROM film
GROUP BY rental_rate
HAVING COUNT(*) > 325; -- having gruplanmış verilere koşul eklemeye yarar. burada unique rental_ratelere ait film sayısını bulup, 325'ten fazla olan rental_rate grubunu getirir.

--where satır bazlı filtre, having group bazlı filtre uygular.
-- üstteki sorgu ile aynı sonucu döndürür ama biz hangi rental_rate i almamamızı gerektğini bildiğimzi için
SELECT rental_rate, COUNT(*) FROM film
WHERE rental_rate != 2.99;
GROUP BY rental_rate;

SELECT COUNT(*) FROM payment;

SELECT staff_id, COUNT(*) FROM payment
GROUP BY staff_id --staff_id'ye ait satiş grupları
HAVING COUNT(*) > 7300; -- count 7300 üstü olan grupları göster.

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100 -- alışveris toplamı 100 den fazla olan customer_idleri getir.
ORDER BY SUM(amount) DESC -- yüksekten alçağa sırala
LIMIT 1; --ilk kaydı getir.

--satır bazlı koşulda where, group bazlı koşulda having


