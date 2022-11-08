import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner lala = new Scanner(System.in);

        double milesDriven;
        double gallonGas;
        double mpg;

        System.out.println("Enter the number of miles driven");
        milesDriven = lala.nextDouble();

        System.out.println("Enter the number of gallons used");
        gallonGas= lala.nextDouble();

        mpg= milesDriven/ gallonGas;

        System.out.println("Your car's miles per gallon is" + mpg);

    }

}
