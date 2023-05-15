package sec2_OOP1;

/**
 * 클래스 메소드: static이 붙은 메소드
 * 인스턴스를 만들지 않아도 사용 가능 <- 이미 메모리에 올라가 있음
 *
 * vendingMachineMain은 VendingMachine을 의존한다(VendingMachine이 있어야 사용 가능)
 */

public class VendingMachineMain {
    public static void main(String[] args){
        VendingMachine vm1 = new VendingMachine(); // 인스턴스 생성

        String product = vm1.pushProductButton(100);
        vm1.printVersion(); // static 메소드: 레퍼런스변수명.static메소드() 로 호출 가능(권장 X)
        System.out.println(product);

        VendingMachine.printVersion(); // static 메소드: 클래스이름.메소드명()
    }
}
