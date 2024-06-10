// 부모 클래스로 사용
public class Calculator {
  // 오버라이딩하는 메소드는 보통 public 사용
  // 자식 클래스에 상속될 메소드
  public double areaCircle(double r) {
    System.out.println("Calculator 객체의 areacCirlce() 호출");
    return 3.14 * r * r ;
  }

}
