public class Car5 {
  // 필드 선언 후 초기값 설정
  String company = "현대 자동차";

  // 필드만 선언, 초기값 없음
  String model;
  String color;
  int maxSpeed;

  public Car5(){
    // 기본 생성자
    // 코드블럭에 내용 없음
  }
  // 매개변수 1개인 생성자, 필드에 매개변수로 받은 데이터로 초기화

  // this : 객체 자신을 의미하는 키워드
  // 클래스 내부에서는 필드 혹은 메소드 접근 시 this.필드명, this.메소드명 으로 접근

  // this를 반드시 써야할 경우는 생성자나 메소드의 매개변수 이름과 클래스의 필드명이 동일할 경우
  // 어떤 것이 매개변수이고 어떤 것이 필드인지 구분하기 위해서 this를 사용함

  // 위와 같은 경우를 제외하고(변수명 다를때)는 클래스 내부에서 사용하는 것이기 때문에 this를 생략해도 상관 없음

  // this() : 생성자 안에서 다른 생성자 호출
  // 중복된 내용이 있는 생성자를 불러오나봄 ?

  public Car5(String model){
    // this.model 은 필드의 model을 지칭
    // model 은 생성자의 매개변수를 지칭
    this.model = model;
  }

  public Car5(String model, String color){
    this.model = model;
    this.color = color;
  }
  public Car5(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}


