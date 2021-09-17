package rodriguez;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        User user = new User(password);

        //Setting passwords
        System.out.println("Password: " + user.getPassword());
        System.out.println("Salt: " + user.getSalt());
        System.out.println("Hashed Password: " + user.getHashedPassword());

        try{
            NSALoginController.hashUserPassword(user);
            System.out.println("Password: " + user.getPassword());
            System.out.println("Salt: " + user.getSalt());
            System.out.println("Password: " + user.getHashedPassword());

            System.out.print("Enter password: ");
            password = sc.nextLine();
            user.setPassword(password);
            if(NSALoginController.verifyPassword(user))
            {
                System.out.println("Verified!");
            }
            else{
                System.out.println("Not Verified!");
            }

        } catch (Exception e) {
            System.out.println("General Exception : " + e.toString());
        }
    }
}
