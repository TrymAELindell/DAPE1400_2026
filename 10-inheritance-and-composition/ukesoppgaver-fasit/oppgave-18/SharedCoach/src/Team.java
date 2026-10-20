// Reference solution for exercise 18: a team has a coach it can share with other teams.
public class Team {
    private String name;
    private Coach coach;

    public Team(String name, Coach coach) {
        this.name = name;
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void removeCoach() {
        this.coach = null;
    }

    public String toString() {
        if (coach == null) {
            return name + ", ingen trener";
        }
        return name + ", trener " + coach;
    }
}
