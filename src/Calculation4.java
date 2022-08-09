abstract class Calc3{
    int a;
    int b;

    abstract int result();

    void printResult(){
        System.out.println(result());
    }

    void setData(int m,int n){
        a=m;
        b=n;
    }
}

class Plus3 extends Calc3{
    int result(){
        return a+b;
    }
}

class Minus extends Calc3{
    int result(){
        return a-b;
    }
}

public class Calculation4 {
    public static void main(String[] args) {
        int x = 54, y = 12;
        Calc3 calc1 = new Plus3();
        Calc3 calc2 = new Minus();

        calc1.setData(x,y);
        calc2.setData(x,y);

        System.out.print(x+" + "+y+" = ");
        calc1.printResult();
        System.out.print(x+" - "+y+" = ");
        calc2.printResult();
    }
}
