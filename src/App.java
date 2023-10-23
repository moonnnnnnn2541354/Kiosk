import java.util.*;

public class App {
    public static boolean orderStart() throws Exception {
        Menu menu = new Menu();
        Items items = new Items();
        Scanner sc = new Scanner(System.in);
        boolean orderEnded = false;
        int waitingNumber = 1;

        while (!orderEnded){
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println("Cafe에 오신 걸 환영합니다.");
            System.out.println();
            System.out.println("아래 메뉴판을 보시고 메뉴 번호를 입력해 주세요.");
            System.out.println("[ Cafe MENU ]");
            System.out.println("1.Coffees              | 카페인이 들어간 음료입니다.");
            System.out.println("2.Non_Coffees          | 카페인이 들어가지 않은 음료입니다.");
            System.out.println("3.Dessert              | 수제로 만든 디저트입니다.");
            System.out.println();
            System.out.println("[ Order MENU ]");
            System.out.println("4.Payment              | 결제 화면을 이동합니다.");
            System.out.println("5.Cancel               | 주문을 취소합니다.");
            String menuSelect = sc.nextLine();

            if (menuSelect.equals("1")) {
                // CoffeeMenu 이동
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("메뉴를 골라 번호를 입력해 주세요.");
                System.out.println();
                System.out.println("[ Coffee Menu ]");
                System.out.print("1. ");
                items.americano();
                System.out.print("2. ");
                items.cafeLatte();
                System.out.print("3. ");
                items.vanillaLatte();
                System.out.print("4. ");
                items.caramelMacchiato();
                System.out.println("5. 홈으로        | 이전 화면으로 이동합니다.");
                String coffeSelect = sc.nextLine();
                System.out.println();
                switch (coffeSelect) {
                    case "1":
                        items.americano();
                        menu.checked("아메리카노", 3.0);
                        break;
                    case "2":
                        items.cafeLatte();
                        menu.checked("카페라떼", 3.2);
                        break;
                    case "3":
                        items.vanillaLatte();
                        menu.checked("바닐라라떼", 3.2);
                        break;
                    case "4":
                        items.caramelMacchiato();
                        menu.checked("카라멜마끼야또", 3.5);
                        break;
                    case "5" :
                        System.out.println("메인화면으로 이동합니다.");
                        break;
                }

            } else if (menuSelect.equals("2")) {
                // NonCoffeeMenu 이동
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("메뉴를 골라 번호를 입력해 주세요.");
                System.out.println();
                System.out.println("[ Non_Coffee Menu ]");
                System.out.print("1. ");
                items.chocoLatte();
                System.out.print("2. ");
                items.strawberrySmoothie();
                System.out.print("3. ");
                items.appleAde();
                System.out.print("4. ");
                items.peppermintTea();
                System.out.println("5. 홈으로       | 이전 화면으로 이동합니다.");
                String nonCoffeeSelect = sc.nextLine();
                System.out.println();
                switch (nonCoffeeSelect) {
                    case "1":
                        items.chocoLatte();
                        menu.checked("초코라떼", 3.5);
                        break;
                    case "2":
                        items.strawberrySmoothie();
                        menu.checked("딸기스무디", 3.9);
                        break;
                    case "3":
                        items.appleAde();
                        menu.checked("사과에이드", 3.5);
                        break;
                    case "4":
                        items.peppermintTea();
                        menu.checked("페퍼민트차", 2.5);
                        break;
                    case "5" :
                        System.out.println("메인화면으로 이동합니다.");
                        break;
                }

            } else if (menuSelect.equals("3")) {
                // DessertMenu 이동
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("메뉴를 골라 번호를 입력해 주세요.");
                System.out.println();
                System.out.println("[ Dessert Menu ]");
                System.out.print("1. ");
                items.saltBread();
                System.out.print("2. ");
                items.scone();
                System.out.print("3. ");
                items.cookie();
                System.out.println("4. 홈으로      | 이전 화면으로 이동합니다.");
                String dessertSelect = sc.nextLine();
                System.out.println();
                switch (dessertSelect) {
                    case "1":
                        items.saltBread();
                        menu.checked("소금빵", 2.0);
                        break;
                    case "2":
                        items.scone();
                        menu.checked("스콘", 2.0);
                        break;
                    case "3":
                        items.cookie();
                        menu.checked("쿠키", 1.5);
                        break;
                    case "4" :
                        System.out.println("메인화면으로 이동합니다.");
                        break;
                }
            } else if (menuSelect.equals("4")) {
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("[ 현재 주문 리스트 ]");
                menu.orderListCheck();
                System.out.println("----------------------------------");
                System.out.println("주문 하시겠습니까?");
                System.out.println("1. 확인        2. 취소");
                String select = sc.nextLine();
                System.out.println();
                switch (select) {
                    case "1":
                        System.out.println("주문이 완료되었습니다.");
                        System.out.println("대기번호 [ " + waitingNumber++ + " ] 번 입니다.");
                        try {
                            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
                            Thread.sleep(3000);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        menu.orderList.clear();
                        break;
                    case "2":
                        System.out.println("메인화면으로 이동합니다.");
                        break;
                }
            } else if (menuSelect.equals("5")) {
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 확인        2. 돌아가기");
                String select = sc.nextLine();
                System.out.println();
                switch (select) {
                    case "1" :
                        System.out.println("진행하던 주문이 취소되었습니다.");
                        menu.orderList.clear();
                        break;
                    case "2" :
                        System.out.println("메뉴판으로 돌아갑니다.");
                        System.out.println();
                        break;
                }

            } else if (menuSelect.equals("6")) {
                System.out.println("주문을 종료합니다.");
                orderEnded = true;
            }
        }
        return true;
    }
}




