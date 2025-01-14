package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        productOrders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        productOrders[2] = productOrder3;

        int sum = 0;

        // 상품 주문 정보와 최종 금액 출력
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println("상품명: " + productOrders[i].productName + ", 가격: " + productOrders[i].price + ", 수량: " + productOrders[i].quantity);
            sum += productOrders[i].price * productOrders[i].quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
