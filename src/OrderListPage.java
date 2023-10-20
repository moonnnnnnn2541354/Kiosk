

import java.util.Scanner;

public class OrderListPage {
    static TopPage topPage = new TopPage();

    public static boolean start()  throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("4.Order 주문 리스트를 확인합니다.");
        System.out.println("현재 주문 리스트 : ");
        for (OrderList orders : TopPage.orderList) {
            System.out.println(orders.getName() + ", " + orders.getPrice());
        }
        System.out.println();
        System.out.println("1. Payment             | 결제화면으로 이동합니다.");
        System.out.println("2. Back                | 이전화면으로 이동합니다.");
        String selectOrderPage = sc.nextLine();
        switch (selectOrderPage) {
            case "1" :
                System.out.println("1.Payment 결제화면으로 이동합니다.");
                Payment.start();
                break;
            case "2" :
                topPage.orderStart();
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                System.out.println("다시 입력해 주세요.");
                OrderListPage.start();
        }
        return true;
    }
}