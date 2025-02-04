package lesson5;

import java.util.Date;
import java.util.Scanner;
import static java.lang.System.*;


public class main {
        public static void main(String[] args) {

            String name;
            int age;
            String idNum;
            double height;

            Scanner inputScanner = new Scanner(in);  // Create a name Scanner object
            out.println("Please enter your name: ");
            name = inputScanner.nextLine();  // Read user input

            out.println("Please enter your age ");
            age = Integer.parseInt(inputScanner.nextLine());  // Read user input

            out.println("Please enter your ID number ");
            idNum = inputScanner.nextLine();  // Read user input

            if (!validateIdLength(idNum)) {
                out.println("ID number entered is invalid ");
                exit(0);
            }
            ;


            out.println("Please enter your height");
            height = Double.parseDouble(inputScanner.nextLine());  // Read user input


            displayUserInfo(name, "Name");
            displayUserInfo("" + age, "age");
            displayUserInfo(idNum, "ID number");
            displayUserInfo("" + height, "height");

            String birthDate = calculateUsersBirthday(idNum);
            out.println("Your Birthdate is: " + birthDate);


        }

        public static void displayUserInfo(String printValue, String valueType) {

            out.println("User's " + valueType + " is: " + printValue);
        }

        public static boolean validateIdLength(String idNum) {

            return idNum.length() == 13;
        }

        public static String calculateUsersBirthday(String idNum) {
            String birthDay = idNum.substring(4, 6);
            String birthYear = idNum.substring(0, 2);
            String birthMonth = idNum.substring(2, 4);


            int year = Integer.parseInt(birthYear);
            year += (year >= 0 && year <= 24) ? 2000 : 1900;

            return birthDay + "/" + birthMonth + "/" + year;
        }
}
