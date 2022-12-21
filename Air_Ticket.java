import java.util.Scanner;

public class Air_Ticket {
    Scanner sc=new Scanner(System.in);
    int flight_id, ticket_price,available_tickets,refund_amount;
    Air_Ticket(int id){
        flight_id=id;
        ticket_price =5000;
        available_tickets=50;
    }
    int[] passenger_id=new int[50];
    int[] passenger_count=new int[50];
    int[] total_cost=new int[50];
    int cancel_passenger_id;//to get the count of persons booked per ticket
    int i=0;            // used to note passenger id

}
