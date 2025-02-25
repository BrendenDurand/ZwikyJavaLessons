package lesson7;

import lesson7.inteface.AnimalBehaviours;

public class Dog implements AnimalBehaviours {

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
        System.out.println("numnum");
    }

    @Override
    public void makeSound() {
        System.out.printf("woof woof");
    }

    @Override
    public void scratch() {
        System.out.println("back leg");
    }
}
