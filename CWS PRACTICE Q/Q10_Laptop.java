class Laptop {
    String brand;
    int ram,storage;
}

public class Q10_Laptop {
    
    public static void main(String[] args) {
        Laptop lp1 = new Laptop();
        Laptop lp2 = new Laptop();
        Laptop lp3 = new Laptop();
        
        lp1.brand = "Acer";
        lp1.ram = 16;
        lp1.storage = 512;
        
        lp2.brand = "Asus";
        lp2.ram = 16;
        lp2.storage = 512;
        
        lp3.brand = "Dell";
        lp3.ram = 8;
        lp3.storage = 256;
        
        System.out.println("Laptop 1: " + lp1.brand + " " + lp1.ram + "gb ram " + lp1.storage + "gb storage");
        System.out.println("Laptop 2: " + lp2.brand + " " + lp2.ram + "gb ram " + lp2.storage + "gb storage");
        System.out.println("Laptop 3: " + lp3.brand + " " + lp3.ram + "gb ram " + lp3.storage + "gb storage");
    }
    
}