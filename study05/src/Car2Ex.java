public class Car2Ex {
  public static void main(String[] args) {
    Car2 myCar = new Car2();

    // speed는 private 변수라서 직접 사용할 수는 없지만 setSpeed를 사용해 speed 초기화 가능
    myCar.setSpeed(-50);
    System.out.println("현재 속도 : " + myCar.getSpeed());
    // getSpeed는 speed를 리턴함

    myCar.setSpeed(50);
    System.out.println("현재 속도 : " + myCar.getSpeed());

    // 위에서 속도를 넣었으니 setSpeed안의 stop=false 저장되고
    // isStop은 stop을 리턴하니 false가 나옴
    // !false = true 이기때문에 if문 실행
    if(!myCar.isStop()){
      myCar.setStop(true);
      // stop은 다시 true가 되고 , speed는 0이 됨
    }

    System.out.println("현재 속도 : " + myCar.getSpeed());
  }
}
