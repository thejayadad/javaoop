public class Main {


    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "Jace";
        // player.health = 20;
        // player.weapon = "Knife";
        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining Health = " + player.healthRemaining());
        // player.restoreHealth(150);
        // player.loseHealth(11);
        // System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancePlayer jace = new EnhancePlayer("Jace", 400, "Sword");
        System.out.println("Starting Health is " + jace.healthRemaining());
    }
}
