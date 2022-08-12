public class Shift {
    public static void main(String[] args) {
        byte a = 10; //00001010
        byte b = 9; //00001001
        byte c = 1; //00000001
        System.out.println(a+" & "+b+" = "+(a&b)); //00001000 -> 8
        System.out.println(a+" | "+b+" = "+(a|b)); //00001011 -> 11
        System.out.println(a+" ^ "+b+" = "+(a^b)); //00000011 -> 3
        System.out.println("~10 = "+(~a)); //11110101 -> 최상위비트 = 1이면 -부호에 나머지 비트 반전 후 +1 ->00001010 +1 -> 절대값 11 = -11
        System.out.println(a+" << "+c+" = "+(a<<c)); //왼쪽으로 1비트 시프트 -> 00010100 -> 20
        System.out.println(a+" >>> "+c+" = "+(a>>>c)); //오른쪽으로 1비트 논리시프트 -> 00000101 -> 5
        System.out.println(-1*a+" >> "+c+" = "+(-1*a >> c)); //-10 -> 10 -> 9+1, 9 -> 00001001 -> 11110110을 오른쪽 1시프트 ->11111011 -> -5
    }
}
