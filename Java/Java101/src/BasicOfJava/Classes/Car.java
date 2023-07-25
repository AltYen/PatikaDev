package BasicOfJava.Classes;

//Sınıflar nesneler üretip,oluşturabilmek için üretilmiş şablonlardır(Modellerdir).
//Nesneler bu şablonlardan üretilen fiziksel yapılardır.(Sınıflardan ürettiğimiz yapılara nesne denir.)
class Car {
    //Nitelikler değişkenler ile belirlenir. Değişkenler sınıfın en başında tanımlanır.
    String type = "Sedan";
    String model;
    String color;
    int speed;
    int speedLimit=180;

    //Davranışlar(Methodlar)
    void increaseSpeed(int increment){
        if((speed+increment)<speedLimit){
            speed+=increment;
        }else{
            speed=speedLimit;
            System.out.println("Maksimum Hıza ulaştınız " + speed );
        }
    }

    void decreaseSpeed(int decrease){
        if(speed>0){
            speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println(model + " Hızınız : " + speed);
    }

}
