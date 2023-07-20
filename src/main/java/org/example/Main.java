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

//        Conditionals : if...else, switch, while loop, for loop, break/continue
        /*  if ... else
            * if statement
                syntax : if (condition){ block condition to execute if true}
            * else statement
                syntax : if (condition){ block condition to execute if true}else{ block condition to execute if statement false }
            * else if statement
                syntax : if (condition1){ block condition to execute if true}else if (condition2){ block condition1 false and condition2 is true}else{ block condition to execute if statement false }
        */
       /* if (5 > 2) {
            System.out.println("this if statement ... ");
        }

        int firstState = 5;
        int secondState = 4;
        if (firstState < secondState) {
            System.out.println("This if else statement when if true");
        } else {
            System.out.println("this if else statement whe if false");
        }

        if (firstState < secondState) {
            System.out.println("This if else statement when if true");
        } else if (firstState > secondState) {
            System.out.println("condition1 getfalse and condition2 is true");
        } else {
            System.out.println("this if else statement whe if false");
        }
        */

//        Short Hand
        /*
            syntax : variable = (condition) ? expressionTrue :  expressionFalse;
            if more than one condition :
            syntax : variable = (condition1) ? expressionTrue1 : (condition2) ? expressionTrue2 : (condition3) ? expressionTrue3 : expressionFalse;

        int firstState = 1;
        int secondState = 1;
        String resultShortHandIfElse = (firstState > secondState) ? "short hand true" : "short hand false";
        String resultShortHandIfElse = (firstState > secondState) ? "Condition 1 true a > b" : (firstState < secondState) ? "Condition 2 true a < b" : "No One True";
        System.out.println(resultShortHandIfElse);

        */

        /* Switch
            switch(expression) {
              case x:
                // code block
                break;
              case y:
                // code block
                break;
              default:
                // code block
            }
         */
        /*int mySwitch = 4;
        switch (mySwitch) {
            case 1:
                System.out.println("myswitch is 1");
                break;
            case 2:
                System.out.println("myswitch is 2");
                break;
            case 3:
                System.out.println("myswitch is 3");
                break;
            case 4:
                System.out.println("myswitch is 4");
                break;
            default:
                System.out.println("Invalid Switch");
        }
         */

       /*
      Java Loop
      * While Loop
          while(condition){
            block code
          }
        example :
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;
            }
      * Foor Loop
          for (statement 1; statement 2; statement 3) {
              // code block to be executed
            }
            statment 1 = executed one time;
            statment 2 = defines the condition for executing the code block;
            statment 3 = executed every loop;

          example :
           for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
       * Nested Loop
            loop in loop
            for (int i = 0; i < 5; i++) {
                System.out.println("-parent / outer loop");
                for (int j = 0; j < 2; j++) {
                    System.out.println("--child / inner loop");
                }
        }
        * For-Each Loop
            * Exclusive for Array
            for (type variableName : arrayName) {
              // code block to be executed
            }
            example :
            String[] motor = {"Yamaha", "Kawasaki", "Honda"};
            for (String i : motor) {
                System.out.println(i);
            }
        */

        /*
        Java Break/Continue
        *Break = jump out to next code
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        *Continue = Skipping
         for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
         */

        /*
        Array
        Store multiple values in a single variable
        syntax : datatype[] variableName = {value1, value2,...., valuen};
        example : String[] car = {"Supra", "Lamborghini", "Ferrari"};
        *Acces element in array:
        System.out.println(car[0]);
        car[0] = "Volvo";
        System.out.println(car[0]);
        System.out.println(car.length);
        for (String i : car) {
            System.out.println(i);
        }
         */


    }
}
