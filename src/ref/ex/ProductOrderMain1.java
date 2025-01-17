package ref.ex;

import java.util.Scanner;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주문 수량 입력
        System.out.print("입력할 주문의 개수를 입력하세요:");
        int num = scanner.nextInt();
        scanner.nextLine();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[num];

        // 가격, 수량, 상품명 입력 메서드
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명:");
            String productName = scanner.nextLine();

            System.out.print("가격:");
            int price = scanner.nextInt();

            System.out.print("수량:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }


        // 상품, 총 결제 금액 출력 메서드
        printOrder(orders);
        int sum = getTotalAmount(orders);
        System.out.println("총 결제 금액: "+sum);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }

}
