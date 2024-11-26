public class Shape {
    public String type;

    public Shape(String type) {
        this.type = type;
    }

    public void draw() {
        if (type.equals("Circle")) {
            System.out.println("Drawing a Circle...");
        } else if (type.equals("Rectangle")) {
            System.out.println("Drawing a Rectangle...");
        }
    }
}
