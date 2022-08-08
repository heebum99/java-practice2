public class ex302 {
    public static void main(String[] args) {

        //1~100의 숫자 중 소수찾기.
        int max = 100;
        boolean [] a = new boolean[max];

        //배열 초기화
        for(int i=0;i<max;i++){
            a[i]=true;
        }

        //소수 판단
        //a[0] = 1, a[1] = 2 .... a[99] = 100
        for(int i=2;i<max;i++){ //2부터 100까지 소수 찾기.
            if(a[i-1]) { //어떤 수가 소수라면 그 수의 배수들은 소수가 아닌것을 이용.
                for (int j = 2; i * j <= max; j++) {
                    a[i * j - 1] = false;
                }
            }
            else{
                continue;
            }
        }

        for(int i=1;i<max;i++){
            if(a[i]){ //소수만 출력
                System.out.print((i+1)+" ");
            }
        }
    }
}