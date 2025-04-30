class Car {
    String brand,model;
    double price;
    
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    void carDetails () {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Price: " + price);
    }
}
    
public class Q4_Carclass {
    
    public static void main(String[] args) {
        Car c1 = new Car("Toyota","Camry",25000);
        Car c2 = new Car("Ford","Mustang",35000);
        Car c3 = new Car("Honda","Civic",22000);
        
        System.out.println("Car 1:");
        c1.carDetails();
        
        System.out.println("\nCar 2:");
        c2.carDetails();
        
        System.out.println("\nCar 3:");
        c3.carDetails();
    }
    
}