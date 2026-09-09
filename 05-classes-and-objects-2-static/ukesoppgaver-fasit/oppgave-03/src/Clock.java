// Reference solution for exercise 3. The setters validate their input and refuse
// invalid values; the constructor reuses the setters so the same rules
// apply from the start.
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("Ugyldig timetall: " + hours);
        }
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Ugyldig minuttall: " + minutes);
        }
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Ugyldig sekundtall: " + seconds);
        }
    }

    public void showTime() {
        System.out.println(this.hours + " : " + this.minutes + " : " + this.seconds);
    }
}
