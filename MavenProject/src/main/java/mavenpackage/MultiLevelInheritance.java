package mavenpackage;

class Vehicle {
		    void start() {
		        System.out.println("Vehicle is starting");
		    }
		}

		class Car extends Vehicle {
		    void drive() {
		        System.out.println("Car is being driven");
		    }
		}

		class ElectricCar extends Car {
		    void chargeBattery() {
		        System.out.println("Electric car battery is charging");
		    }
		}

		public class MultiLevelInheritance {
		    public static void main(String[] args) {
		        ElectricCar tesla = new ElectricCar();

		        tesla.start();          
		        tesla.drive();          
		        tesla.chargeBattery();  
		    }
		}





