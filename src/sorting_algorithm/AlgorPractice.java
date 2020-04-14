package sorting_algorithm;

import java.util.Scanner;

public class AlgorPractice {
    public static void main(String[] args) {
        ifCorF();
    }
    //if c or f
    //convert c or f
    //return conversion
    public static String userInput(){
        System.out.println("Would you like to convert Fahrenheit or Celsius, type F or C?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
       return userInput;
    }
    public static Double userInput2(){
        System.out.println("What is the temp you want to convert?");
        Scanner scanner1 = new Scanner(System.in);
        String userInput2 = scanner1.nextLine();
        Double ui2 = Double.parseDouble(userInput2);
        return ui2;
    }
    public static void ifCorF(){
        String CorF = userInput();
        Double temperature = userInput2();

        if (CorF.equalsIgnoreCase("C")){
            int convertToFahrenheit = (int) ((9/5) * (temperature + 32));
            System.out.println(convertToFahrenheit);
        }else {
            int convertToCelsius = (int) ((5.0/9.0)*(temperature - 32));
            System.out.println(convertToCelsius);
        }
    }
}
