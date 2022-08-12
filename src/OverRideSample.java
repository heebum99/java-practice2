class SuperZ{
    Number num(){
        return null;
    }
}

class SubX extends SuperZ{
    Double num(){ //반환 타입이 다른 오버라이딩 -> Double이 Number 형의 서브 클래스이기 때문에 가능.
        return new Double(10); //랩퍼 클래스
    }
}

public class OverRideSample {
    public static void main(String[] args) {
        SubX xx = new SubX();
        System.out.println(xx.num());
    }
}
