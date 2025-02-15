import colors.Color;

import java.util.Random;

public class Superhero {
    String name;
    int health;
    int damage;

    public Superhero(String name, int damage) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
    }

    public void fight(Superhero superhero) throws InterruptedException {
        Random rnd = new Random();
        while (true) {
            if (this.health <= 0) {
                System.out.println(Color.RED + this.name + " is now dead." + Color.RESET);
                System.out.println(Color.GREEN + superhero.name + " has won." + Color.RESET);
                break;
            }
            if (superhero.health <= 0) {
                System.out.println(Color.RED + superhero.name + " is now dead." + Color.RESET);
                System.out.println(Color.GREEN + this.name + " has won." + Color.RESET);
                break;
            }
            int chance = rnd.nextInt(11);
            if (chance <= 5) {
                this.health -= superhero.damage;
                Thread.sleep(1000);
                System.out.println(Color.colorText(superhero.name, Color.YELLOW) + " hits " + Color.colorText(this.name, Color.BLUE) +  " with a damage of " + superhero.damage + ". " + Color.colorText(this.name, Color.BLUE) + " health is now " + this.health);
            } else {
                superhero.health -= this.damage;
                Thread.sleep(1000);
                System.out.println(Color.colorText(this.name, Color.BLUE) +  " hits " + Color.colorText(superhero.name, Color.YELLOW) + " with a damage of " + this.damage + ". " + Color.colorText(superhero.name, Color.YELLOW) + " health is now " + superhero.health);
            }
        }
    }
}
