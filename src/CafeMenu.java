import java.util.Scanner;

public class CafeMenu {
    boolean orderEnded ;


    final CoffeeMenu coffeeMenu;

    public CafeMenu (CoffeeMenu coffeeMenu) {
        this.coffeeMenu = coffeeMenu;
    }



    public void orderStart() throws Exception {
        Scanner sc = new Scanner(System.in);
        this.orderEnded = false;

        while (!orderEnded){
            System.out.println("----------------------------------");
            System.out.println("Cafe 에 오신걸 환영합니다.");
            System.out.println("아래 메뉴판을 보시고 메뉴번호를 입력 해주세요.");
            System.out.println("[ Cafe MENU ]");
            System.out.println("1.Coffees      | 카페인이 들어간 음료 입니다.");
            System.out.println("2.Non Coffees  | 카페인이 없는 음료 입니다.");
            System.out.println("3.Dessert      | 수제로 만든 디저트 입니다.");
            System.out.println();
            System.out.println("[ Order MENU ]");
            System.out.println("4.Order        | 주문을 진행 합니다");
            System.out.println("5.Cancel       | 모든 주문을 취소 합니다.");
            String menuSelect = sc.nextLine();
            switch (menuSelect) {
                case "1" :
                    CoffeeMenu.start();
                    // CoffeeMenu 이동
                    break;
                case "2" :
                    System.out.println("2.Non Coffees 메뉴로 이동 합니다");
                    // NonCoffeeMenu 이동
                    break;
                case "3" :
                    System.out.println("3.Dessert 메뉴로 이동 합니다");
                    // DessertMenu 이동
                    break;
                case "4" :
                    System.out.println("4.Order 결제 페이지로 이동합니다.");
                    // OrderMenu 이동
                    break;
                case "5" :
                    System.out.println("5.Cancel 모든 주문이 취소 되었습니다.");
                    orderEnded = true;
                    break;
                default:
                    System.out.println("입력이 잘못 되었습니다.");
                    System.out.println("다시 입력 해주세요.");
            }
        }
    }
}