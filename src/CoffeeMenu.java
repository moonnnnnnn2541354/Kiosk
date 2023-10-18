import java.util.Scanner;

public class CoffeeMenu {

    public static boolean start() throws Exception {
        Scanner sc =new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("1.Coffee 메뉴로 이동 합니다");
        System.out.println("메뉴를 골라 메뉴번호를 입력 해주세요.");
        System.out.println("1. 아메리카노     | w 3.0");
        System.out.println("2. 카페라떼       | w 3.2");
        System.out.println("3. 바닐라라떼     | w 3.2");
        System.out.println("4. 카라멜마끼야또  | w 3.5");
        System.out.println("5. 취소          |");
        String selectCoffeeMenu = sc.nextLine();
//        parser
        return true;

    }
}

