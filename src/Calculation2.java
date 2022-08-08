class Calc{
    //반환 값이 있고 인자가 2개인 메서드
    int add(int a, int b){
        return a+b;
    }
}
public class Calculation2 {
    static void disp(){
        int c;
        Calc calc = new Calc();
        c = calc.add(8, 9);
        System.out.println("8 + 9 = "+c);
    }
    public static void main(String[] args) {
        disp();
    }
}
