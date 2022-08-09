class Purse {
    static int money = 0; //static -> 같은 클래스의 객체들끼리 값을 공유

    void printMoney(int in, int out){
        money = money + in - out;
        if(money < 0){
            System.out.println((-1 * money) + "원 부족합니다.");
        }
        else {
            System.out.println("잔금은 "+money+"원입니다.");
        }
    }
}
public class Shopping {
    public static void main(String[] args) {
        Purse store1 = new Purse();
        Purse store2 = new Purse();

        //money 필드가 static으로 선언 -> money 필드를 store1,2에서 공유
        store1.printMoney(1000,100); //900
        store2.printMoney(0,250); //650
        store1.printMoney(0,800); //-150
    }
}
