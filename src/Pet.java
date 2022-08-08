class Cat{
    String name;
    String place;
    int age;

    void setData(String name, String place, int age){
        this.name = name;
        this.place = place;
        this.age = age;
    }

    //print() 메서드 오버로딩 -> 인수의 개수, 인수의 타입이 서로 다른 같은 이름의 메서드
    void print(){
        System.out.println(place+":"+name+" "+age+"살");
    }

    void print(String p, int a){
        place = p;
        System.out.println(place+":고양이는 "+a+"마리입니다.");
    }

    void print(String variety){
        System.out.println(place+":"+name+" "+age+"세 "+variety);
    }
}
public class Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.setData("로빈","우리집",10);
        cat2.setData("아이","옆 집",14);
        cat1.print("잡종");
        cat2.print();
        cat3.print("우리집",0);
    }
}
