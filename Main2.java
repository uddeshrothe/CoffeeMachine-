import java.util.Scanner;

class CoffeeMachine {
    static Scanner scan = new Scanner(System.in);
    private double coffeePowder, milk, water, cream, sugar;
    private int Coffee_Count = 0;
    

    public CoffeeMachine() { // Default Constructor Initialization
        this.coffeePowder = 0;
        this.milk = 0;
        this.water = 0;
        this.cream = 0;
        this.sugar = 0;
    }

    private void SetIngredient() { // Calling for Filling Ingredient
        System.out.print("Water: ");
        water += scan.nextInt();
        System.out.print("Coffee beans: ");
        coffeePowder += scan.nextInt();
        System.out.print("Cream: ");
        cream += scan.nextInt();
        System.out.print("Milk: ");
        milk += scan.nextInt();
        System.out.print("Sugar cubes: ");
        sugar += scan.nextInt();
        System.out.print("Filling Completed.");
    }

    private void GetIngredient() { // To Get Status
        System.out.println("Available Coffee Power(gm) " + String.format("%.1f", this.coffeePowder));
        System.out.println("Available Milk(ml) " + String.format("%.1f", this.milk));
        System.out.println("Available Water(ml) " + String.format("%.1f", this.water));
        System.out.println("Available Cream(gm) " + String.format("%.1f", this.cream));
        System.out.println("Available Sugar(cubes) " + String.format("%.1f", this.sugar));

    }

    private void makecoffee() { // Coffee Selection Menu
        System.out.println("\n ------------------ ");
        System.out.println(
                "|   Select Type:   |\n ------------------ \n| 1:  Americano Coffee |\n| 2:  Black Coffee  |\n| 3:  Cappuccino Coffee  |\n| 4:  Doppio Coffee  |\n| 5:  Espresso Coffee  |\n| 6:  Latte Coffee  |\n| 0   to Discard   |");
        System.out.println(" ------------------ \n");
        char t = scan.next().charAt(0);
        switch (t) {
            case '1':
                this.AmericanoCoffee();
                break;
            case '2':
                this.BlackCoffee();
                break;
            case '3':
                this.CappuccinoCoffee();
                break;
            case '4':
                this.DoppioCoffee();
                break;
            case '5':
                this.EspressoCoffee();
                break;
            case '6':
                this.LatteCoffee();
                break;
            case '0':
                break;
        }
    }

