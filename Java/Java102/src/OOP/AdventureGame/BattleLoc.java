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
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("S")){
            System.out.println("savaş");
        }else{

        }
        return true;
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
