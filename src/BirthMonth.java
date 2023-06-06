// Pseudocode:
//class birthMonth
//    main()
//        num month
//        output “What is your birth month?”
//        input month
//        If month > 12 then
//           output "You entered an incorrect month value: " + month
//        else if month < 1 then
//           output "You entered an incorrect month value: " + month
//        else
//           output "Your birth month is: " + month
//        end if
//    return
//end class

import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month;

        System.out.println("What is your birth month as an integer?");

        if(in.hasNextInt())
        {
            month = in.nextInt();
            if(month > 12)
            {
                System.out.println("You entered an incorrect month value: " + month);
            }
            else if(month < 1)
            {
                System.out.println("You entered an incorrect month value: " + month);
            }
            else {
                System.out.println("Your birth month is: " + month);
            }
        }
        else {
            System.out.println("You did not enter a valid integer!");
        }
    }
}
