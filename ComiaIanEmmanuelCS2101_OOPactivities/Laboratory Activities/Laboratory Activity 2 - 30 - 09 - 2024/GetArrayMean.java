import java.util.Scanner;

public class GetArrayMean {

    //pang calculate ng mean nung array
    public static double getMean(int[] numbers) { 
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum/numbers.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        //para malaman yung magiging size ng array
        while(true) {
            System.out.print("Enter the number of elements: ");
            try {
                n = Integer.parseInt(input.nextLine());
                if (n<=0){
                    System.out.println("Please enter a positive integer.");
                    continue;
                }
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

         //pang gawa nung array at pang collect nung entries
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            while(true) {
                System.out.print("Enter number: ");
                try{
                    numbers[i] = Integer.parseInt(input.nextLine());
                    break;
                }
                catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }

        //pang calculate at display nung mean
        try {
            double mean = getMean(numbers);
            System.out.println("Mean of array is: " + mean);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
