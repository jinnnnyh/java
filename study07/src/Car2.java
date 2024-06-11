public class Car2 {
  // Tire 클래스 타입의 객체 4개 생성, 초기화
  // 상속  XXXX
  // public 접근제한자로 멤버 공유 ?

  Tire frontLeftTire = new Tire("앞왼쪽", 6);
  Tire frontRightTire = new Tire("앞오른쪽",2);
  Tire backLeftTire = new Tire("뒤왼쪽", 3);
  Tire backRightTire = new Tire("뒤오른쪽",4);

  // else if 쓰면 안되나??

  // 타이어 4군데 한번씩 다 실행하고 false 걸리면 멈춤 아니면 return 0, run() 종료
  int run(){
    System.out.println("[자동차가 달립니다]");

    // roll()이 Tire, Hankook, Kumho 세 개에 모두 있는데 여기서 쓰는 roll() 은 Tire 의 메소드
    if (frontLeftTire.roll() == false) {
      stop();
      return 1;
    }

    if (frontRightTire.roll() == false) {
      stop();
      return 2;
    }

    if (backLeftTire.roll() == false) {
      stop();
      return 3;
    }

    if (backRightTire.roll() == false) {
      stop();
      return 4;
    }

    return 0;
  }

  void stop(){
    System.out.println("[자동차가 멈춥니다]");
  }

}
