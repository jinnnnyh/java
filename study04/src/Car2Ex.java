public class Car2Ex {
  public static void main(String[] args) {
    // car2에 Car2의 주소값을 주고 해당 클래스에 있는 필드값을 가져와서 사용할 수 있음
    // Ex 클래스에서 사용하는 객체의 값만 바뀌지 참조한 클래스의 값이 바뀌는 것은 아님

    Car2 car2 = new Car2();

    // 필드초기화 1) 객체 생성 후 필드에 직접 값 저장
    car2.speed = 60;


    // car2의 힙에 있는 필드 speed
    System.out.println("car2의 속도 : " + car2.speed);

    Car2 car21 = new Car2();
    // car21의 힙에 있는 필드 speed
    car21.speed = 10;
    System.out.println("car21의 속도 : "+car21.speed);

    // car2의 필드 speed나 car21의 필드 speed는 사용하려는 이름이 동일하므로
    // 두 객체의 필드를 구분하기 위해서 앞에 객체명을 반드시 붙여야함
  }


  // 메소드 = 함수 이지만 클래스의 안과 밖 위치의 차이가 있음 : js
  // 클래스의 멤버인 함수 = 메소드
  // 클래스 밖에 있는 것 = 함수

  // 자바는 모든 구성요소가 클래스의 멤버라서 '함수 없고' 메소드는 있다
  // 자바의 최상위 클래스는 Object 클래스


}
