public class Items extends Menu {
    double price;

    public void cookie () {
        super.name = "쿠키";
        super.calorie = 15;
        this.price = 1.5;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void scone () {
        super.name = "스콘";
        super.calorie = 330.5;
        this.price = 2.0;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void saltBread () {
        super.name = "소금빵";
        super.calorie = 130;
        this.price = 2.0;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void peppermintTea () {
        super.name = "페퍼민트차";
        super.calorie = 5;
        this.price = 2.5;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void appleAde () {
        super.name = "사과에이드";
        super.calorie = 38.4;
        this.price = 3.5;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void strawberrySmoothie () {
        super.name = "딸기스무디";
        super.calorie = 36.8;
        this.price = 3.9;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void chocoLatte () {
        super.name = "초코라떼";
        super.calorie = 344.5;
        this.price = 3.5;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void caramelMacchiato () {
        super.name = "카라멜마끼아또";
        super.calorie = 179;
        this.price = 3.5;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void vanillaLatte () {
        super.name = "바닐라라떼";
        super.calorie = 228;
        this.price = 3.2;
        System.out.println(name + " / " + price + " / " + calorie);
    }
    public void cafeLatte () {
        super.name = "카페라떼";
        super.calorie = 167.2;
        this.price = 3.2;
        System.out.println(name + " / " + price + " / " + calorie);
    }

    public void americano () {
        super.name = "아메리카노";
        super.calorie = 10;
        this.price = 3.0;
        System.out.println(name + " / " + price + " / " + calorie);
    }
}

