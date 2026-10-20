// Reference solution for exercise 23: a setter that stores the name in the field.
public class Student {
    private String name;

    public void setName(String name) {
        // Uten this treffer begge sidene av likhetstegnet parameteren, og fieldet
        // forblir null.
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
