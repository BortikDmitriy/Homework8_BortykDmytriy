
public class Shape {
  public String getName();
}


public class Circle extends Shape {
    @Override
     public String getName() {
        return "Circle";
    }

}


public class Quad extends Shape {
    @Override
     public String getName() {
        return "Quad";
    }

}


public class Triangle extends Shape {
    @Override
    public  String getName() {
        return "Triangle";
    }

}


public class Rectangle extends Shape {
    @Override
     String getName() {
        return "Rectangle";
    }

}


public class Cuboid extends Shape {
    @Override
    public  String getName() {
        return "Cuboid";
    }

}


public class ShapeNamePrinter {
    static void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }
}
