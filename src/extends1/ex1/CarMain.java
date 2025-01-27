package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

// ElectricCar 클래스와 GasCar 클래스는 move() 메소드를 가지고 있음
// 공통 부분을 가지고 있는 클래스를 만들어서 상속을 받아서 사용하면 좋음