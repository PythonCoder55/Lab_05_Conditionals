// Pseudocode:
//class numComparison
//    main()
//   	num firstNum
//	    num secondNum
//   	output “What is the first number?”
//   	input firstNum
//	    output “What is the second number?”
//   	input secondNum
//   	If firstNum == secondNum then
//   	   output "The numbers are equal"
//	    else if firstNum > secondNum then
//		   output secondNum + " is the smaller number"
//	    else
//		   output firstNum + " is the smaller number"
//	    end if
//    return
// end class

import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNum;
        int secondNum;

        System.out.println("What is the first number?");
        if(in.hasNextInt())
        {
            firstNum = in.nextInt();
            System.out.println("What is the second number?");
            if(in.hasNextInt())
            {
                secondNum = in.nextInt();
                if(firstNum == secondNum)
                {
                    System.out.println("The numbers are equal");
                }
                else if(firstNum > secondNum)
                {
                    System.out.println(secondNum + " is the smaller number");
                }
                else
                {
                    System.out.println(firstNum + " is the smaller number");
                }
            }
            else
            {
                System.out.println("You didn't enter a valid second number!");
            }
        }
        else
        {
            System.out.println("You didn't enter a valid first number!");
        }
    }
}
