public abstract class Vehicle {
    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //Getters

    public String getBrand() {
        return brand;
    }
    public int getKilometers() {
        return kilometers;
    }

    //Setters

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //Methods

    public abstract String doStuff();
}