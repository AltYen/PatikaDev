package OOP.AdventureGame;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player,"Mağara",new Zombie(),"food",3);
    }
}
