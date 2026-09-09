public class DogMain {
    // How can we test the Dog class? We need a method. Let's use main.

    // Testing the different methods we created in Dog using main.
    public static void main(String[] args) {
        // We create two objects. They will have different states as we provide different values for them.
        // We have to use -String boolean int- in that order, as that is what the constructor accepts.
        Dog d1 = new Dog("Fido", true, 4);
        Dog d2 = new Dog("Passop", false, 14);
        // Now that the objects are created (and we have references to them; d1 and d2),
        // we can test the methods on both objects.
        // See how System.out.println is used to make the console output easier to follow.
        System.out.println("Letting the objects present themselves:");
        d1.presentYourself();
        d2.presentYourself();

        System.out.println("Letting the objects say something:");
        d1.saySomething();
        d2.saySomething();

        // Now we call a method that returns something - a String.
        // We need to place the returned text somewhere. Aha - a String variable!
        System.out.println("Here is what is returned from getInfo():");
        String s1 = d1.getInfo(); // See how the text returned from the method is stored in variable s1
        System.out.println(s1);
        String s2 = d2.getInfo(); // and s2
        System.out.println(s2);

        System.out.println("Providing food..");
        d1.eat("margbein");
        d2.eat("brød");
    }
}
