public class functions extends Air_Ticket{
    functions(int id) {
        super(id);
    }

    void Book_ticket(){
        show_flight_details();
        System.out.println("Enter number of tickets: ");
        passenger_count[i]=sc.nextInt();
        if(passenger_count[i]<available_tickets){
        passenger_id[i]=i+1;
        System.out.println("Booked Successfully!");
        updateAdd();
        show_ticket();
        show_flight_details();
        i++;
        } else{
            System.out.println("Not Enough tickets");
        }
    }

    void  Cancel_ticket(){
        System.out.println("Enter passenger ID:");
        cancel_passenger_id=sc.nextInt();
        int count=1;
        if(cancel_passenger_id<=i) {
            for (int n = 0; n < i; n++) {           //to find  which  passenger
                if (cancel_passenger_id == passenger_id[n]) {
                    updateMinus(cancel_passenger_id);
                    System.out.println("Refund amount:" + refund_amount);
                    System.out.println("Ticket Cancelled Successfully");
                    show_flight_details();
                    passenger_id[n] = 0;
                    passenger_count[n]=0;
                    total_cost[n]=0;
                } else {
                    if(count==i)
                        System.out.println("Invalid Passenger ID");
                    count++;

                }
            }
        }else System.out.println("Invalid Passenger ID");
    }
    void Print_details(int id){
            System.out.println("Flight ID:"+ id + "-->");
            int count=0;            //used to check if the array is empty,it will count++ if the element is 0
                for (int l = 0; l <= i; l++) {
                    if (passenger_id[l] > 0) {
                        System.out.println("Passenger ID:" + passenger_id[l] + "    Number of tickets booked:" + passenger_count[l] + "      Total cost:" + total_cost[l]);
                    }
                    else {
                        if(count==i)
                            System.out.println("No Tickets Booked");
                        count++;
                    }
                }
    }

    void  show_flight_details()
    {
        System.out.println("Flight Id:" + flight_id + "     Remaining Tickets:" + available_tickets + "       Current Ticket Price: " + ticket_price + "\n");
    }
    void show_ticket(){
        System.out.println("Flight ID:" + flight_id + "     Passenger ID:" + passenger_id[i] + "     Number of Tickets Booked:" + passenger_count[i] + "       Total cost:" + total_cost[i] +" \n");
    }

    void updateAdd(){
        total_cost[i]=ticket_price*passenger_count[i];
        available_tickets=available_tickets-passenger_count[i];
        ticket_price=ticket_price+(passenger_count[i]*200);
    }

    void updateMinus(int id){
        refund_amount=total_cost[id-1];
        available_tickets=available_tickets+passenger_count[id-1];
        ticket_price=ticket_price-(passenger_count[id-1]*200);
    }
}
