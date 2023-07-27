package BasicOfJava.Classes.BoxingMatch;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2,int minWeight, int maxWeight){
         this.f1=f1;
         this.f2=f2;
         this.maxWeight=maxWeight;
         this.minWeight=minWeight;
    }

    void run(){
        if(isCheck()){
            //sonucu ne kadar döneceği bilinmediği için while döngüsü kullanılır.
            int whoStart = (int) (Math.random()*2) + 1;
            while (this.f1.health >= 0 && this.f2.health>0){
                System.out.println("======YENI ROUND======");
                if(whoStart==1){
                    this.f2.health=this.f1.hit(f2); // hit metodunun içerisine rakip nesneyi attık. f1 dövüşçüsü f2 dövüşcüne vurup f2 nin yeni sağlığını yeniden f2 nesnesine atadık.
                    if(isWin())
                        break;
                    this.f1.health=this.f2.hit(f1);
                    if(isWin())
                        break;
                }else{
                    this.f1.health=this.f2.hit(f1);
                    if(isWin())
                        break;
                    this.f2.health=this.f1.hit(f2);
                    if(isWin())
                        break;
                }

                System.out.println(this.f1.name + " Saglik : " + this.f1.health);
                System.out.println(this.f2.name + " Saglik : " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " Kazandı !");
            return true;
        }

        if(this.f2.health == 0){
            System.out.println(this.f1.name + " Kazandı !");
            return true;
        }

        return false;
    }
}
