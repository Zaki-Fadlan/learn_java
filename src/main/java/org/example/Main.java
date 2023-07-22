package org.example;

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
//        Product myProduct = new Product("Bamboo", 12000, "Have 12 cm Diameter");
//        myProduct.showInfo();
//        Product myPhone = new Phone("Samsung A33", +300, "this phose is very strong", 12);
//        myPhone.showInfo();

//        Scanner
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Please input your name : ");
//        String myName = myScanner.nextLine();
//        System.out.println("Please input your Age : ");
//        int myAge = myScanner.nextInt();
//        System.out.println("Please input your DOB with format dd-mm-yyyy!");
//        String myDob = myScanner.nextLine();
//        SimpleDateFormat mydate = new SimpleDateFormat("dd-MM-yyyy");
//        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println(myDob.formatted(myFormat));
//        Date myBirthDay;
//        Long today = System.currentTimeMillis();
//        try {
//            myBirthDay = mydate.parse(myDob);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Name : " + myName);
//        System.out.println("Date of Birth : " + myDob.formatted(mydate));
//        System.out.println("Age : " + ((today - myBirthDay.getTime()) / (1000L * 60L * 60L * 24L * 365L)));

//        ArrayList
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("BMW");
//        cars.add("Merchedez");
//        System.out.println(cars);
//        System.out.println(cars.get(1));
//        cars.set(0, "Ferrari");
//        System.out.println(cars);
//        cars.remove(1);
//        System.out.println(cars);
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//        for (String i : cars) {
//            System.out.println(i);
//        }
//        cars.add("AUX");
//        Collections.sort(cars);
//        System.out.println(cars);

//        HashMap
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//        capitalCities.put("England", "London");
//        capitalCities.put("USA", "WashingtonDC");
//        System.out.println(capitalCities.get("England"));
//        capitalCities.clear();
//        System.out.println(capitalCities);
//        for (String i : capitalCities.keySet()) {
//            System.out.println(i);
//        }

//        HashSet
//        HashSet<String> cars = new HashSet<>();
//        cars.add("BMW");
//        cars.add("Merci");
//        cars.add("Lambo");
//        Iterator<String> it = cars.iterator();
//        System.out.println(it.hasNext());
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    interface StringFunction {
        String run(String str);
    }

//    public void mySecondMethod() {
//        System.out.println("this public method");
//    }
}

