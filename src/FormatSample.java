import java.util.Date;

public class FormatSample {
    public static void main(String[] args) {
        int a =10;
        double b = 3.24;
        System.out.printf("%10d\n",a);
        System.out.printf("X %8.5f\n",b);
        System.out.printf("-----------\n");
        System.out.printf("%10f\n\n",a*b);

        Date c = new Date();
        System.out.printf("%tH시 %tM분 %tS초\n",c,c,c);
    }
}
