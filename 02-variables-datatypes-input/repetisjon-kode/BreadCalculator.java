public class BreadCalculator {
    public static void main(String[] args) {
        // If we think of programs as recipes, then variables are the
        // ingredients. This program follows a recipe for (slightly sad)
        // bread: it calculates how many loaves we can bake based on how
        // much we have of two ingredients.

        // Variables must (almost) always be declared with a data type,
        // written before the variable name.
        double flourDl; // double is the data type, flourDl is the variable name
        flourDl = 2.0;  // a value is assigned with: variableName = value;

        double milkDl = 1.0; // declaring and assigning can also be done in one line
        // Other alternatives:
        // double flourDl, milkDl;            // declare several variables of the same type at once
        // double flourDl = 2, milkDl = 1.0;  // declare several and assign in one line

        // Variable names cannot:
        // double flour Dl;  // contain spaces
        // double 1milkDl;   // start with a digit
        // double milkDl;    // be declared twice — note this is only a problem
        //                   // when the data type is written both times.
        // Remove the // in front of the lines above to see how each one
        // leads to a compile error.

        // double is the data type for decimal numbers, so a + between two
        // double variables sums them like ordinary numbers. Here we compute
        // how much dough we get from the ingredients:
        double doughDl = flourDl + milkDl;

        // To work out how many loaves we can bake, we need a variable that
        // says how much dough one loaf takes. Note the meaningful variable
        // names — they make the code easier to understand, both for future
        // you and for the colleagues who will read your code.
        double doughDlPerLoaf = 2.5;

        // The number of loaves is the dough we have divided by the dough
        // one loaf takes:
        double numberOfLoaves = doughDl / doughDlPerLoaf;

        // For fun, we also record the profession and name of our baker.
        // For the ingredients we used double, since we wanted to calculate
        // with them. To store a series of characters we use the String
        // data type instead:
        String profession = "Baker";
        String lastName = "Hansen";

        // The + operator behaves differently for String than for double:
        // instead of adding, it joins (concatenates) the strings, so
        // "Baker" + " " + "Hansen" becomes "Baker Hansen".
        // Note the " " adding a space between the two words.
        String professionAndName = profession + " " + lastName;

        // Finally we print the baker and the number of loaves to the terminal:
        System.out.println(professionAndName + " kan lage " + numberOfLoaves + " brød");
    }
}
