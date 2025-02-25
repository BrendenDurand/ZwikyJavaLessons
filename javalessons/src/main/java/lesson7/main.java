package lesson7;

import lesson6.Adults;
import lesson6.Person;

public class main {


    public static void main(String[] args) {

        //Intefaces and abstract classes
//        Cat cat  = new Cat();
//        Dog dog = new Dog();
//
//        dog.makeSound();
//        System.out.println("/n");
//        cat.makeSound();
//
//        cat.eat();

        Zebra zebra =new Zebra();
        Horse horse = new Horse();

        zebra.eat();
        System.out.println("/n");
        horse.eat();
        horse.scratch();
        zebra.scratch();


    }
}