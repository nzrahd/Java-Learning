 import java.util.Scanner;
  class mileage {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantity of diesel:");
        double l = sc.nextDouble();

        System.out.println("Enter the distance covered:");
        double d = sc.nextDouble();

        
        if (l <= 0 || d <= 0) {
            System.out.println("Invalid Input");
        }

        
        double fuelPer100Km = (l / d) * 100;

        
        System.out.printf("Fuel Consumption : " + fuelPer100Km);
        System.out.printf("Fuel Consumption (miles per gallon):"+ d*0.6214/l*0.264);
    }
}

    

