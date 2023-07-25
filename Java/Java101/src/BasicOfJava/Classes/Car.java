package BasicOfJava.Classes;

//Sınıflar nesneler üretip,oluşturabilmek için üretilmiş şablonlardır(Modellerdir).
//Nesneler bu şablonlardan üretilen fiziksel yapılardır.(Sınıflardan ürettiğimiz yapılara nesne denir.)
class Car {
    //Nitelikler değişkenler ile belirlenir. Değişkenler sınıfın en başında tanımlanır.
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    //constructor methodu niteliklerden hemen sonra tanımlanır.
    //Constructor Method
    Car(String model,int speed,String color){
        //varsayılan değerler constructor method içerisinde tanımlanmalı.
        // model = model; // kullanımı yanlış,
        this.model=model; // this sınıfa ait değişken olduğunu belirtiyor. yani üstte tanımladığımız class değişkeni olduğunu anlıyor.
        this.speed=speed; // veri tipleri aynı olmak zorunda.
        this.color=color;
        this.type="Sedan";
        this.speedLimit=180;
        System.out.println("Parametreli kurucu methodu oluştu.");
    }

    //Constructor car methodunu overload yapıyoruz.
    Car(){
        System.out.println("Boş kurucu methodu oluştu");
    }

    //Davranışlar(Methodlar)
    void increaseSpeed(int increment){
        if((this.speed+increment)<this.speedLimit){
            this.speed+=increment;
        }else{
            this.speed=this.speedLimit;
            System.out.println("Maksimum Hıza ulaştınız " + this.speed );
        }
    }

    void decreaseSpeed(int decrease){
        if(this.speed>0){
            this.speed-=decrease;
        }
    }

    void printSpeed(){
        System.out.println(this.model + " Hızınız : " + this.speed);
    }

    void printInfo(){
        //sınıfa ait bir niteliğe erişmek için this kullanılır.
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);
    }

}
