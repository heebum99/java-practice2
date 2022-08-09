class Drink{
    String name; //상품명
    int price; //단가
    int count; //수량

    //생성자
    Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    int getTotalPrice(){ //금액을 계산
        return count*price;
    }

    static void printTitle(){ //static 메서드 -> 동일 클래스의 객체에서 공유
        System.out.println("상품명\t단위\t수량\t금액");
    }

    void printData(){
        System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
    }
}

class Alcohol extends Drink{
    float alcper; //알코올 도수

    //생성자
    Alcohol(String name, int price, int count, float alcper){
        super(name,price,count); //슈퍼 클래스의 생성자 호출
        this.alcper = alcper;
    }

    //메서드 오버라이딩
    static void printTitle(){
        System.out.println("상품명(도수[%])\t단위\t수량\t금액");
    }

    //메서드 오버라이딩
    void printData(){
        System.out.println(name+"("+alcper+")\t"+price+"\t"+count+"\t"+getTotalPrice());
    }
}

public class Payment {
    public static void main(String[] args) {
        Drink coffee = new Drink("커피",200,3);
        Drink tea = new Drink("녹차",150,2);
        Alcohol wine = new Alcohol("와인",300,2,15.0f);

        Drink.printTitle(); //static 메서드이기 때문에 클래스명.메서드()로 참조가능
        coffee.printData();
        tea.printData();
        System.out.println();

        Alcohol.printTitle();
        wine.printData();
        int sum = coffee.getTotalPrice()+tea.getTotalPrice()+ wine.getTotalPrice();
        System.out.println("\n*** 합계금액 "+sum+"원 ***");
    }
}
