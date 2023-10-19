import java.util.Scanner;

public class CoffeeMenuPage {
    static TopPage topPage = new TopPage();

    public static boolean start()  throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean orderEnded = false;

        System.out.println("----------------------------------");
        System.out.println("1.Coffee 메뉴 화면으로 이동합니다");
        System.out.println("메뉴를 골라 메뉴 번호를 입력해 주세요.");
        System.out.println("1. Americano           | w 3.0 | 아메리카노");
        System.out.println("2. Cafe Latte          | w 3.2 | 카페라떼");
        System.out.println("3. Vanilla Latte       | w 3.2 | 바닐라라떼");
        System.out.println("4. Caramel Macchiato   | w 3.5 | 카라멜마끼야또");
        System.out.println("5. Back                | 이전 화면으로 이동합니다.");

        while (!orderEnded){
            String selectCoffeeMenu = sc.nextLine();
            switch (selectCoffeeMenu) {
                case "1" :
                    System.out.println("아메리카노 주문");
                    TopPage.orderList2.add(new OrderList(1L,"아메리카노",3.0));
                    break;
                case "2" :
                    System.out.println("카페라떼 주문");
                    TopPage.orderList2.add(new OrderList(2L,"카페라떼",3.2));
                    break;
                case "3" :
                    System.out.println("바닐라라떼 주문");
                    TopPage.orderList2.add(new OrderList(3L,"바닐라라떼",3.2));
                    break;
                case "4" :
                    System.out.println("카라멜마끼야또 주문");
                    TopPage.orderList2.add(new OrderList(4L,"카라멜마끼야또",3.5));
                    break;
                case "5" :
                    System.out.println("이전 화면으로 이동합니다.");
                    orderEnded = true;
                    topPage.orderStart();
                    break;
                default:
                    System.out.println("입력이 잘못되었습니다.");
                    System.out.println("다시 입력해 주세요.");
                    CoffeeMenuPage.start();

            }
        }
        return true;
    }
}

