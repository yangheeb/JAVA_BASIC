package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성 -> 배열에 저장
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        // printOrder()를 사용해서 -> 상품 주문 정보 출력
        printOrder(orders);

        // getTotalAmount()를 사용해서 -> 총 결제 금액 계산
        int sum = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: "+sum);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder(); // productOrder 인스턴스 생성을 여기서
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order; // 참조값을 반환
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
