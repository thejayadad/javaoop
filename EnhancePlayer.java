public class EnhancePlayer {


    private String name;
    private int health;
    private String weapon;


    public EnhancePlayer(String name){
        this(name, 100, "Sword");
    }

    public EnhancePlayer(String name, int health, String weapon){
        this.name = name;
        if(health <=0){
            this.health = 1;
        } else if(health > 100){
            this.health = 100;
        } else {
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.println("The player is OUT");
        }
    }

    public int healthRemaining(){
        return health;
    }
    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if(health > 100){
            System.out.println("Please restored to full health!");
            health = 100;
        }
    }


}
