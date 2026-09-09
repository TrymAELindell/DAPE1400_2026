// Reference solution for exercises 7 and 9-11.
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Per Hansen", "Osloveien 82", "22124512", 2005);
        person1.printPersonInfo(person1.calculateAge());

        Person person2 = new Person("Agnieszka Kowalska", "Storgata 1", "99887766", 1998);
        person2.printPersonInfo(person2.calculateAge());

        // Exercise 9: this line does not compile, because name is private.
        // Uncomment it to see what the compiler says.
        // person1.name = "Noen andre";

        // Exercise 10: the permitted way in - both contact details change at
        // once (Per goes to Copenhagen on exchange).
        person1.setContactInfo("Studiestræde 12", "+4540404040");
        person1.printPersonInfo(person1.calculateAge());

        // Exercise 11: the two getters. There is no setter for birthYear,
        // which is exactly what makes it read-only.
        System.out.println(person1.getName() + " er født i " + person1.getBirthYear() + ".");
    }
}
