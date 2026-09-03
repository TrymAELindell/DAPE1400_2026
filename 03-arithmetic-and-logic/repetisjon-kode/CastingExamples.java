public class CastingExamples {
    public static void main(String[] args) {
        // V1 - Leftover dough calculation
        // This version is commented out because it cannot run at the same
        // time as V2 below (the variables would be declared twice).
        //int nrOfBread;
        //int doughDl = 10;
        //int doughDlPerBread = 3;

        //nrOfBread = doughDl / doughDlPerBread; // integer division gives the number of whole loaves
        //double doughDlLeftover = doughDl % doughDlPerBread; // modulus gives the dough left over
        //System.out.println(nrOfBread);
        //System.out.println(doughDlLeftover);

        // V2 - Number of loaves as a decimal number
        double nrOfBread;
        int doughDl = 10;
        int doughDlPerBread = 3;

        // Here we convert doughDl and doughDlPerBread to doubles, by
        // writing (double) in front of the variable names, to get the
        // number of loaves as a decimal number.
        // Note that we would not get an error even without the casts:
        // assigning the int result to nrOfBread, which is of type double,
        // is widening casting and happens automatically.
        nrOfBread = (double) doughDl / (double) doughDlPerBread; // we cast both variables to be explicit about what we want
        double doughDlLeftover = doughDl % doughDlPerBread;
        System.out.println(nrOfBread);
        System.out.println(doughDlLeftover);
    }
}
