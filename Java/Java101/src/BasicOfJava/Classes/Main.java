package BasicOfJava.Classes;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car(); // Car sınıfından bir nesne üretiyoruz.
        //bir nesnenin niteliklerine nasıl erişim sağlanır.
        audi.model="A3";
        audi.speed=10;
        audi.increaseSpeed(20); // bir nesnenin davranışlarına(methotlarına) erişim
        audi.decreaseSpeed(10);
        audi.type="Sport";
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model="M5";
        bmw.speed=20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model="C180";
        mercedes.speed=30;
        mercedes.printSpeed();

    }
}
