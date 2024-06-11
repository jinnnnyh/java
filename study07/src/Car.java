// 부모 클래스로 사용되는 Car 클래스
public class Car {
  // 필드
  public int speed;

  // 메소드
  public void speedUp(){
    speed += 1;
  }

  // final 메소드
  // 자식 클래스에서 오버라이딩 막을 때 사용하나봄
  public final void stop(){
    System.out.println("차를 멈춤");
    speed = 0;
  }
}

// 다른 패키지에 있는 클래스도 상속 관계로 엮을 수 있나봄 ??????????????????????

