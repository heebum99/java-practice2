public class Test301 {
    public static void main(String[] args) {

        //1부터 10까지의 짝수와 홀수의 합 구하기
        int sum1 = 0, sum2 = 0;
        for(int i=1;i<=10;i++){
            if(i%2==0){ //짝수
                sum2 = sum2 + i;
            }
            else
                sum1 = sum1 + i;
        }
        System.out.println("1~10의 홀수 합은: "+sum1);
        System.out.println("1~10의 짝수 합은: "+sum2);
    }
}
