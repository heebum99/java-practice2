public class VarargsSample {
    int getMax(int...nums){ //가변 인수 메서드 정의, 인수 없이도 호출 가능
        int max = 0;
        for(int i =0; i <nums.length;i++){
            if(i==0){
                max = nums[0];
            }
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        VarargsSample vt = new VarargsSample();
        System.out.println("(2,5,7,0,1)최대값:"+vt.getMax(2,5,7,0,1));
        System.out.println("(100,54,1) 최대값:"+vt.getMax(100,54,1));
        System.out.println("(10)       최대값:"+vt.getMax(10));
    }
}
