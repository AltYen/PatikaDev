package OOP.AdventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location{

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name, Obstacle obstacle, String award,int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " tane " +this.getObstacle().getName() + " yaşıyor!");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase = input.next().toUpperCase();
        if(selectCase.equals("S") && combat(obsNumber)){
            System.out.println(this.getName() + " tüm düşmanları yendiniz !");
            return true;
        }

        if(this.getPlayer().getHealth()<=0){
            System.out.println("Öldünüz !");
            return false;
        }

        return true;
    }

    public void userHit(){
        System.out.println();
        System.out.println("siz vurdunuz !");
        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
        afterHit();
    }

    public void obstacleHit(){
        System.out.println();
        System.out.println("Canavar size vurdu !");
        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
        if(obstacleDamage < 0){
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit();
    }

    public boolean combat(int obsNumber){
        Random r = new Random();
        for(int i = 1; i <= obsNumber; i++){
            if(this.getObstacle().getName().equals("Yılan")){
                this.setObstacle(new Snake());
                this.getObstacle().setAward(Snake.snakeReward());
            }
            this.getObstacle().setHealth(this.getObstacle().getOrijinalHealth());
            playerStats();
            obstacleStats(i);
            boolean isUserFirstAttack = r.nextBoolean();
            while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                if(isUserFirstAttack){
                    System.out.print("<V>ur veya <K>aç : ");
                    String selectCombat = input.next().toUpperCase();
                    if(selectCombat.equals("V")){
                        userHit();
                        if(this.getObstacle().getHealth() > 0){
                            obstacleHit();
                        }
                    }else{
                        return false;
                    }
                }else{
                    obstacleHit();
                    if(this.getPlayer().getHealth() > 0){
                        System.out.print("<V>ur veya <K>aç : ");
                        String selectCombat = input.next().toUpperCase();
                        if(selectCombat.equals("V")){
                           userHit();
                        }else{
                            return false;
                        }
                    }
                }
            }

            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println();
                System.out.println("Düşmanı Yendiniz !");
                claimObstacleAward();
            }else{
                return false;
            }
        }
        claimLocationAward();
        return true;
    }

    public void claimObstacleAward(){
        if(this.getObstacle().getAward() > 0){
            System.out.println(this.getObstacle().getAward() + " para kazandınız !");
            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
            System.out.println("Güncel Paranız : " + this.getPlayer().getMoney());
            System.out.println("---------------");
        }else{
            if(this.getObstacle().getAward() >= -6 && this.getObstacle().getAward() <= -4){
                if(this.getObstacle().getAward() == -6){
                    this.getPlayer().getInventory().setArmor(Armor.armors()[2]);
                }else if(this.getObstacle().getAward() == -5){
                    this.getPlayer().getInventory().setArmor(Armor.armors()[1]);
                }else if(this.getObstacle().getAward() == -4){
                    this.getPlayer().getInventory().setArmor(Armor.armors()[0]);
                }
                System.out.println("Tebrikler " + this.getPlayer().getInventory().getArmor().getName() + " Zırh kazandın !");
            }
            else if(this.getObstacle().getAward() >= -3 && this.getObstacle().getAward() <= -1){
                if(this.getObstacle().getAward() == -3){
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[2]);
                }else if(this.getObstacle().getAward() == -2){
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[1]);
                }if(this.getObstacle().getAward() == -1){
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[0]);
                }
                System.out.println("Tebrikler " + this.getPlayer().getInventory().getWeapon().getName() + " kazandın !");
            }
        }
    }
    public void claimLocationAward(){
        if(this.award.equals("food")){
            this.getPlayer().getInventory().setFood(true);
        }
        else if(this.award.equals("water")){
            this.getPlayer().getInventory().setWater(true);
        }
        else if(this.award.equals("firewood")){
            this.getPlayer().getInventory().setFirewood(true);
        }
    }

    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.getObstacle().getHealth());
        System.out.println("---------------");
    }
    public void playerStats(){
        System.out.println();
        System.out.println("Oyuncu Değerleri");
        System.out.println("---------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i){
        System.out.println();
        System.out.println(i +". "+ this.getObstacle().getName() + " Değerleri ");
        System.out.println("---------------------");
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        if(this.getObstacle().getAward() >= -6 && this.getObstacle().getAward() <= -4)
            System.out.println("Ödül : Zırh");
        else if(this.getObstacle().getAward() >= -3 && this.getObstacle().getAward() <= -1)
            System.out.println("Ödül : Silah");
        else if(this.getObstacle().getAward() == 0){
            System.out.println("Ödül : Yok");
        }else
            System.out.println("Ödül : " + this.getObstacle().getAward());
        System.out.println();
    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1; // Sadece içerisine 3 verirsen -> 0 ile 2 arasında değer üretir.
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
