import java.util.Scanner;

public class OrderListPage {
    static TopPage topPage = new TopPage();

    public static boolean start()  throws Exception{
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= TopPage.orderList2.size(); i++) {
            Long L = (long)i;
            long l =TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(L))
                    .mapToLong(OrderList::getId).count();
        }
        long americano = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(1L))
                .mapToLong(OrderList::getId).count();
        long cafeLatte  = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(2L))
                .mapToLong(OrderList::getId).count();
        long vanillaLatte = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(3L))
                .mapToLong(OrderList::getId).count();
        long caramelMacchiato = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(4L))
                .mapToLong(OrderList::getId).count();
        long chocolateLatte = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(5L))
                .mapToLong(OrderList::getId).count();
        long strawberrySmoothie = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(6L))
                .mapToLong(OrderList::getId).count();
        long appleAde = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(7L))
                .mapToLong(OrderList::getId).count();
        long peppermintTea = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(8L))
                .mapToLong(OrderList::getId).count();
        long saltBread = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(9L))
                .mapToLong(OrderList::getId).count();
        long scone = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(10L))
                .mapToLong(OrderList::getId).count();
        long cookie = TopPage.orderList2.stream().filter(orderList -> orderList.getId().equals(11L))
                .mapToLong(OrderList::getId).count();

        System.out.println("----------------------------------");
        System.out.println("4.Order 주문 리스트를 확인합니다.");
        System.out.println("현재 주문 리스트 : ");
        System.out.println(TopPage.orderList2.toString());
        for (int i = 1; i <= TopPage.orderList2.toArray().length; i++) {

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
