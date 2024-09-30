import java.util.Scanner;

public class MultiplicationTable {
    public static int getSizeFromUser() {
        Scanner input = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of the multiplication table: ");
        size = input.nextInt();

        input.close();

        return size;
    }

    public static int[][] generateTable(int size) {
        int[][] table = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j<= size; j++) {
                table[i-1][j-1] = i * j;
            }  
        }
        return table;
    }

    public static void printTable(int[][] table, int size) {
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        int size = getSizeFromUser();
        
        int[][] table = generateTable(size);

        printTable(table, size);
    }
}
