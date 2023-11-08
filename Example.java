package me.com;
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Example {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}



