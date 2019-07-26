public class Circle extends Shape {
    private Double radius;
    private Double x;
    private Double y;
    public Circle(String color, String name,Double radius, Double x, Double y) {
        super(color, name);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("radius = %f, x = %f, y = %f", radius, x, y);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        //System.out.println("do something in Circle");
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Deprecated
    @SuppressWarnings("You should use doTaskAA instead")
    public void doTaskA(){
        System.out.println("task AA");
    }
}
