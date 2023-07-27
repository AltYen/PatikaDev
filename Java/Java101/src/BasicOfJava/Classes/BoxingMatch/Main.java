package BasicOfJava.Classes.BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Dzeko",10,120,100,25);
        Fighter f2 = new Fighter("Tadic",20,85,85,40);

        Match match = new Match(f1,f2,70,100);
        match.run();
    }
}
