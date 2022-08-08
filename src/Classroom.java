class Test{
    String subject; //과목명
    int point; //점수

    void setPoint(String s, int p){
        subject = s;
        point = p;
    }

    String getPoint(){
        return subject+":"+point;
    }
}

class Student{
    int id; //학번
    String name; //학생이름
    int subnum; //과목수
    Test [] test; //Test 타입의 배열

    //생성자
    Student(int id, String name, int subnum){
        this.id = id;
        this.name = name;
        this.subnum = subnum;
        test = new Test[subnum];
        
        //Test 타입의 객체를 생성
        for(int j=0;j<subnum;j++){
            test[j] = new Test();
        }
    }

    String getName(){
        return id+":"+name;
    }

    int getGrade(){
        int sum = 0;
        for(int i=0;i<subnum;i++){
            sum+=test[i].point;
        }
        return sum;
    }

    //메서드 오버로딩
    int getGrade(int a){ //성적을 평가하는 메서드
        int base = 100 * subnum / a ;
        int rank = getGrade() / base + 1;
        return rank;
    }

    void printScore(){ //성적을 표시하는 메서드
        System.out.println(getName());
        for(int i=0;i<subnum;i++){
            System.out.print(test[i].getPoint()+" ");
        }
        System.out.println();
        System.out.println("총점 "+getGrade());
        int rank = 5;
        System.out.println(rank+"단계평가 "+getGrade(rank));
        System.out.println();
    }
}

public class Classroom {
    public static void main(String[] args) {

        //객체 생성
        Student kim = new Student(12,"김주현",3);

        kim.test[0].setPoint("국어",95);
        kim.test[1].setPoint("영어",83);
        kim.test[2].setPoint("수학",76);
        kim.printScore();

        Student lee = new Student(7,"이 진",3);

        lee.test[0].setPoint("국어",66);
        lee.test[1].setPoint("영어",97);
        lee.test[2].setPoint("수학",72);
        lee.printScore();
    }
}
