// 다중 상속
// 인터페이스는 클래스가 아니기때문에 다중 삭속이 가능함
// 상속받은 인터페이스의 추상 메소드를 모두 다 구현해야함 ( 안하면 추상클래스됨)
public class SmartTV implements RemoteControl, Searchable{

  // 필드
  private int volume;

  // RemoteControl 인터페이스 추상 메소드 오버라이딩
  @Override
  public void turnOn(){
    System.out.println("스마트 TV를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("스마트 TV를 끕니다");
  }

  @Override
  public void setVolume(int volume) {
    if(volume > RemoteControl.MAX_VOLUME){
      this.volume = RemoteControl.MAX_VOLUME;
    }
    else if(volume < RemoteControl.MIN_VOLUME){
      this.volume = RemoteControl.MIN_VOLUME;
    }
    else{
      this.volume = volume;
    }
    System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
  }

  // Searchable 인터페이스 추상 메소드 오버라이딩
  @Override
  public void search(String url) {
    System.out.println(url + "을 검색합니다.");
  }
}
