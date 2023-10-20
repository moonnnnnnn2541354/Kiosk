public class OrderList {
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

    public Long getId() {return id;}
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