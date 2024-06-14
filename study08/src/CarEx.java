public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.run();

    System.out.println();

    // 배열 사용하면 for 문 안에 if 넣어서 확인하고 바꿔야 되나?

    myCar.frontLeftTire = new KumhoTire(); // 타이어교체
    myCar.frontRightTire = new KumhoTire(); // 타이어교체
    myCar.run();
  }
}
