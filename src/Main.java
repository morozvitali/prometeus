public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 2018);
        System.out.println(car instanceof Vehicle);
        car.printCarInfo();
    }
}

class Vehicle {
    // PUT YOUR CODE HERE
    public String model;
    public int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;

        }
    }

    class Car extends Vehicle {
        // PUT YOUR CODE HERE

        public int year;

        public Car(String model, int speed, int year) {
        super(model,speed);
        this.year = year;
        }

        public void printCarInfo() {
            System.out.println(this.model);
            System.out.println(this.speed);
            System.out.println(this.year);
        }
    }