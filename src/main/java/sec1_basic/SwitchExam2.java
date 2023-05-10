package sec1_basic;

public class SwitchExam2 {
    public static void main(String[] args){
        char ch = 'a';
        switch(ch){
            case 'a' : // break가 없음 -> 다음 case로 넘어감
            case 'A' : // @@ 'A'
                System.out.println('A');
                break;
            case 'b' :
            case 'B' :
                System.out.println('B');
            case 'c' :
            case 'C' :
                System.out.println('C');
            default :
                System.out.println("not ABC");
        }
    }
}
