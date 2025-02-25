package lesson7;

import lesson7.inteface.AnimalBehaviours;

public class Cat implements AnimalBehaviours {

    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("tskstsk");
    }

    @Override
    public void makeSound() {
        System.out.printf("meow meow");
    }

    @Override
    public void scratch() {
        System.out.println("front leg or teeth");
    }
}
