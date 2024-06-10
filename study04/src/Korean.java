public class Korean {
  // 필드 선언과 동시에 초기값 설정
  String nation = "대한민국";

  // 필드만 선언, 초기값 없음, 기본값으로 설정됨, String은 참조값 = null
  String name;
  String ssn;

  // 생성자 오버로딩 가능

  public Korean(){
    // 기본생성자
  }

  // 필드값을 초기화하는 메소드
  public void setData(){
    nation = "한국";
    name = "박성호";
    ssn = "125553-455556";
  }

  // 매개변수가 있는 생성자
  public Korean(String n, String s) { // 기본 생성자와 이름이 같은 생성자 = 오버로딩
    name = n;
    ssn = s;
  }
}
