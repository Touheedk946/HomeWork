package Task_05_Hometask_Language_Constructs;

import java.util.Scanner;

public class PartyOutcome3 {
    private int tea;
    private int candy;

    // Constructor to initialize tea and candy values
    public PartyOutcome3(int tea, int candy) {
        this.tea = tea;
        this.candy = candy;
    }

    // Method to determine the party outcome
    public int getPartyOutcome() {
        if (tea < 5 || candy < 5) { // input less then 5
            return 0; // Bad party
        } else if (tea >= 2 * candy || candy >= 2 * tea) { //
            return 2; // Great party
        } else {
            return 1; // Good party
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: tea and candy amounts
        System.out.print("Enter the amount of tea: ");
        int tea = sc.nextInt();

        System.out.print("Enter the amount of candy: ");
        int candy = sc.nextInt();

        // Create an instance of PartyOutcome
        PartyOutcome3 party = new PartyOutcome3(tea, candy);

        // Output the party outcome
        int outcome = party.getPartyOutcome();
        switch(outcome) {
            case 0:
                System.out.println("Party outcome: Bad");
                break;
            case 1:
                System.out.println("Party outcome: Good");
                break;
            case 2:
                System.out.println("Party outcome: Great");
                break;
        }

        sc.close();
    }
}
