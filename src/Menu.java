import java.util.*;

public class Menu {
    String name;    // 상품명
    double calorie;    // 설명 (칼로리)
    int orderNumber = 1; // 대기번호
    List<OrderList> orderList = new ArrayList<>(); // 장바구니
    boolean orderEnded = false;
    static Scanner sc = new Scanner(System.in);

    // 상품클래스
    private Items items;
    public Menu () {

    }

    public void coffeeMenu () {
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
    }
    // 메서드
    public void checked (String name, double price) { // 주문확인화면 메서드
        // 주문 확인
        System.out.println("위 메뉴를 주문 리스트에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        String select = sc.nextLine();
        switch (select) {
            case "1" :
                System.out.println(name + "이(가) 주문 리스트에 추가되었습니다. ");
                orderList.add(new OrderList(name, price));
                break;
            case "2" :
                System.out.println(name + " 주문이 취소되었습니다.");
                break;
        }
    }

    public void  orderListCheck () { // 주문리스트 확인화면 메서드
        Map<String, Integer> map = new HashMap<>();

        // 주문 리스트 목록 구현
        for (OrderList item : orderList) {
            String name = item.getName();
            if (map.containsKey(name)){
                int counts = map.get(name);
                map.put(name, counts + 1);
            }else {
                map.put(name,1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            double price = orderList.stream().filter(item -> item.getName().equals(key))
                    .mapToDouble(OrderList::getPrice).sum();
            System.out.println(key + " / " + value + " / " + price);
        }
        System.out.println();
        
        // 결제금액 확인
        double sum = orderList.stream().mapToDouble(OrderList::getPrice).sum();
        System.out.println("주문금액 : " + sum + "00 원 입니다");

    }
}







    