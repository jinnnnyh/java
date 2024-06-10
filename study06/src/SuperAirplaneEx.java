public class SuperAirplaneEx {
  public static void main(String[] args) {
    SuperAirplane sa = new SuperAirplane();
    // 상속받은 메소드
    sa.takeOff();
    sa.fly();

    sa.flyMode = SuperAirplane.SUPERSONIC;
    // 상속받아 오버라이딩한 메소드 fly() 실행
    sa.fly();

    sa.flyMode = SuperAirplane.NOMAL;
    sa.fly();

    sa.land();
  }
}
