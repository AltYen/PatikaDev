package Collections.FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {

    public static void main(String[] args) {
        /*
            Örnek İşleyiş senaryosu

            1.shuffle işlemlerinden sonra teams = [FB,GS,BJK,TS] olduğunu varsayalım.
            2.matchList isimli bir arraylist oluşturuyoruz.
            3.ilk yarıda oynanacak hafta sayısını buluyoruz.
            4.ardından ilk yarıdaki oynanacak hafta sayısını 2 ile çarpıp(Toplam Hafta sayısı), toplam oynanacak hafta sayısı ile bir for döngüsü oluşturuyoruz;
            5.ilk yarıdaki hafta sayısından küçük ve eşit olduğu sürece generateHomeMatches methodu çağırılır, büyük olduğunda generateAwayMatches methodu çağırılır.;
            5.buradaki herhangi biri tamamlandıktan sonra rotateTeams methodu çalışır.
            6.döngü bittikten sonrada printMatches methodu çağrılır.


            generateHomeMatches methodu kısaca ilk ve son elemanı seç, ardından ilk + 1 ve son - 1 . elemanı seç şeklinde ilerler.
            generateAwayMatches methodu ise son ve ilk elemanı seç, ardından son-1, ilk+1 . elemanı seç şeklinde ilerler.

            rotateTeams methodu takımların sırasını değiştirmek için kullanılır. her girdiğinde sonuncu elemanı, 1.indexe yerleştirip, takımların 1'er sıra kaymasını sağlar.

            ----
            For döngüsü örnek senaryo

            --- toplam hafta sayısı 6

            i=1 | teams = [FB,GS,BJK,TS]
                generateHomeMatches methoduna gider.
                method sonucunda, FB VS TS | GS VS BJK maçlarını listeye ekler.
                döngüdeki rotateTeams çalışır
                Eski teams = [FB,GS,BJK,TS] | Yeni teams = [FB,TS,GS,BJK]

            i=2 | teams = [FB,TS,GS,BJK]
                generateHomeMatches methoduna gider.
                method sonucunda, FB VS BJK | TS VS GS maçlarını listeye ekler.
                döngüdeki rotateTeams çalışır
                Eski teams = [FB,TS,GS,BJK] | Yeni teams = [FB,BJK,TS,GS]

            i=3 | teams = [FB,BJK,TS,GS]
                generateHomeMatches methoduna gider.
                method sonucunda, FB VS GS | BJK VS TS maçlarını listeye ekler.
                döngüdeki rotateTeams çalışır
                Eski teams = [FB,BJK,TS,GS] | Yeni teams = [FB,GS,BJK,TS]
                böylelikle teams ilk haline dönmüş olur.

            ---- Buradan sonra kısaca, ilk yarıda oynanan maçların tam tersini yazma işlemi yapıyoruz.

            i=4 | teams = [FB,GS,BJK,TS]
                generateAwayMatches methoduna gider.
                method sonucunda, TS VS FB | BJK VS GS maçlarını listeye ekler.
                döngüdeki rotateTeams çalışır
                Eski teams = [FB,GS,BJK,TS] | Yeni teams = [FB,TS,GS,BJK]

            i=5 | teams = [FB,TS,GS,BJK]
                generateAwayMatches methoduna gider.
                method sonucunda, BJK VS FB | GS VS TS maçlarını listeye ekler.
                döngüdeki rotateTeams çalışır
                Eski teams = [FB,TS,GS,BJK] | Yeni teams = [FB,BJK,TS,GS]

            i=6 | teams = [FB,BJK,TS,GS]
                generateAwayMatches methoduna gider.
                method sonucunda, GS VS FB | TS VS BJK maçlarını listeye ekler.
                döngüdeki rotateTeams çalışır
                Eski teams = [FB,BJK,TS,GS] | Yeni teams = [FB,GS,BJK,TS]
                böylelikle teams ilk haline dönmüş olur.

            --- toplam hafta sayısı = i olduğu için kırılıp yazma methodunu çalıştırır.


         */

        String[] team = {
                "Galatasaray",
                "Fenerbahçe",
                "Beşiktaş",
                "Trabzonspor",
                "Bursaspor",
                "Alanyaspor",
                "Gaziantep FK",
                "Kasımpaşa",
                "Hatayspor",
                "Antalyaspor",
                "Sivasspor",
                "Kayserispor",
                "Rizespor",
                "Ankaragücü",
                "Gençlerbirliği",
                "Malatyaspor",
                "Göztepe",
                "Erzurumspor",
                "Konyaspor",
                "Denizlispor"
        };

        List<String> teams = new ArrayList<>();
        for(String s:team){
            teams.add(s);
        }

        if(teams.size() % 2 == 1){
            teams.add("Bay");
        }

        Collections.shuffle(teams);
        Collections.shuffle(teams);

        int rounds = teams.size() - 1;

        List<String> matchList = new ArrayList<>();

        /*
        Bu döngü, toplam maç turu sayısının iki katı kadar dönecektir. Her turda, hem evde hem de deplasmanda oynanacak maçları oluşturur.
         */
        for (int round = 1; round <= rounds * 2; round++) {
            /*
            Turun ilk yarısında (round <= rounds), generateHomeMatches fonksiyonunu çağırarak evdeki maçları oluşturur.
            Turun ikinci yarısında ise (round > rounds), generateAwayMatches fonksiyonunu çağırarak deplasmandaki maçları oluşturur.
             */
            if (round <= rounds) {
                generateHomeMatches(teams, matchList);
            } else {
                generateAwayMatches(teams, matchList);
            }
            /*
            Her turun sonunda, takımları döndürmek için rotateTeams fonksiyonunu çağırır.
            Bu işlem, takımları bir sonraki tura hazırlar. Takımların sıralaması değiştirilir, böylece her turda farklı maçlar oluşturulur.
             */
            rotateTeams(teams);
        }

        printMatches(matchList, teams.size());
    }

    public static void generateHomeMatches(List<String> teams, List<String> matchList) {
        int halfSize = teams.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            String team1 = teams.get(i);
            String team2 = teams.get(teams.size() - 1 - i);
            matchList.add(team1 + " vs " + team2);
        }
    }

    public static void generateAwayMatches(List<String> teams, List<String> matchList) {
        int halfSize = teams.size() / 2;
        for (int i = halfSize - 1; i >= 0; i--) {
            String team1 = teams.get(teams.size() - 1 - i);
            String team2 = teams.get(i);
            matchList.add(team1 + " vs " + team2);
        }
    }

    public static void rotateTeams(List<String> teams) {
        String lastTeam = teams.remove(teams.size() - 1);
        teams.add(1, lastTeam);
    }

    public static void printMatches(List<String> matchList, int numberOfTeams) {
        int week = 1;
        int matchesPerWeek = numberOfTeams / 2;
        for (int i = 0; i < matchList.size(); i += matchesPerWeek) {
            System.out.println("############################################");
            System.out.println("------------------" + week + ". Week-------------------");
            for (int j = 0; j < matchesPerWeek; j++) {
                String match = matchList.get(i + j);
                String[] parts = match.split(" vs ");
                System.out.println("\t\t  "+parts[0] + " - " + parts[1]);
            }
            System.out.println("--------------------------------------------");
            System.out.println("############################################");
            week++;
        }
    }
}
