import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        functions flight1=new functions(1);
        functions flight2=new functions(2);
        functions flight3=new functions(3);
       // System.out.println(Arrays.toString(flight1.passenger_id));
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1.Book  2.Cancel   3.Print    4.Exit");
            int user_choice = sc.nextInt();
            int flight_id;

            if (user_choice == 1) {
                System.out.println("Enter flight ID:");
                flight_id = sc.nextInt();
                if (flight_id == flight1.flight_id)
                    flight1.Book_ticket();
                else if (flight_id == flight2.flight_id)
                    flight2.Book_ticket();
                else if (flight_id == flight3.flight_id)
                    flight3.Book_ticket();
                else
                    System.out.println("Invalid Flight ID");
            } else if (user_choice == 2) {
                System.out.println("Enter flight ID:");
                flight_id = sc.nextInt();
                if (flight_id == flight1.flight_id)
                    flight1.Cancel_ticket();
                else if (flight_id == flight2.flight_id)
                    flight2.Cancel_ticket();
                else if (flight_id == flight3.flight_id)
                    flight3.Cancel_ticket();
                else
                    System.out.println("Invalid Flight ID");
            } else if (user_choice == 3) {
                flight1.Print_details(1);
                flight2.Print_details(2);
                flight3.Print_details(3);
            }
            else break;
        }
    }
}
