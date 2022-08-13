public class BoxSample {
    public static void main(String[] args) {
        int prim_int = new Integer(10); //랩퍼 클래스 -> 기본 데이터형으로 변환
        System.out.println("값: "+prim_int);

        Integer wrap_Int = prim_int * 10; //기본 데이터형 -> 랩퍼 클래스로 변환
        System.out.println("값: "+wrap_Int);
    }
}
