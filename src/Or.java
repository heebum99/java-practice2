public class Or {
    public static void main(String[] args) {
        int a = 3, b = 4;
        boolean x, y;

        x = (a < 0); //false
        y = (b > 0); //true
        System.out.println((a == 3)&&(b == 3)); //true && false -> false
        System.out.println(x || y); //true || false -> true
    }
}
