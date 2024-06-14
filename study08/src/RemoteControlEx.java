public class RemoteControlEx {
  public static void main(String[] args) {

    // 인터페이스 RmoteControl 타입의 변수 선언
    // 인터페이스는 객체를 생성할 수 없음
    // 해당 인터페이스를 상속받아 구현하는 클래스(TV, Audio)가 객체를 생성할 수 있다
    // 해당 인터페이스를 상속받아 구현하는 클래스에 사용 방법만 제공함(리턴 타입이나, 내부 설계를 메소드명으로 유추하기 ?)
    // 인터페이스 혼자는 사용 못하니까, 다형성을 이용하여 부모인 인터페이스 타입의 변수에 자식 클래스 타입의 객체를 저장하여 사용함

    // TV를 삭제하고 MP3로 바꿔야한다 > 삭제해도 인터페이스에 베이스가 있기때문에 쉽게 새로 생성 가능
    // study07 Car2, Tire 예제 참고해서 생각해보기
    // 뭔가 점점 다형성, 추상, 인터페이스의 장점이 이해가 되는것 같기도하고?

    RemoteControl rc = null;
    rc = new TV();
    rc.turnOn();
    rc.setVolume(5);
    rc.setMute(true);
    rc.turnOff();

    System.out.println("----------------------");

    rc = new Audio();
    rc.turnOn();
    rc.setMute(true);
    rc.setVolume(3);
    rc.setMute(false);
    rc.turnOff();

  }
}
