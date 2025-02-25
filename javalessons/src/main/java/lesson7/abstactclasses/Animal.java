package lesson7.abstactclasses;

import lesson7.inteface.AnimalBehaviours;

public abstract class Animal implements AnimalBehaviours {

        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public abstract String getAge();

        public abstract void setAge(String age);

    @Override
    public void eat() {

    }




}
