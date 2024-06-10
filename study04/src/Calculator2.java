public class Calculator2 {
  // 그냥 메소드라고 하는게 맞음, 지금은 개념 잡으려고 붙임
  // 생성자 없지만 실행 가능 > 컴파일러가 자동으로 생성해서 붙여줌

  // 멤버 메소드
  int plus(int a, int b) {
    int result = a + b;
    return result;
  }

  // 멤버 메소드
  double avg(int a, int b) {
    // 같은 클래스 내의 멤버인 plus 호출, 메소드명만 사용해서 호출, 객체명은 따로 적지 않음
    double sum = plus(a, b);
    double result = sum / 2;
    return result;
  }

  // 멤버 메소드
  void execute(){
    // 같은 클래스 내의 멤버인 avg, println 호출, 메소드명만 사용해서 호출, 객체명은 따로 적지 않음
    double result = avg(7,10);
    println("실행결과 : " + result);
  }

  // 멤버 메소드
  // 메소드로 선언하고 짧게 쓰는 방법
  void println(String message){
    System.out.println(message);
  }
}
