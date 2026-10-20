// Reference solution for exercise 14: two calls drain the battery.
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Fairphone 5");
        System.out.println(phone);
        phone.call(10);
        System.out.println(phone);
        phone.call(45);
        System.out.println(phone);
    }
}
