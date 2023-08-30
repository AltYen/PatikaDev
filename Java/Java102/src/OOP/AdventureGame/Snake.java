package OOP.AdventureGame;

import java.util.Random;

public class Snake extends Obstacle{
    public static Random r = new Random();
    public Snake() {
        super(4, "Yılan", 0, 12,0);
        this.setDamage(3 + r.nextInt(4));
    }

    public static int snakeReward(){
        int anyItemChance = r.nextInt(0,101);
        if(anyItemChance < 15){
            int weaponChance = r.nextInt(0,101);
            if(weaponChance < 20){
                return -3;
            }
            else if(weaponChance < 50){
                return -2;
            }
            else{
                return -1;
            }
        }else if(anyItemChance < 30){
            int armorChance = r.nextInt(0,101);
            if(armorChance < 20){
                return -6;
            }
            else if(armorChance < 50){
                return -5;
            }else{
                return -4;
            }
        }else if(anyItemChance < 55){
            int moneyChance = r.nextInt(0,101);
            if(moneyChance < 20){
                return 10;
            }
            else if(moneyChance < 50){
                return 5;
            }
            else{
                return 1;
            }
        }else{
            return 0;
        }
    }
}
