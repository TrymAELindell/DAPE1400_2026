// Reference solution for exercise 38 (Del 3): a personal trainer.
public class Trainer {
    private String name;
    private String phone;

    public Trainer(String name, String phone) {
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
