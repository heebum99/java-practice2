public class Number2 {
    public static void main(String[] args) {

        //행마다 요소 수가 다른 다차원 배열 초기화.
        int [] [] a = {
                {10,20,30},
                {40,50},
                {60,70,80,90}
        };

        //다차원 배열 선언만 할 경우
        int [] [] b = new int [3] [];
        b[0] = new int [3];
        b[1] = new int [2];
        b[2] = new int [4];

        System.out.println("일차원 배열의 요소수 "+ a.length);
        System.out.println("a[0]의 요소수 "+a[0].length);
        System.out.println("a[1]의 요소수 "+a[1].length);
        System.out.println("a[2]의 요소수 "+a[2].length);
    }
}
