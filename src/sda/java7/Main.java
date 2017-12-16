package sda.java7;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SoundMaker cat = new Cat();
        SoundMaker dog = new Dog();
        SoundMaker girrafe = new Giraffe();

        List<SoundMaker> animals = new LinkedList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(girrafe);

        System.out.println("cos tam");

        System.out.println("cos tam2");



        for (SoundMaker animal : animals) {
            animal.makeSound();
        }
    }
}
