public class Rectangle extends Shape{
    //subclass = child class
    private Double width;
    private Double height;

    public Rectangle(String color, String name, Double width, Double height) {
        super(color, name); //super = "this" of parent
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("width = %f, height = %f",width, height);
    }

    @Override
    public Double getArea() {
        return width * height;
    }
}
