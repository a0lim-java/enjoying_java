package sec2_OOP1;

/**
 * 동작: 동전 넣기 / 잔액 보여주기 / 물건 선택 버튼 클릭 / 물건 뱉기
 * 객체: 액정표시장치 / 동전통 / 상품배출기 / 상품 케이스(상품을 저장) / 상품 / 동전 / 동전배출기 / 상품 선택 버튼 / 동전 배출 버튼 / 객체를 담고 있는 자판기 자체
 *
 * 구조
 * 자판기 : 동전통 = 1:1
 * 자판기: 상품 배출기 = 1: 1
 * 자판기 : 상품케이스 = 1: n
 * 상품 케이스 : 상품 = 1 : m
 */

public class VendingMachine {
    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    public static void printVersion(){ // static: 인스턴스 없이 사용 가능
        System.out.println("v1.0");
    }
}
