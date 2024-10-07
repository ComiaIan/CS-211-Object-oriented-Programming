import java.util.Scanner;

public class Car {
    private String color;
    private double price;
    private char size;

    public Car (String color, double price, char size) {
        this.color = color;
        this.price = price;
        setSize(size);
    }
    public String getColor() {return color;}
    public double getPrice () {return price;}
    public char getSize() {return size;}

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        size = Character.toUpperCase(size);
        if(size == 'S' || size == 'M' || size == 'L') {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Size must be uppercase.");
        }
    }

    public String toString() {
        String sizeDescription;
        switch (size) {
            case 'S':
                sizeDescription = "small";
                break;
            case 'M':
                sizeDescription = "medium";
                break;
            case 'L':
                sizeDescription = "large";
                break;
            default:
                sizeDescription = "unknown";
        }
        return String.format("Car (" + color + ") - P" + price + " - " + sizeDescription);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the car color: ");
        String color = input.nextLine();

        System.out.print("Enter the car price: ");
        double price = input.nextDouble();

        System.out.print("Enter the car size(s, m or l): ");
        char size = input.next().charAt(0);

        Car useCar = new Car (color, price, size);

        System.out.println("\nCar Details:");
        System.out.println("Color: " + useCar.getColor());
        System.out.println("Price: P" + String.format("%.2f", useCar.getPrice()));
        System.out.println("Size: " + useCar.getSize());

        System.out.println("\nFormatted output: " + useCar.toString());

        input.close();
    }
}