    private void AmericanoCoffee() {
        if (this.coffeePowder >= 10 && this.water >= 150) {
            System.out.println("\nMaking Americana Coffee...");
            this.coffeePowder = this.coffeePowder - 10;
            this.water = this.water - 150;
            System.out.println("\nYour Americana Coffee is Ready.");
            System.out.println("Price: 6.99$");
            this.Coffee_Count++;
        } else {
            System.out.println("\nAvailable Coffee Power(Gram) " + String.format("%.1f", this.coffeePowder));
            System.out.println("Available Water(Liter) " + String.format("%.1f", this.water));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }

    private void BlackCoffee() {
        if (this.coffeePowder >= 15 && this.water >= 150) {
            System.out.println("\nMaking Black Coffee...");
            this.coffeePowder = this.coffeePowder - 15;
            this.water = this.water - 150;
            System.out.println("Price: 8.99$");
            System.out.println("\nYour Black Coffee is Ready.");
            this.Coffee_Count++;
        } else {
            System.out.println("\nAvailable Coffee Power(Gram) " + String.format("%.1f", this.coffeePowder));
            System.out.println("Available Water(ml) " + String.format("%.1f", this.water));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    
    private void CappuccinoCoffee() {
        if (this.coffeePowder >= 10 && this.milk >= 150 && this.cream >= 20 && this.sugar >=3) {
            System.out.println("\nMaking Cappuccino Coffee...");
            this.coffeePowder = this.coffeePowder - 10;
            this.milk = this.milk - 150;
            this.cream = this.cream - 20;
            this.sugar = this.sugar - 3;
            System.out.println("\nYour Cappuccino Coffee is Ready.");
            System.out.println("Price: 9.99$");
            this.Coffee_Count++;
        } else {
            System.out.println("\nAvailable Coffee Power(Gram) " + String.format("%.1f", this.coffeePowder));
            System.out.println("Available Milk(ml) " + String.format("%.1f", this.milk));
            System.out.println("Available Cream(gm) " + String.format("%.1f", this.cream));
            System.out.println("Available Sugar(cubes) " + String.format("%.1f", this.sugar));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    
    private void DoppioCoffee() {
        if (this.coffeePowder >= 10 && this.milk >= 100 && this.water >= 50 && this.sugar >= 2) {
            System.out.println("\nMaking Dappio Coffee...");
            this.coffeePowder = this.coffeePowder - 10;
            this.milk = this.milk - 100;
            this.water = this.water - 50;
            this.sugar = this.sugar - 2;
            System.out.println("\nYour Dappio Coffee is Ready.");
            System.out.println("Price: 8.99$");
            this.Coffee_Count++;
        } else {
            System.out.println("\nAvailable Coffee(Gram) " + String.format("%.1f", this.coffeePowder));
            System.out.println("Available Water(ml) " + String.format("%.1f", this.water));
            System.out.println("Available Milk(ml) " + String.format("%.1f", this.milk));
            System.out.println("Available Sugar(cubes) " + String.format("%.1f", this.sugar));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    
    private void EspressoCoffee() {
        if (this.coffeePowder >= 20 && this.water>= 150) {
            System.out.println("\nMaking Espresso Coffee...");
            this.coffeePowder = this.coffeePowder - 20;
            this.water = this.water - 150;
            System.out.println("\nYour Espresso Coffee is Ready.");
            System.out.println("Price: 4.99$");
            this.Coffee_Count++;
        } else {
            System.out.println("\nAvailable Coffee(gm) " + String.format("%.1f", this.coffeePowder));
            System.out.println("Available Water(ml) " + String.format("%.1f", this.water));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    
    private void LatteCoffee() {
        if (this.coffeePowder >= 10 && this.milk >= 200 && this.cream >= 30 && this.sugar >= 4) {
            System.out.println("\nMaking Latte Coffee...");
            this.coffeePowder = this.coffeePowder - 10;
            this.milk = this.milk - 200;
            this.cream = this.cream - 30;
            this.sugar = this.sugar - 4;
            System.out.println("\nYour Latte Coffee is Ready.");
            System.out.println("Price: 11.99$");
            this.Coffee_Count++;
        } else {
            System.out.println("\nAvailable Coffee(gm) " + String.format("%.1f", this.coffeePowder));
            System.out.println("Available Milk(ml) " + String.format("%.1f", this.milk));
            System.out.println("Available Cream(gm) " + String.format("%.1f", this.cream));
            System.out.println("Available Sugar(cubes) " + String.format("%.1f", this.sugar));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
    
    public void start() { 
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("|                   Coffee Machine                              |");
        System.out.println(" ----------------------------------------------------------------");
        
        System.out.println("\nCurrent Status: ");
        this.GetIngredient();
        boolean t = true;
        while (t) {
            System.out.println("\n -------------------------------- ");
            System.out.println(
                    "|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:        Make Coffee           |\n -------------------------------- \n|4: Today's Coffee Count|\n -------------------------------- \n|5:        Exit                  |");
            System.out.println(" -------------------------------- \n\n");
            char c = CoffeeMachine.scan.next().charAt(0);
            switch (c) {
                case '1':
                    System.out.println("------------- Status ------------");
                    this.GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    this.SetIngredient();
                    break;
                case '3':
                    this.makecoffee();
                    break;
                case '4':
                    System.out.println("\nWe Have Made " + this.Coffee_Count + " Coffee(s).");
                    break;
                case '5':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {

        CoffeeMachine cm = new CoffeeMachine(); // Instance For CoffeMachine
        cm.start(); 
        System.out.println("Shutting Down...\n");

    }
}
