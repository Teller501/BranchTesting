public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.eat("dogfood");
        cat.eat("fish");

        dog.showMood(true);
        cat.showMood(false);
    }
}
