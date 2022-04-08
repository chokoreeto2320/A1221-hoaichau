package ss7_abstraction.baitap.trienkhaiinterface;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0]= new Rectangle();
        resizeables[1]= new Rectangle();
        resizeables[2]= new Rectangle();
        for (Resizeable resizeable:resizeables){
            System.out.println(resizeable);
        }

    }
}
