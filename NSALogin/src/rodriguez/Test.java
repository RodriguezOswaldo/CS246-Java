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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
