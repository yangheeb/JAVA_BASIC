package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}


//boolean isSquare() {
//        return width == height;
//    }
//여기서 return을 this.width == this.height;로 해야하는데 ~