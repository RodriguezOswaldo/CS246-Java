package rodriguez;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterGenerator {
    //Member data
    private ArrayList<Account> accounts;
    private String formLetter;

    public LetterGenerator(){
        accounts = new ArrayList<Account>();
        formLetter = "Dear [name], its been [days] since your last purchase " + "of the [purchase]. We hope to see you again soon. ";
    }
    //Member functions
    public void addAccount(){
        // create new instance of scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter last item purchased: ");
        String item = sc.nextLine();
        System.out.print("Enter days since last purchase: ");
        int days = Integer.parseInt(sc.nextLine());

        //new instance of Account Class with the required parameters
        Account account = new Account(name, item, days);
        //call the method add to add the account into the array.
        accounts.add(account);

    }
    public void generateLetters(){
        //looping the Array to generate letters based in the data added in line accounts.add
        for (Account currAccount: accounts){
            String letter  = formLetter
        }
    }

}
