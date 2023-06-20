class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Clio", 10000);
        Boat boat = new Boat("Titanic", 1000000);
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}