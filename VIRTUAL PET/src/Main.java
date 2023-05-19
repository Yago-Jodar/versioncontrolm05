public class Main {
    public static void main(String[] args) throws InterruptedException {

        int animal, rand1 = 40, rand2 = 60, rand3 = 1, neglect = 3, life = 1, action, exit = 1,
                energy = (int) Math.floor(Math.random() * (rand1 - rand2 + rand3) + rand1),
                fatigue = (int) Math.floor(Math.random() * (rand1 - rand2 + rand3) + rand1),
                sleep = (int) Math.floor(Math.random() * (rand1 - rand2 + rand3) + rand1),
                hygiene = (int) Math.floor(Math.random() * (rand1 - rand2 + rand3) + rand1),
                weight = (int) Math.floor(Math.random() * (rand1 - rand2 + rand3) + rand1);
        String name, typeAnimal = "aa";
        char decision;


        Thread.sleep(1000);
        System.out.println("Welcome to your virtual pet");
        Thread.sleep(2 * 1000);
        do {
            System.out.println("Is your pet a bunny or a tortoise?");
            System.out.println("BUNNY : 1");
            System.out.println("TORTOISE : 2");
            animal = Teclat.llegirInt();

            switch (animal) {
                case 1 -> typeAnimal = "bunny";
                case 2 -> typeAnimal = "tortoise";
                default -> System.out.println("That wasn't a choice you dummy");
            }
        } while (animal != 1 && animal != 2);
        System.out.println("What is your " + typeAnimal + "'s name?");
        name = Teclat.llegirString();

        if (animal == 1) {
            System.out.println("These are " + name + "'s CATistics");
        }
        if (animal == 2) {
            System.out.println("These are " + name + "'s statistics(The goodest boy)");
        }
        System.out.println("──────────────");
        System.out.println("Energy:  " + energy + "%");
        System.out.println("Fatigue: " + fatigue + "%");
        System.out.println("Sleep:   " + sleep + "%");
        System.out.println("Hygiene: " + hygiene + "%");
        System.out.println("Weight:  " + weight + "%");
        System.out.println("──────────────");

        do {
            System.out.println("Would you like to interact with " + name + "?");
            System.out.println("Y = Yes");
            System.out.println("N = No");
            decision = Teclat.llegirChar();
            decision = Character.toLowerCase(decision);
            switch (decision) {
                case 'y' -> System.out.println("What would you like to do?");
                case 'n' -> {
                    neglect = neglect - 1;
                    System.out.println("It's your pet I guess...");
                    if (neglect == 0) {
                        System.out.println("You neglected " + name + " for too long, it ran away");
                        System.exit(0);
                    }
                }
                default -> System.out.println("That is not what we asked for T_T");
            }
        } while (decision != 'y');

        do{
        System.out.println("What would you like to do with" + name + "?");
        if (animal == 1) {
            System.out.println("""
                    ─────────────────
                    1.-Sleep
                    2.-Play
                    3.-Eat
                    4.-Self Cleaning
                    5.-Exit
                    ─────────────────
                    """);
        }
        if (animal == 2) {
            System.out.println("""
                    ─────────────────
                    1.-Sleep
                    2.-Play
                    3.-Eat
                    4.-Shower
                    5.-Exit
                    ─────────────────
                    """);
        }
        action = Teclat.llegirInt();

        switch (action) {
            case 1 -> {
                sleep = sleep + 25;
                fatigue = fatigue - 15;
                energy = energy + 15;
            }
            case 2 -> {
                sleep = sleep + 10;
                fatigue = fatigue - 10;
                energy = energy - 10;
                hygiene = hygiene - 15;
                weight = weight - 10;
            }
            case 3 -> {
                sleep = sleep - 15;
                energy = energy + 10;
                hygiene = hygiene - 10;
                weight = weight + 10;
            }
            case 4 -> {
                sleep = sleep + 15;
                hygiene = hygiene + 20;
            }
            case 5-> {
                System.out.println("You hug "+name+" and leave the house for a walk");
                exit = 0;
            }
        }

            if ((energy < 1) || (fatigue < 1) || (sleep < 1) || (hygiene < 1) || (weight < 1)) {
                life = 0;

            }
        }while(life !=0 && exit == 0);
        if (life == 0){
            System.out.println("You didn't tend to "+name+"'s necessities correctly, and it sadly passed away");
        }else System.out.println("You hug " + name + " and leave the house for a walk");
    }
}