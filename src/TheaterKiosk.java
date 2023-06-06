// Pseudocode:
//class ageAuthentication
//    main()
//   	num age
//   	output “What is your age?”
//   	input age
//   	If age >= 21 then
//         output “You get a wristband!”
//      end if
//    return
//end class

import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.println("What is your age?");

        if(in.hasNextInt())
        {
            age = in.nextInt();
            if(age >= 21)
            {
                System.out.println("You get a wristband!");
            }
        }
        else
        {
            System.out.println("You did not enter a valid integer!");
        }
    }
}
