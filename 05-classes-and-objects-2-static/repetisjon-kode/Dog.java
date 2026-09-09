public class Dog {

    // Three different types of fields (for variation)
    private String name;
    private boolean big;
    private int age;

    /**
     * As this class only has one constructor (with three parameters - name, big and age),
     * the only way to create a Dog object is to provide values for all three parameters.
     */
    public Dog(String name, boolean big, int age) {
        // This is where we set the state for the new object being made.
        this.name = name;
        this.big = big;
        this.age = age;
    }

    /**
     * Example of a method with no parameters (input)
     * and not returning anything to the caller (void).
     */
    public void presentYourself() {
        System.out.println("I am a dog, and my name is: " + name);
        System.out.println("I am " + age + " years old");
        if (big) {
            System.out.println("I am a big dog");
        } else {
            System.out.println("I am a small dog");
        }
    }

    /**
     * Another example of a method with no parameters (input)
     * and not returning anything to the caller (void).
     * See how the values of the fields in the object affect how the method behaves.
     */
    public void saySomething() {
        if (big) {
            System.out.println("VOFF VOFF!");
        } else {
            System.out.println("voff");
        }
    }

    /**
     * Example of a method returning something.
     * In this case a text (String) with information about the object's state
     * (the values of the object's fields).
     * We will later learn that the normal thing to use for this is a method called toString.
     */
    public String getInfo() {
        String textToReturn = "I am a dog, and my name is: " + name + "\n" +
                "I am " + age + " years old" + "\n";
        if (big) {
            textToReturn = textToReturn + "I am a big dog." + "\n";
        } else {
            textToReturn = textToReturn + "I am a small dog." + "\n";
        }
        return textToReturn;
    }

    /**
     * This method shows how a method can use both its input (the parameter "food")
     * and the object's fields (name, big, age) to do what it is supposed to do.
     * Methods are about doing something - some kind of action to be taken.
     */
    public void eat(String food) {
        System.out.println("Yummy, that was good!");
        System.out.println("As sure as my name is " + name + ", I LOVE " + food);
    }
}
