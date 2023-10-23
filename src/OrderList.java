public class OrderList {
    // 상품명
    private String name;
    // 가격
    private double price;

    private OrderList orderList;
    public OrderList(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void add(String name, double price) {
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
