// INTERFACE = Rulebook
interface Animal {
    void makeSound();  // rule (no body here)
}

// Dog follows the Animal rule
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Bark");
    }
}

// Cat also follows the Animal rule
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

// MAIN class to test
public class Day4_Interface {
    public static void main(String[] args) {
        Animal a1 = new Dog();   // interface = Animal, object = Dog
        Animal a2 = new Cat();   // interface = Animal, object = Cat

        a1.makeSound();  // Output: Dog says: Bark
        a2.makeSound();  // Output: Cat says: Meow
    }
}
