// Reference solution for exercise 18: the Coach class, given in the handout.
public class Coach {
    private String name;
    private String phone;

    public Coach(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return name + " (tlf " + phone + ")";
    }
}
