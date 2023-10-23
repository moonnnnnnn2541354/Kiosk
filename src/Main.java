import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean addEnded = false;

        while (!addEnded){ // addEnded = false 일때 실행
            try {
                addEnded = App.orderStart();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}