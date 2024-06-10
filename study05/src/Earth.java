public class Earth {
  // static final 변수명 : 상수
  // 정적멤버 + 수정불가 = 읽기전용
  static final double EARTH_RADIUS = 6400;
  public static final double EARTH_SURFACE_AREA;
  
  // 정적 멤버 초기화는 선언할 때 1번 또는 생성자에서 1번 가능
  // 정적 초기화 블럭(정적 멤버용 생성자라고 생각하면 됨)
  // 초기화가 되지 않은 상수 불러와서 초기화 해줌
  static{
    // Math : 자바에서 제공하는 수학 관련 클래스
    // PI : Math 클래스의 상수, 원주율 제공
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
  }

}
