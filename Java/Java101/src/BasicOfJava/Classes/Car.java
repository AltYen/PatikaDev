package BasicOfJava.Classes;

//Sınıflar nesneler üretip,oluşturabilmek için üretilmiş şablonlardır(Modellerdir).
class Car {
    //Nitelikler değişkenler ile belirlenir. Değişkenler sınıfın en başında tanımlanır.
    String type;
    String model;
    String color;
    int speed;
    int speedLimit=180;

    //Davranışlar(Methodlar)
    void increaseSpeed(int increment){
        if((speed+increment)<speedLimit){
            speed+=increment;
        }
    }

    void decreaseSpeed(int decrease){
        if(speed>0){
            speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println("Hızınız : " + speed);
    }

}
