class Laptop {
    String brand;
    int RAM,price;
    
    Laptop(String b,int ram,int p) {
        this.brand = b;
        this.RAM = ram;
        this.price = p;
    }
    
    void LaptopDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + "gb");
        System.out.println("Price: " + price + "/-");
    } 
}


public class Q10_Laptop {
    
    public static void main(String[] args) {
        Laptop lp = new Laptop("ACER",16,55000);
        
        lp.LaptopDetails();
    }
    
}