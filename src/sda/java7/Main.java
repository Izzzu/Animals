package sda.java7;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SoundMaker cat = new Cat();
        SoundMaker dog = new Dog();
        SoundMaker girrafe = new Giraffe();

        System.out.println("sjdfhksjf");
        List<SoundMaker> animals = new LinkedList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(girrafe);

        for (SoundMaker animal : animals) {
            animal.makeSound();
        }
    }
}
