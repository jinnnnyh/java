public class Calculator {
  // Calculator 클래스의 메소드 4개

  // 리턴값이 없는 메소드
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  void powerOff(){
    System.out.println("전원을 끕니다.");
  }

  // 반환타입 , 메소드명 , 매개변수
  // 매개변수가 없으면 빈 괄호 사용()
  // 리턴값이 있는 메소드
  int plus(int x, int y){
    int result = x + y;
    return result;
  }

  double divide(int x, int y){
    // 자동 타입 변환에 의해서 int >> double 타입으로 변환
    // x/y 연산 결과는 int 값, 연산 후 result에 저장할 때 double로 됨
    double result = x / y;
    return result;
  }
}
