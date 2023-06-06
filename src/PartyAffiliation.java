// Pseudocode:
//class partyAffiliation
//    main()
//        String party
//        output “What is your party affiliation? D, R, I or Other”
//        input party
//        If party == "D" then
//           output "You get a Democratic Donkey."
//        else if party == "R" then
//           output "You get a Republican Elephant."
//        else if party == "I" then
//           output "You get an Independent Man."
//        else
//           output "You get something else."
//        end if
//    return
//end class

import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party;

        System.out.println("What is your party affiliation? D, R, I or Other");
        party = in.nextLine();

        if(party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(party.equals("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent Man.");
        }
        else {
            System.out.println("You get something else.");
        }
    }
}
