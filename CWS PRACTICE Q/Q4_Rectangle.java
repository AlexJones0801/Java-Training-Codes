class Rectangle {
    int length, width;
}

public class Q4_Rectangle {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 30;  
        rect.width = 14;   
        int area = rect.length * rect.width;
        System.out.println("Area of the rectangle: " + area);
    }
}