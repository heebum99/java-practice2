//추상클래스 Figure
abstract class Figure{
    abstract void area(); //면적
    abstract void around(); //둘레

    void measure(){
        area();
        around();
        System.out.println();
    }
}

//추상클래스의 서브클래스 Square
class Square extends Figure{
    double side;
    double height;

    //생성자
    Square(double side){
        this.side = side;
    }

    Square(double side, double height){
        this.side = side;
        this.height = height;
    }

    public void area(){ //추상메서드 오버라이딩
        System.out.println("사각형의 면적:"+(side*height));
    }

    public void around(){ //추상메서드 오버라이딩
        System.out.println("사각형의 둘레:"+(2*(side+height)));
    }
}

//추상클래스의 서브클래스 Circle
class Circle extends Figure{
    final double pi = 3.14; //final -> 변수의 값을 바꿀수 없음
    double radius;

    //생성자
    Circle(double radius){
        this.radius = radius;
    }

    public void area(){ //추상메서드 오버라이딩
        System.out.println("원의 면적:"+(radius*radius*pi));
    }

    public void around(){ //추상메서드 오버라이딩
        System.out.println("원의 둘레:"+(2*radius*pi));
    }
}

public class SizeFigure {
    public static void main(String[] args) {
        Figure fig1 = new Square(2.5);
        Figure fig2 = new Square(2.3,3.7);
        Figure fig3 = new Circle(3.6);

        fig1.measure();
        fig2.measure();
        fig3.measure();
    }
}
