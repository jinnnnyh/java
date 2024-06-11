public class KumhoTire extends Tire {

  public KumhoTire(String location, int maxRotaion) {
    super(location, maxRotaion);
  }
  @Override
  public boolean roll(){
    ++accRotation; // 한번 실행될때마다 누적 회전수 1회 증가
    if (accRotation < maxRotation){
      System.out.println(location + " KumhoTire 수명 : " +(maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("****" + location + " KumhoTire 펑크 ****");
      return false;
    }
  }

}
