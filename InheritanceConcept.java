

class Vehicle {

    public String name;
    public int doors;
    public double weight;

    public Vehicle(String name, int doors, double weight) {

        this.name = name;
        this.doors = doors;
        this.weight = weight;
    }

    public void startVehicle() {
        System.out.println("Vehicle started");
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }
    public double getWeight() {
        return weight;
    }

}
 class Car extends Vehicle {

    public int wheels;
    public int headlights;

    public Car(String name, int doors, double weight, int wheels, int headlights) {

        super(name, doors, weight);
        this.wheels = wheels;
        this.headlights = headlights;
    }

    public void handSteering(char direction) {
        switch (direction) {
            case 'R':
                System.out.println("Car is turning right");
                break;
            case 'L':
                System.out.println("Car is turning left");
                break;

            default:
                System.out.println("Car is not taking a turn.");
                break;
        }



    }

     public void lights(String on) {
         System.out.println("Lights On ");
     }

     public class HondaCity extends Car {

        private String opentop;

        public HondaCity(String opentop, String name, int doors, double weight, int wheels, int headlights) {

            super(name, doors, weight, wheels, headlights);
            this.opentop = opentop;
        }


        public void startVehicle() {
            System.out.println("started Vehicle");
            super.startVehicle();
        }

        public String getopentop() {
            return opentop;
        }
    }
}


     class InheritanceConcept {

        public static void main(String[] args) {
            Car car = new Car("HondaCity", 4, 70, 4, 4);
            System.out.println(car.getName());
            System.out.println("doors - " +car.getDoors());
            car.startVehicle();
            car.lights("on");
            car.handSteering('L');
            car.handSteering('R');
            System.out.println("Weight - " +car.getWeight());


        }
    }
