// Multi Level Inheritance

class Device {
    void powerOn() {
        System.out.println("Powering...");
    }
}

class Laptop extends Device {
    void boot() { 
        System.out.println("Booting...");
    }
}

class GamingLaptop extends Laptop {
    void startGame() { 
        System.out.println("Start Boyyy...");
    }
}

public class Q4_DeviceInherit {
    
    public static void main(String[] args) {
        GamingLaptop gl = new GamingLaptop();
        
        gl.powerOn();
        gl.boot();
        gl.startGame();
    }
    
}