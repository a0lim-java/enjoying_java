package sec1_basic;

public class NumberOverflow {
    public static void main(String[] args){
        int i1 = (int) 50.0;
        int i2 = (int) 25.6f;

        System.out.println(i1);
        System.out.println(i2); // 내림 됨
    }
}
