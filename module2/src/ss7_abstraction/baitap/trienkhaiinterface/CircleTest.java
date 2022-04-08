package ss7_abstraction.baitap.trienkhaiinterface;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("dien tich ban dau cua circle la:" + circle.getArea());
        circle.resize(Math.random()*100+1);
    }
}
