// Reference solution for exercise 15: a kettle has a water tank and guards its limit.
public class Kettle {
    private WaterTank tank;

    public Kettle() {
        this.tank = new WaterTank();
    }

    public void fill(double liters) {
        double newLevel = tank.getLiters() + liters;
        if (newLevel <= 1.7) {
            tank.setLiters(newLevel);
        } else {
            System.out.println("Avvist: vannkokeren tar maks 1.7 liter.");
        }
    }

    public double getWaterLevel() {
        return tank.getLiters();
    }
}
