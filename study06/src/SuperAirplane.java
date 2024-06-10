public class SuperAirplane extends Airplane {
  public static final int NOMAL=1;
  public static final int SUPERSONIC = 2;
  public int flyMode = NOMAL;

  @Override
  public void fly(){
    if(flyMode== SUPERSONIC){
      // SUPERSONIC 이면 오버라이딩
      System.out.println("Override_초음속 비행합니다");
    }
    else {
      // 아니면 부모 호출
      // 상속아니었으면 출력문 그대로 한번 더 사용했어야함
      // 부모 호출로 인해 간단해짐
      // super.멤버 : 상속받은 부모 클래스의 멤버(필드, 메소드)를 호출하는 명령어
      // super() : 상속받은 부모 클래스의 생성자 호출
      super.fly();
    }
  }

}
