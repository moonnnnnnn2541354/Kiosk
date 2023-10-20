

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TopPage {
    static List<OrderList> orderList = new ArrayList<>();
    // 고유 데이터
    boolean orderEnded ;

    // 상태 데이터
    String id ;
    String name;
    double price;

    public TopPage() {
    }

    public void orderStart() throws Exception {
        Scanner sc = new Scanner(System.in);
        this.orderEnded = false;

        while (!orderEnded){
            System.out.println("----------------------------------");
            System.out.println("Cafe에 오신 걸 환영합니다.");
            System.out.println("아래 메뉴판을 보시고 메뉴 번호를 입력해 주세요.");
            System.out.println("[ Cafe MENU ]");
            System.out.println("1.Coffees              | 카페인이 들어간 음료입니다.");
            System.out.println("2.Non Coffees          | 카페인이 들어가지 않은 음료입니다.");
            System.out.println("3.Dessert              | 수제로 만든 디저트입니다.");
            System.out.println();
            System.out.println("[ Order MENU ]");
            System.out.println("4.Orders               | 주문 리스트를 확인합니다.");
            System.out.println("5.Payment              | 결제 화면으로 이동합니다.");
            System.out.println("6.Cancel               | 모든 주문을 취소합니다.");
            String menuSelect = sc.nextLine();
            switch (menuSelect) {
                case "1" :
                    // CoffeeMenu 이동
                    orderEnded = CoffeeMenuPage.start();
                    break;
                case "2" :
                    // NonCoffeeMenu 이동
                    orderEnded = NonCoffeeMenuPage.start();
                    break;
                case "3" :
                    // DessertMenu 이동
                    orderEnded = DessertMenuPage.start();
                    break;
                case "4" :
                    // OrdersPage 이동
                    orderEnded = OrderListPage.start();
                    break;
                case "5" :
                    orderEnded = Payment.start();
                    // Payment 이동
                    break;
                case "6" :
                    System.out.println("6.Cancel 모든 주문이 취소되었습니다.");
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    System.out.println("다시 입력해 주세요.");
                    orderStart();
            }
            orderEnded = true;
        }
    }
}
