package Task_05_Hometask_Language_Constructs;

import java.util.Scanner;

 /*
    1. You are driving a little too fast, and a police officer stops you.
    Write code to compute the result,
     encoded as an
     int value: 0=no ticket,
      1=small ticket,
       2=big ticket.
        If speed is 60 or less, the result is 0.
         If speed is between 61 and 80 inclusive, the result is 1. I
         f speed is 81 or more, the result is 2.
         Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

     */

public class SpeedingTicket {
    private int speed;
    private boolean isBirthday;

    // Constructor
    public SpeedingTicket(int speed, boolean isBirthday) {
        this.speed = speed;
        this.isBirthday = isBirthday;
    }

    // Method to determine the type of ticket
    public int getTicketType() {
        // Determine effective speed
        int effectiveSpeed = isBirthday ? speed - 5 : speed;

        // Determine the ticket type based on effective speed
        if (effectiveSpeed <= 60) {
            return 0; // No ticket
        } else if (effectiveSpeed <= 80) {
            return 1; // Small ticket
        } else {
            return 2; // Big ticket
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: speed and birthday status
        System.out.print("Enter your speed: ");
        int speed = sc.nextInt();

        System.out.print("Is it your birthday? (yes/no): ");
        String isBirthdayInput = sc.next().toLowerCase();
        boolean isBirthday = isBirthdayInput.equals("yes");

        // Create an instance of SpeedingTicket
        SpeedingTicket ticket = new SpeedingTicket(speed, isBirthday);

        // Output the result
        System.out.println("Ticket type: " + ticket.getTicketType());

        sc.close();
    }
}
