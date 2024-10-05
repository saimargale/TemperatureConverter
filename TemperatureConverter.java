import java.util.*;

public class TemperatureConverter
{
    public static double celsiusToFahrenheit(double celsius)
    {
        return(celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return(fahrenheit - 32) * 5 / 9;
    }

    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose the option: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. fahrenheit to Celsius");

        int choice=s.nextInt();

        if(choice == 1)
        {
            System.out.println("Enter temperature in Celsius: ");
            double celsius = s.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " \u00B0C = " + fahrenheit + " \u00B0F");
        }

        else if(choice == 2)
        {
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = s.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println( fahrenheit+ " \u00B0F = " + celsius + " \u00B0C");
        }

        else
        {
            System.out.println("Invalid choice! Please enter either 1or 2");
        }

    }
}