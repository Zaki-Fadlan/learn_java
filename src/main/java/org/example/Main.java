package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*  Variable
                Syntax : "type variableName = value;"
            Multiple Variable
                Syntax : "type variableName = value, variableName = value,variableName = value;"
            Assign Value to Multiple Variable
                Syntax : "type variableName, variableName,variableName;"
                variableName, variableName, variableName = 5;
        */
        int thisVariable = 9;
        int firstVariable = 1, secondVariable = 2, thirdVariable = 3;
        int assignVtofirstVar, assignVtosecVar, assignVtothirdVar;
        assignVtofirstVar = assignVtosecVar = assignVtothirdVar = 2;


        // DataType in Java
        //      Primitive : boolean, char, short, int, long, double, float
        boolean isThisBoolean = true;
        byte isThisByte = 127;
        short isThisShort = 32767;
        int isThisInt = 2147483647;
        long isThisLongs = 9223372036854775807L;
        char isThisChar = 'C';
        float isThisFloat = 8.99f;
        double isThisDouble = 8.99;

        //      Non-Primitive : String, Array etc
        String isThisString = "Hellow World!";
        Object[] mixArray = {"Hello", 123, "Java", 456};
        int[] arrayNumeric = {1, 2, 3, 4, 5};

        /*  Java type casting :
                Widening Casting (Auto) > : byte -> short -> char -> int -> long -> float -> double
                Narrowing Casting (Manual) < : byte <- short <- char <- int <- long <- float <- double
        */
        //      Widening
        int myInt = 9;
        double myDouble = myInt;
        //      Narrow
        double myDoubles = 9.0;
        int myInts = (int) myDoubles;

    }
}
