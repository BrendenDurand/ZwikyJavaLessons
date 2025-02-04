package lesson6;

import org.w3c.dom.ls.LSOutput;

public class main {


    public static void main(String[] args) {

        Person myPerson = new Person("John", 30, "9510025162085", 1.8);
        Adults myPerson2 = new Adults("Jane", 25, "9510025162088", 1.6);



        Person[] customerArray = new Person[2];
        customerArray[0] = myPerson;
        customerArray[1] = myPerson2;

        System.out.println(customerArray[0].getName());
        System.out.println(customerArray[1].getName());
    }
}