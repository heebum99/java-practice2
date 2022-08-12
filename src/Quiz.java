import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class QandA{
    String question; //문제 문자열
    String [] answer; //정답 문자열

    //생성자
    QandA(String question,String answerline){ 
        this.question = question;
        StringTokenizer token = new StringTokenizer(answerline,","); //인수로 받은 문자열을 ,를 구분단위로 분할
        answer = new String[token.countTokens()];
        for(int i =0; token.hasMoreTokens(); i++){
            answer[i] = token.nextToken();
        }
    }

    //정답을 판정하고 정답 문자열을 돌려준다.
    String [] getCorrect(String inputline){
        //회답을 분할
        StringTokenizer token = new StringTokenizer(inputline,",");
        int inputnum = token.countTokens();
        String [] input = new String [inputnum];
        for(int i=0; token.hasMoreTokens();i++){
            input[i] = token.nextToken();
        }
        
        //중복체크
        for(int i=1; i<inputnum; i++){
            for(int j=i-1; j>=0; j--){
                if(input[i].equals(input[j])){ //같은 문자열이 있으면 문자열 0대입
                    input[i] = "0";
                }
            }
        }
        
        //조합
        int correctnum = 0; //정답을 맞춘 수
        for(int i = 0; i<inputnum; i++){
            for(int j = 0; j<answer.length;j++){
                if(input[i].equals(answer[j])){
                    correctnum++;
                }
            }
        }

        String [] correct = new String [correctnum];
        int k = 0;
        for(int i=0; i<inputnum; i++){
            for(int j=0; j< answer.length; j++){
                if(input[i].equals(answer[j])){
                    correct[k] = input[i];
                    k++;
                }
            }
        }

        return correct;
    }
}

public class Quiz {

    static String getInput(int answernum){
        String input = new String();
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine();
            StringTokenizer token = new StringTokenizer(input,",");
            int inputnum = token.countTokens();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            return input;
        }
    }

    public static void main(String[] args) {
        //문제와 해답
        QandA qa = new QandA("요일(영어)","Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday");
        System.out.print("[문제] "+qa.question+"을 「,」로 구분하여 답하세요.\n");

        int answernum = qa.answer.length; //회답의 개수
        String input = getInput(answernum);
        String [] correct = qa.getCorrect(input);
        int correctnum = (correct == null) ? 0: correct.length;

        //정답수가 0이 아닐 경우, 맞춘 답을 표시
        if(correctnum > 0){
            System.out.println("정답");
            for(int j=0; j<correctnum; j++){
                System.out.print(correct[j]+" ");
            }
            System.out.println();
            System.out.print(correctnum + " / " + answernum + " 정답");
            if(correctnum == answernum){ //전부 맞춘 경우
                System.out.println("  정말 잘했습니다 !");
            }
            else if(correctnum > answernum/2){ //절반 이상 맞춘 경우
                System.out.println(" 잘했습니다.");
            }
            else{ //절반 이하로 맞춘 경우
                System.out.println(" 아직 멀었군요.");
            }
        }

    }
}
