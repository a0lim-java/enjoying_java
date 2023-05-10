package sec1_basic;

public class WhileExam1 {
    public static void main(String[] args){
        int i = 0;
        while(i++ < 10){ // 후위 증감식: 비교 후 i++(증가) 실행
            System.out.println(i);
        }
    }
}
