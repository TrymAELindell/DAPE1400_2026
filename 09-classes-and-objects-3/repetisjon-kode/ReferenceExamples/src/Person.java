import javax.swing.JOptionPane;

public class Person {
    private int age;
    private String birthMonth;

    public Person(int age, String birthMonth) {
        this.age = age;
        this.birthMonth = birthMonth;
    }

    public Person() {
        this.age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));
        this.birthMonth = JOptionPane.showInputDialog("Hvilken måned ble du født?");
    }

    public void incrementAge() {
        int ageIncrement = 1;
        System.out.println("Du er blitt " + ageIncrement + " år eldre");
        this.age++;
    }


    public String incrementAge(int ageIncrement) {
        this.age += ageIncrement;
        return "Du er blitt " + ageIncrement + " år eldre";
    }


}
