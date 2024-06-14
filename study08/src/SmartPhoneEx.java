public class SmartPhoneEx {
  public static void main(String[] args) {
    // Phone 추상클래스 만들자마자 오류남, 추상클래스는 객체를 만들 수 없다 위배
    // Phone 클래스는 추상 클래스이므로 객체 생성 불가능하지만 변수 생성은 OK
    Phone phone;
//    Phone p = new Phone("홍길동");
//    p.turnOn();
//    p.turnOff();

    // 추상 클래스 Phone을 상속받아 사용하는 구현 클래스 SmartPhone의 객체 생성
    SmartPhone sp = new SmartPhone("한태산");
    // 상속받은 전용 멤버를 모두 사용
    sp.turnOn();
    sp.internetSearch();
    sp.turnOff();
  }
}
