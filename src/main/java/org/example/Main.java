package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Call Methods
//        myMethods();

        // Call method with multiple time
//        myMethods();
//        myMethods();

        // Call method with param
//        methodsParam("Parameter");

        // Call method with multiple param
//        methodMultParam("Zaki Fadlan", 23);

        /* if the method wanna have return value just replace void with datatype,
         the datatype used depends on what we need
         */
//        System.out.println("My age is " + methodInReturn(23) + " Years old");

        // Call Method with condition statement
//        methodCondition(19);

        // Call method overloading
//        System.out.println("my age if addtion with 4 is " + sameMethodPlus(23) + ", and your age is " + sameMethodPlus(23.12f));

        // Recursion
        methodRecursion(23, 60);

    }

    //  Create Methods/Function
    static void myMethods() {
        System.out.println("Im a method");
    }

    // Method with Param
    static void methodsParam(String myParam) {
        System.out.println("Im a method with param :" + myParam);
    }

    // Method with Multiple param
    static void methodMultParam(String name, int age) {
        System.out.println("My name is " + name + ", Im " + age + " Years old");
    }

    // Method with return Value
    static int methodInReturn(int age) {
        return age;
    }

    // Method with Condition Statement
    static void methodCondition(int age) {
        if (age < 18) {
            System.out.println("Acces denied - You are not old enough!!");
        } else {
            System.out.println("Acces granted - You are old enough !!");
        }
    }

    // Create same method
    static int sameMethodPlus(int age) {
        return age + 4;
    }

    static float sameMethodPlus(float age) {
        return age + 4;
    }

    // Method Recursion
    static int methodRecursion(int nowAge, int maxAge) {
        if (nowAge < maxAge) {
            System.out.println("Remaining Age : " + (maxAge - nowAge) + " Years");
            return methodRecursion(nowAge + 1, maxAge);
        } else {
            System.out.println("its your time go home");
            return 0;
        }
    }
}
