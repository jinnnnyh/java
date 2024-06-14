public class Vehicle2Ex {
  public static void main(String[] args) {
    // 부모 인터페이스 타입의 변수에 자식 클래스 타입의 객체 대입
    Vehicle2 v = new Bus2();
    // 부모 인터페이스 제공하는 멤버만 사용 가능
    v.run();
//    v.checkfare();
    // checkfare() Bus2 전용 메소드

    Bus2 b = (Bus2)v;
    // 원본이 자식 클래스 타입인 v 객체를 Bus2로 강제 타입 변환
    b.run();
    // checkfare() 메소드 사용할 수 있게 됨
    b.checkfare();
  }
}

// instanceof 는 상속 다형성에서 강제 타입 변환할 때 했던 예제 참고하기

