class Person {
    private String name; //상속x, 외부에서 접근x, getter & setter 이용

    void setName(String name){ //setter
        this.name = name;
    }

    String getName(){
        return name;
    }
}

class Girl extends Person {
    void print(){
        System.out.println(getName()+"양");
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Girl nara = new Girl();
        nara.setName("나라");
        nara.print();
    }
}
