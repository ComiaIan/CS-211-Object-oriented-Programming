import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("\nEnter a Celcius value: ");

            if (scanner.hasNextDouble()){
                double celcius = scanner.nextDouble();

                double fahrenheit = (celcius *9/5) + 32;
                System.out.printf("%.2f Celcius is %.2f Fahrenheit\n", celcius, fahrenheit);
                
            } else if (scanner.hasNext("exit")) {
                break;
            } else {
                System.out.println("Please enter a numeric value. Try again");
                scanner.next();
            }
        }  
        scanner.close(); 
    }
}
