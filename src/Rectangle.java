public class Rectangle {
    // Tao lop rectangle, khai bao cac thuoc tinh(properties), dinh nghia phuong thuc khoi tao (contructors).
    double width, height;

    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Dinh nghia cac phuong thuc getArea, getPerimeter, display.
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
