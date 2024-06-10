// DMBCellphone 클래스 선언, 부모 클래스인 Cellphone 을 상속 받음
public class DMBCellphone extends Cellphone {
  //DMBCellphone 필드에는 channel 밖에 없음
  // 부모 클래스인 Cellphone 의 멤버인 model, color 필드를 상속받음
  int channel;
  // 여기에 String model, color 생겼지만 안보임

  // 생성자
  DMBCellphone(String model, String color, int channel) {
    this.model = model;
    // 상속 받은 필드인 model 에 매개변수 model 대입
    this.color = color;
    // 상속 받은 필드인 color 에 매개변수 color 대입
    this.channel = channel;
  }

  // 메소드 선언
  // Cellphone 클래스의 멤버 메소드를 상속받아 6개 메소드를 사용함
  // 존재하지만 보이지 않을뿐임

  // DMBCellphone 클래스가 자체적으로 가지고 있는 메소드
  void turnOnDmb(){
    System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다");
  }

  void changeChannelDmb(int channel){
    this.channel = channel;
    System.out.println("채널 " + this.channel + "번으로 채널을 변경합니다");
  }

  void turnOffDmb(){
    System.out.println("DMB 방송 수신을 종료합니다");
  }
}
