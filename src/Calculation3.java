abstract class Calc2{
    int a;
    int b;

    abstract void answer();

    void setData(int m, int n){
        a = m;
        b = n;
    }
}

class Plus2 extends Calc2{
    void answer(){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}

public class Calculation3 {
    public static void main(String[] args) {
        Plus2 plus = new Plus2();
        plus.setData(27,32);
        plus.answer();
    }
}
