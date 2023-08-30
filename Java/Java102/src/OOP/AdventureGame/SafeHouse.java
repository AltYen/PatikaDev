package OOP.AdventureGame;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        System.out.println();
        System.out.println("---------------------");
        System.out.println("Güvenli evdesiniz !");
        System.out.println("Canınız yenilendi !");
        System.out.println("---------------------");
        this.getPlayer().setHealth(this.getPlayer().getOrijinalHealth());
        return true;
    }
}
