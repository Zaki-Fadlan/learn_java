package org.example;

public class Animal {
    // If you don't want the ability to override existing values, declare the attribute as final:
    //    final String category = "Herbovora";
    //    String name = "Rabbit";
    //    String eat;
    private String animalName;
    private String species;

    public void animalSound() {
        System.out.println("Animal Make Sound");
    }

    public int price(int age, int adultPrice) {
        return adultPrice / age;
    }

}

// inheritance
class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Woof woof");
    }
}
