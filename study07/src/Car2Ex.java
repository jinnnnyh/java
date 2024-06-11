public class Car2Ex {
  public static void main(String[] args) {
    Car2 car = new Car2();
    KumhoTire k = new KumhoTire("a",5);
    // Car2 클래스의 객체를 생성해서 클래스 안에 있는 멤버 Tire 객체 사용함

    // 반복문 사용하여 5번 반복 실행
    for(int i = 1; i <= 5; i++){
      // 문제가 발생한 위치 저장
      int problemLocation = car.run();

      switch(problemLocation){
        case 1:
          System.out.println("앞왼쪽 HankookTire로 교체");
          car.frontLeftTire = new HankookTire("앞왼쪽", 15);
          break;
        case 2:
          System.out.println("앞오른쪽 KumhoTire로 교체");
          // 다형성을 사용하여 부모 클래스인 Tire 클래스 타입의 변수 frontRightTrie 에 자식 클래스 KumhoTire 타입의 객체를 대입
          // KumhoTire 생성자는 super()를 가지고 있기때문에 매개변수 값을 부모?????????????? Tire 클래스가 아니라 Car2 클래스의 객체인데?
          // Car2 클래스의 생성자 멤버들이 Tire 생성자라서 어..............
          // frontRight는 상속이 아니고 공유값이고... Kumho는 상속이고... 값이 어떻게 움직이는거지??

          car.frontRightTire = new KumhoTire("앞오른쪽",13);

          // Tire frontRightTire = new KumhoTire("앞오른쪽",13); 과 동일한 상태
          // 그럼 Car2 클래스의 Tire frontRightTire = new Tire("앞오른쪽",2); 에서 Tire("",2) 부분이 KumhoTire("",13)으로 바뀌는건지 ?

          break;
        case 3:
          System.out.println("뒤왼쪽 HankookTire로 교체");
          car.backLeftTire = new HankookTire("뒤왼쪽",14);
          break;
        case 4:
          System.out.println("뒤오른쪽 KumhoTire로 교체");
          car.backRightTire = new KumhoTire("뒤오른쪽", 17);
          break;
      }
      // 해당하는 case 값 없으면 아래 실행하고 for 문 초입으로 돌아가서 반복문 실행
      System.out.println("---------------------");
    }
  }
}
