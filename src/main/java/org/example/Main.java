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
        /* Numeric Type have two categories :
            Integer : byte,short,int,long
            floating point types : float,double
        */

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

        /* Java String :
            string.length(), string.toUpperCase(), string.toLowerCase(), string.indexOf()
        */
        String myString = "Hello World";
//        System.out.println(myString.length());
//        System.out.println(myString.toUpperCase());
//        System.out.println(myString.toLowerCase());
//        System.out.println(myString.indexOf('H'));

        // Concatenation Sring
        String firstName = "Zaki";
        String lastName = " Fadlan";
//        System.out.println(firstName.concat(lastName));
//        System.out.println(firstName + lastName);
//        System.out.println(firstName + myInts + myInt);
        int intConcat = 10;
        int intConcats = 10;
//        System.out.println(firstName + (intConcat + intConcats));
//        Special char \' , \" , \\ , \n , \b , \r , \t , \f
        String specialChar = "\'Hello World\'!! \n\tthis is \"special\" character\b";
//        System.out.println(specialChar);

//        Java Operator :Arithmetic , Assignment, Comparasion, Logical, Bitwise
//        Arithmetic : +, -, *, /, %, ++, --
//        System.out.println("Example = " + (15 % 7));
//        intConcat++;
//        System.out.println(intConcat);
//        Assignment : =, +=, -=, *=, /=, %/, &=, |=, ^=, >>=, <<=
        int myX = 10;
        myX ^= 4;
//        System.out.println(myX);
//        Comparasion : (==, !=, >, <, >=, <=) it's return true or false;
        int compX = 4;
        int compY = 4;
//        System.out.println(compX != compY);
//        Logical: && , ||, !
//        System.out.println(!(compX == compY));

    }
}
