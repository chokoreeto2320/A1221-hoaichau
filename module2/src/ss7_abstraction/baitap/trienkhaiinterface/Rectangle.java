package ss7_abstraction.baitap.trienkhaiinterface;

public class Rectangle implements Resizeable{
    @Override
    public void resize(double percent) {
        double resuit=Math.floor(getArea()+(getArea()/100*percent));
        System.out.println("Rectangle dau khi tang len "+Math.floor(percent) +" pham tram la "+resuit);

    }
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

}
