package com.study;
import java.util.Scanner;
public class DigitalComProcess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        User user=new User();
        GameService gameService=new GameService();
        boolean running = true;
        boolean isLoggedIn=false;

        while(running){
            System.out.println("\n--- Main Menu ---");
            System.out.println("1) RegisterUser");
            System.out.println("2) ViewGames");
            System.out.println("3) searchByName");
            System.out.println("4) Exit");
            System.out.println("Enter your choice: ");

            int choice=sc.nextInt();
            sc.nextLine();
            if((choice==2 || choice==3) && !isLoggedIn){
                System.out.println("\n ---Authentication Required---");
                System.out.print("Enter userId: ");
                String loginUid=sc.nextLine();
                System.out.print("Enter pass: ");
                String loginPass=sc.nextLine();
                if(user.IsAuthenticated(loginUid, loginPass)){
                    isLoggedIn=true;
                    System.out.println("Login successful. Access granted !!");
                }
                else{
                    System.out.println("Authentication failed. Please register or check your credentials.");
                }
            }
            switch(choice){
                case 1:
                    System.out.print("Enter new userId: ");
                    String userId=sc.nextLine();
                    System.out.print("Enter new password: ");
                    String password=sc.nextLine();
                    user.addUser(userId, password);
                    break;
                case 2:
                    System.out.println("\n --- Available Games ---");
                    gameService.viewAll().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter author name to search: ");
                    String authSearch=sc.nextLine();
                    String result= gameService.authorSearch(authSearch);
                    System.out.println("Search result: "+ result);
                    break;
                case 4:
                    running=false;
                    System.out.println("Exiting Now!!");
                    break;
                default:
                    System.out.println("Invalid choice !!");
            }
        }
        sc.close();
    }
}
