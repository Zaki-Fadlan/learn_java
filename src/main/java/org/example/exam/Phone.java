package org.example.exam;


// Inheritance
public class Phone extends Product {
    private int camera;

    public Phone(String name, double price, String description, int camera) {
        super(name, price, description);
        this.camera = camera;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void showInfo() {
        System.out.println("Name : " + getName() + "\nprice : " + getPrice() + "$\nCamera : " + camera + " MP" + "\nDescription : " + getDescription());
    }
}
