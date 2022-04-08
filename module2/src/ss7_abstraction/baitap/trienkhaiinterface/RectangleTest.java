package ss7_abstraction.baitap.trienkhaiinterface;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        System.out.println("dien tich ban dau cua Circle la:"+rectangle.getArea());
        rectangle.resize(Math.random()*100+1);
    }
}
