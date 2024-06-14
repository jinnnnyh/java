// 인터페이스 RemoteControl 선언
public interface RemoteControl {
  // 인터페이스의 멤버는 상수, 추상 메소드, 디폴트 메소드, 정적 메소드

  // 상수 선언
  public static final int MAX_VOLUME = 10;
  int MIN_VOLUME = 0;

  // 추상 메소드 선언
  // 인터페이스의 기본 메소드는 추상 메소드임
  // public abastract 키워드를 사용하지 않아도 컴파일러가 자동으로 붙임

  void turnOn();
  abstract void turnOff();
  public abstract void setVolume(int volume);

  // 디폴트 메소드 , 추상XX
  // 자바 8에서 추가된 메소드로 인터페이스에 추가 기능을 사용할 수 있도록 하기 위해서 추가됨
  // 일반 메소드와 동일하게 코드 블록이 존재함
  // 반드시 default 키워드 붙여아 함
  public default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 처리됩니다");
    }
    else{
      System.out.println("무음 해제합니다");
    }
  }

  // 정적 메소드
  // 자바 8에서 추가된 메소드로 인터페이스에 추가 기능을 사용할 수 있도록 하기 위해서 추가됨
  // 일반 메소드와 동일하게 코드 블록이 존재함
  public static void changeBattery(){
    System.out.println("건전지를 교체합니다");
  }
}

// static final = 상수, 상수명은 대문자 > 클래스명으로 접근 가능
// 인터페이스는 추상메소드 가지고있기 때문에 객체 못만듬 > 필드(객체로만 접근가능)에 접근 X
// 추상클래스의 업그레이드 버전
// 추상클래스 = 단일 상속, 인터페이스 = 다중상속