import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        List<OrderList> orderList = Arrays.asList();
        Scanner sc = new Scanner(System.in);

        CafeMenu cafeMenu = new CafeMenu(new CoffeeMenu());
        cafeMenu.orderStart();
        orderList.


    }
}

class OrderList {
    // 분류번호
    private Long id;
    // 책 이름
    private String name;
    // 가격
    private double price;

    public OrderList(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}