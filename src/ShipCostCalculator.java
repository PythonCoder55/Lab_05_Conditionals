// Pseudocode:
//class calcShipping
//    main()
//        num shipping
//        num price
//        output “What was the price of the item?”
//        input price
//        If price >= 100 then
//           shipping = 0
//        else
//           shipping = price * .02
//        end if
//        output "The price for shipping is " + shipping + ". The total price is " + (shipping + price)
//    return
//end class

import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double shipping;
        double price;

        System.out.println("What was the price of the item?");

        if(in.hasNextDouble())
        {
            price = in.nextDouble();
            if(price >= 100)
            {
                shipping = 0;
            }
            else
            {
                shipping = price * 0.02;
            }
            System.out.println("The shipping cost is " + shipping);
            System.out.println("The total price is " + (shipping + price));
        }
        else
        {
            System.out.println("You didn't enter a valid number!");
        }
    }
}