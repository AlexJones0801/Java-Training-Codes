/* Q2. Create two interfaces A and B. Both interfaces should have a method named display().
Then, create a class Demo that implements both interfaces.
Implement the display() method and call it in the main method using a Demo object. */

package pro;

interface A {
    void display();
}

interface B {
    void display();
}

class Demo implements A, B {
    public void display() {
        System.out.println("Display method from both interfaces A and B");
    }
    
}

public class Q2_interfacesANB {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
