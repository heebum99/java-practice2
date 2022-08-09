class Study2{
    String name; //과목명
    String teacher; //과목담임

    //생성자
    Study2(String name, String teacher){
        this.name = name;
        this.teacher = teacher;
    }

    void printmsg(){
        System.out.println(name+" 과목의 선생님은 "+teacher+"입니다.");
    }
}

class Sub_Java extends Study2{
    String subTeacher; //과목부담임

    Sub_Java(String name,String teacher, String subTeacher){
        super(name,teacher); //슈퍼클래스 생성자 호출
        this.subTeacher = subTeacher;
    }

    //메서드 오버라이딩
    void printmsg(){
        System.out.println(name+" 과목의 선생님은 "+teacher+"이고 과목 부담임은 "+subTeacher+"입니다.");
    }
}

public class Study_Java {
    public static void main(String[] args) {
        Sub_Java s1 = new Sub_Java("자바","성안당","김희범");
        s1.printmsg();
    }
}
