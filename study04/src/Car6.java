public class Car6 {
  String company = "현대 자동차";
  String model;
  String color;
  int maxSpeed;


  public Car6(){
    // this() : 생성자 안에서 다른 생성자를 호출하는 명령어
    // this()는 생성자 안에서 가장 첫번째 줄에 입력하고, 첫번째로 실행되어야함

    this("세단"); // String 매개변수 1개를 가지고 있는 생성자를 찾아가는데 값을 들고감
  }

  public Car6(String model){
    this(model,"검정색"); // String 매개변수 2개를 가지고 있는 생성자를 찾아가는데 값을 들고감
  }

  public Car6(String model, String color){
    this(model,color,200); // String 매개변수 3개를 가지고 있는 생성자를 찾아가는데 값을 들고감
  }

  // 두번째에서 세번째 도착하면 매겨변수 값 3개 다모인 상태로 매개변수 3개인 생성자 찾아감
  // 3개의 값을 다 받은 생성자가 필드 초기화
  public Car6(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}
