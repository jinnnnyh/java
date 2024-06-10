public class Car4Ex {
  public static void main(String[] args) {

    // 생성자가 요구하는 매개변수에 맞춰서 객체 생성
    // 얘는 Car4Ex 클래스의 생성자임


    Car4 myCar1 = new Car4("파랑",3000);
    System.out.println("색상 : "+ myCar1.carColor+", "+"배기량 : "+ myCar1.carCC);

    Car4 myCar2 = new Car4("흰색", 500);
    System.out.println("색상 : "+ myCar2.carColor+", "+"배기량 : "+ myCar2.carCC);

    Car4 myCar3 = new Car4();
    System.out.println("색상 : "+ myCar3.carColor+", "+"배기량 : "+ myCar3.carCC);
  }
}
