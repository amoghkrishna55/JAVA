// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

abstract class Animal {
    abstract void eat();

    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eat");
    }

    void sleep() {
        System.out.println("Lion sleep");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eat");
    }

    void sleep() {
        System.out.println("Tiger sleep");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eat");
    }

    void sleep() {
        System.out.println("Deer sleep");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.eat();
        lion.sleep();
        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        Animal deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}