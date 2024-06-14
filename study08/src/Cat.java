// 추상 메소드 sound()를 구현하라고 오류남
// 추상 클래스 Animal 상속
public class Cat extends Animal{
  public Cat(){
    this.kind = "포유류";
  }

  // 추상 메소드 sound()를 상속받아 오버라이딩하여 Cat 클래스 전용 일반 메소드로 사용
  @Override
  public void sound(){
    System.out.println("야옹");
  }
}
