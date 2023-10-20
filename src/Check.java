
import java.util.Scanner;

public class Check {
    static TopPage topPage = new TopPage();


    public static void start (Long id, String name, double price) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("위 메뉴를 주문 리스트에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        String checks = sc.nextLine();

        if (checks.equals("1")){
            System.out.println(name + "이(가) 주문 리스트에 추가되었습니다. ");
            TopPage.orderList.add(new OrderList(id, name, price));
            topPage.orderStart();
        } else if (checks.equals("2")){
            System.out.println(name + " 주문이 취소되었습니다.");
            topPage.orderStart();
        } else {
            System.out.println("입력이 잘못되었습니다.");
            System.out.println("다시 입력해 주세요.");
            Check.start(id,name,price);
        }
    }
}
