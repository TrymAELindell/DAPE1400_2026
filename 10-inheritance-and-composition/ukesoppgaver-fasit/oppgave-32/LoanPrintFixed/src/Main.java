// Reference solution for exercise 32 (Del 2): borrow, print, return, print.
public class Main {
    public static void main(String[] args) {
        Member member = new Member("Jonas");
        member.borrow(new Book("Doppler"));
        member.printLoan();
        member.returnBook();
        member.printLoan();
    }
}
