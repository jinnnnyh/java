public class Car {
  Tire frontLeftTire = new HankookTire();
  Tire frontRightTire = new HankookTire();
  Tire backLeftTire = new KumhoTire();
  Tire backRightTire = new KumhoTire();

  // 인터페이스 타입의 배열을 사용
  Tire[] tires = {
      new HankookTire(),
      new HankookTire(),
      new HankookTire(),
      new HankookTire()
  };
  public void run(){
//    frontLeftTire.roll();
//    frontRightTire.roll();
//    backLeftTire.roll();
//    backRightTire.roll();

    // 배열 사용하면 for 문 돌려서 사용
    for(int i = 0; i<tires.length; i++){
      tires[i].roll();
    }
  }
}
