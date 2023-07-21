package org.example;

import org.example.exam.Phone;
import org.example.exam.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // static method can acces without making object
//    static void myMethod() {
//        System.out.println("thos static method");
//    }

    public static void main(String[] args) {

        /*
        OOP
        */

//        Car myCarObj = new Car();
//        System.out.println(myCarObj.x);

//        Animal myObjAnimal = new Animal();
//        Animal seconAnimal = new Animal();
//        System.out.println(myObjAnimal.name);
//        System.out.println(seconAnimal.name);

        // modify attribute
//        myObjAnimal.eat = "Grass";
//        myObjAnimal.name = "Horse";
//        System.out.println(myObjAnimal.name);
//        System.out.println(myObjAnimal.eat);
        // try modifiy final value get error
        //        myObjAnimal.category = "Carnivora";

        // access method with static
//        myMethod();
        // acces method public
//        Main publicMethod = new Main();
//        publicMethod.mySecondMethod();

        // acces Distric class
//        District myDistrict = new District();

//        System.out.println(myDistrict.districtName);
//
//        Animal myDog = new Dog(); // this polymorphism
//        System.out.println(myDog.price(20, 5000000));
//        myDog.animalSound();

        // Exam Polymorphism
        Product myProduct = new Product("Bamboo", 12000, "Have 12 cm Diameter");
//        myProduct.showInfo();
        Product myPhone = new Phone("Samsung A33", +300, "this phose is very strong", 12);
        myPhone.showInfo();

    }

//    public void mySecondMethod() {
//        System.out.println("this public method");
//    }
}

