

import java.util.Scanner;

public class Payment {
    static TopPage topPage = new TopPage();

    public static boolean start()  throws Exception{
        Scanner sc = new Scanner(System.in);
        // 주문 리스트 계산
        double sum = TopPage.orderList.stream().mapToDouble(OrderList::getPrice).sum();

        System.out.println("----------------------------------");
        System.out.println("5.Payment 결제화면으로 이동합니다.");
        System.out.println("현재 주문 리스트 : ");
        for (OrderList orders : TopPage.orderList) {
            System.out.println(orders.getName() + ", " + orders.getPrice());
        }
        System.out.println("----------------------------------");
        System.out.println("주문금액 : " + sum + "00 원 입니다");
        System.out.println("1. Payment             | 결제를 진행합니다.");
        System.out.println("2. Back                | 이전 화면으로 이동합니다.");
        String selectOrderPage = sc.nextLine();
        switch (selectOrderPage) {
            case "1" :
                System.out.println("감사합니다");
                break;
            case "2" :
                System.out.println("이전 화면으로 이동합니다.");
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
