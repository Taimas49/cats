// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        final String CAT = "Cat";
        final String PERSON = "Person";

        Person person = new Person(CAT, 7);
        System.out.println(person.getBeingType());
    }

}



class LivingBeing {
    int health;
    String beingType;
    void beingisdead() {
        System.out.printf("%s is dead%n", beingType);
    }
    public String getBeingType() {
        return beingType;
    }
    public int getHealth() {
        return health;
    }
    public LivingBeing (String beingType, int health) {
        this.beingType = beingType;
        this.health = health;
    }
}
class CatFood {

}
class Person extends LivingBeing {
    final String PERSON = "Person";
    String name = "John";

    int annoyance = 0;

    final int annoyance_breakpoint = 8;

    public Person(String beingType, int health) {
        super(beingType, health);
    }
}

class Cat extends LivingBeing{
    int HP = 9;
    int hunger = 2;
    final int hungerBreakpoint = 6;
    String name = "Kitty";
    public Cat(String beingType, int health) {
        super(beingType, health);

    }
    void increaseHunger() {
        hunger = hunger + 1;
        HP = HP - 1;
        System.out.println("Cat's hunger increased: +1 \n Cat's HP is decreased: -1 ");
    }
    
    void askFood() {
        if (hunger >= hungerBreakpoint) {
            System.out.println("Meow....");
        }
    }


//    void mew() {
//        setPersonAgression() {
//            agression + 1
//        }
//    }
}