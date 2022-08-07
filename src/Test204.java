public class Test204 {
    public static void main(String[] args) {
        double x;

        x=(int)3.6 + (int)3.3; //3+3 -> 6
        System.out.println("a. 실수 : "+x+", 정수 : "+(int)x);

        x=(int)((2+3)*10.5); //5*10.5 -> 52.5 정수형으로 형변환 -> 52
        System.out.println("b. 실수 : "+x+", 정수 : "+(int)x);

        x=3/5*22.0; // 3/5 -> 0 * 22.0 -> 0
        System.out.println("c. 실수 : "+x+", 정수 : "+(int)x);
    }
}
