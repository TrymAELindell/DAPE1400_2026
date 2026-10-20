// Reference solution for exercise 27 (Del 2): the robot from the task.
public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void dance() {
        System.out.println(name + " danser fritt");
    }

    public void dance(String choreography) {
        System.out.println(name + " danser " + choreography);
    }

    public void dance(int rounds) {
        System.out.println(name + " danser " + rounds + " runder");
    }

    public void dance(String choreography, int rounds) {
        System.out.println(name + " danser " + choreography + " " + rounds + " ganger");
    }
}
