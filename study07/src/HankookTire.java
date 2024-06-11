// 부모 클래스인 Tire 클래스를 상속받아 사용하는 HankookTire 클래스
public class HankookTire extends Tire{
  // 필드는 상속받은 필드 그대로 사용
  // 초기화 안한 accRotaion 값은 0이 들어옴

  // 생성자, 타이어 위치와 최대회전수 초기화
  public HankookTire(String location, int maxRotation) {
    super(location, maxRotation);
    // 부모 클래스의 매개변수 2개인 생성자 호출
  }

  @Override
  public boolean roll(){
    ++accRotation; // 한번 실행될때마다 누적 회전수 1회 증가
    if(accRotation < maxRotation){
      System.out.println(location + " HankookTire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("****" + location + " HankookTire 펑크 ****");
      return false;
    }
  }
}
