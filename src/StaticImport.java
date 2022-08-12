import static java.lang.Math.log;
public class StaticImport {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a+"를 밑으로 하는 "+b+"의 대수 = "+log(b) / log(a));
    }
}
