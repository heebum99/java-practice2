import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class InOut {
    public static void main(String[] args) {
        try{
            String filename = "file.dat"; //파일명 지정
            FileOutputStream out = new FileOutputStream(filename); //binary 파일 쓰기
            FileInputStream file = new FileInputStream(filename); //binary 파일 읽기
            InputStreamReader in = new InputStreamReader(file); //binary 입력 -> 문자 입력 변환

            for(byte i =1; i <= 10; i ++){ //binary 파일에 데이터 작성
                out.write(i);
            }
            int c;
            while((c=in.read()) != -1){ //binary 입력 -> 문자 입력 변환, 데이터 읽고 표시
                System.out.print(c+" ");
            }

            in.close();
            out.close();
        }
        catch (IOException ie){
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
