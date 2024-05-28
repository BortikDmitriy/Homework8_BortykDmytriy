
interface Shape {
    String getName();
}


class Circle implements Shape {
    @Override
    public String getName() {
        return "Circle";
    }

}


class Quad implements Shape {
    @Override
    public String getName() {
        return "Quad";
    }

}


class Triangle implements Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

}


class Rectangle implements Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }

}


class Cuboid implements Shape {
    @Override
    public String getName() {
        return "Cuboid";
    }

}


class ShapeNamePrinter {
    static void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}
