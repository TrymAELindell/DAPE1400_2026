public class CastingRoundingErrors {
    public static void main(String[] args) {
        // Even though casting from int/long to float/double is widening,
        // information can still be lost, because float and double cannot
        // represent every whole number an int/long can store. There are
        // simply not enough bits to represent all the possible whole
        // numbers exactly.
        // This generally happens for large whole numbers, so we can
        // demonstrate the effect by converting the largest whole number a
        // long can represent to a float:
        System.out.println("Casting med avrundingsfeil");
        long bigInteger = Long.MAX_VALUE;
        float longAsFloat = bigInteger;
        System.out.println(Long.MAX_VALUE);
        System.out.println(longAsFloat);
        // Information is lost: the lower digits of the whole number are
        // turned into zeros.
        // long  - 9223372036854775807
        // float - 9223372000000000000 (printed as 9.223372E18)


        System.out.println("\nCasting uten avrundingsfeil"); // blank line between the printouts

        // For small whole numbers this is not a problem:
        long smallInteger = 10;
        longAsFloat = smallInteger;
        System.out.println(smallInteger);
        System.out.println(longAsFloat);
    }
}
