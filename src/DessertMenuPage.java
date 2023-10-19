import java.util.Scanner;

public class DessertMenuPage {
    static TopPage topPage = new TopPage();

    public static boolean start() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean orderEnded = false;

        System.out.println("----------------------------------");
        System.out.println("3.Dessert 메뉴 화면으로 이동합니다");
        System.out.println("메뉴를 골라 메뉴 번호를 입력해 주세요.");
        System.out.println("1. Salt bread          | w 2.0 | 소금빵");
        System.out.println("2. Scone               | w 2.0 | 스콘");
        System.out.println("3. Cookie              | w 1.5 | 쿠키");
        System.out.println("4. Back                | 이전 화면으로 이동합니다.");

        while (!orderEnded){
            String selectCoffeeMenu = sc.nextLine();
        switch (selectCoffeeMenu) {
            case "1":
                System.out.println("소금빵 주문");
                TopPage.orderList2.add(new OrderList(9L, "소금빵", 2.0));
                break;
            case "2":
                System.out.println("스콘 주문");
                TopPage.orderList2.add(new OrderList(10L, "스콘", 2.0));
                break;
            case "3":
                System.out.println("쿠키 주문");
                TopPage.orderList2.add(new OrderList(11L, "쿠키", 1.5));
                break;
            case "4":
                System.out.println("이전 화면으로 이동합니다.");
                orderEnded = true;
                topPage.orderStart();
                break;
            default:
                System.out.println("입력이 잘못되었습니다.");
                System.out.println("다시 입력해 주세요.");
                DessertMenuPage.start();
            }
        }
        return true;
    }
}