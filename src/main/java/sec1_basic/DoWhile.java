package sec1_basic;


/** 무조건 1번은 실행하게 할 때 사용
 * 변수의 초기화
 * do {
 *     탈출 조건식이 참일 경우 실행되는 코드;
 *     변수의 증감식;
 * }while(탈출 조건식);
 */
public class DoWhile {
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);
    }
}
