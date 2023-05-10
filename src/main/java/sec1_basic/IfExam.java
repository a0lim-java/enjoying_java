package sec1_basic;

import java.sql.SQLOutput;

public class IfExam {
    public static void main(String[] args){
        int a = 10;
        int value = (a > 5) ? 20 : 30; // 삼항연산자: (a > 5)가 참이면 20, 거짓이면 30을 반환함
        System.out.println(value);
    }
}
