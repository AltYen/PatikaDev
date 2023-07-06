# Proje 1

[22,27,16,2,18,6] -> Insertion Sort

- Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

    1. [22,27,16,2,18,6] => n
    2. [2,27,16,22,18,6] => 22 ile 2 değeri yer değiştirdi | (n-1)
    3. [2,6,16,22,18,27] => 27 ile 6 değeri yer değiştirdi | (n-2)
    4. [2,6,16,18,22,27] => 22 ile 18 değeri yer değiştirdi | 1

&NewLine;

- Big-O gösterimi 

    $\frac{{n*n+1}}{2}$ => $\frac{{n^{2}+n}}{2}$ => Big-O = O($n^{2}$)

- Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer?
    
    Average case: Aradığımız sayının ortada olması

---

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

1. [2,3,5,8,7,9,4,15,6] => 7 ile 2 değeri yer değiştirdi.
2. [2,3,4,8,7,9,5,15,6] => 5 ile 4 değeri yer değiştirdi.
3. [2,3,4,5,7,9,8,15,6] => 8 ile 5 değeri yer değiştirdi.
4. [2,3,4,5,6,9,8,15,7] => 7 ile 6 değeri yer değiştirdi.