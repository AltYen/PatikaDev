package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter",150);
        Book lordOfTheRings = new Book("Lord Of The Rings",-100);

        lordOfTheRings.setPageNumber(-1000);
        System.out.println(lordOfTheRings.getPageNumber());
        System.out.println(lordOfTheRings.getName());
    }
}
