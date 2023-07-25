package BasicOfJava.Classes;

class ConstructorExample {
    public static void main(String[] args) {
        /*
        Car audi = new Car(); //boş constructor
        audi.model="A3";
        audi.speed=10;
         */
        Car audi = new Car("Audi",10,"blue");
        Car bmw = new Car();
        Car mercedes = new Car("C180",30,"orange");

        /*
        audi.printInfo();
        System.out.println();
        bmw.printInfo();
        System.out.println();
        mercedes.printInfo();

         */


    }
}
