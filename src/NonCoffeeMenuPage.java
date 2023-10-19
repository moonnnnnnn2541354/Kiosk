import java.util.Scanner;

public class NonCoffeeMenuPage {
    static TopPage topPage = new TopPage();

    public static boolean start() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean orderEnded = false;

        System.out.println("----------------------------------");
        System.out.println("2.NonCoffee 메뉴 화면으로 이동합니다");
        System.out.println("메뉴를 골라 메뉴 번호를 입력해 주세요.");
        System.out.println("1. Chocolate Latte     | w 3.5 | 초코라떼");
        System.out.println("2. Strawberry Smoothie | w 3.9 | 딸기스무디");
        System.out.println("3. Apple Ade           | w 3.5 | 사과에이드");
        System.out.println("4. Peppermint Tea      | w 2.5 | 페퍼민트차");
        System.out.println("5. Back                | 이전 화면으로 이동합니다.");

        while (!orderEnded){
            String selectCoffeeMenu = sc.nextLine();
        switch (selectCoffeeMenu) {
            case "1":
                System.out.println("초코라떼 주문");
                TopPage.orderList2.add(new OrderList(5L, "초코라떼", 3.5));
                break;
            case "2":
                System.out.println("딸기스무디 주문");
                TopPage.orderList2.add(new OrderList(6L, "딸기스무디", 3.9));
                break;
            case "3":
                System.out.println("사과에이드 주문");
                TopPage.orderList2.add(new OrderList(7L, "사과에이드", 3.5));
                break;
            case "4":
                System.out.println("페퍼민트차 주문");
                TopPage.orderList2.add(new OrderList(8L, "페퍼민트차", 2.5));
                break;
            case "5":
                System.out.println("이전 화면으로 이동합니다.");
                orderEnded = true;
                topPage.orderStart();
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                System.out.println("다시 입력해 주세요.");
                NonCoffeeMenuPage.start();
            }
        }
        return true;
    }
}
