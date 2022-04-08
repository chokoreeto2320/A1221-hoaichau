package ss6.thuchanh;

public class hecacdoituonghinhhoc {
    public static class Shape {
        private String color = "green";
        private boolean filled = true;

        public Shape () {
        }
        public Shape (String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
    public class ShapeTest {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);

            shape = new Shape("red",false);
            System.out.println(shape);

            }
        }
    }



