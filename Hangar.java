public class Hangar {

    public static void main(String[] args) {
       
        Car Fiat = new Car("Multipla", 120);

        Boat Ship = new Boat("Black Pearl", 80);

        System.out.println(Fiat.doStuff());
        System.out.println(Ship.doStuff());
    }
}