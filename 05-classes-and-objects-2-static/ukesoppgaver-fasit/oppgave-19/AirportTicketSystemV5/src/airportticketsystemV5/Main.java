package airportticketsystemV5;

import airportticketsystemV5.ticketing.Purchase;

// Reference solution for exercise 19. The classes are organized in packages:
// ticketing handles tickets, receipts and purchases; pricing knows the
// tax rules.
public class Main {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase();

        purchase1.issueTicket();
        purchase1.issueReceipt();

        // A ticket can only be printed once
        purchase1.issueTicket();

        Purchase purchase2 = new Purchase();

        purchase2.issueTicket();
        purchase2.issueReceipt();

        purchase2.issueTicket();
    }
}
