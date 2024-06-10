// 오버로딩
// 썜은 3 기본 버전, 4 오버로딩 버전으로 작업
// 메소드의 이름은 동일하고 매개변수의 타입, 개수, 순서가 달라야함



public class Calculator3 {
  void sum(int a, int b) {
    int result = a + b;
    System.out.println("sum = " + result);
  }

  void sum(double a, double b) {
    double result = a + b;
    System.out.println("sum = " + result);
  }

  void sum(long a, long b) {
    long result = a + b;
    System.out.println("sum = " + result);
  }

  void sum(float a, float b) {
    float result = a + b;
    System.out.println("sum = " + result);
  }

  // 메소드명은 같고 매개변수 개수가 다를 경우
  void multi(){ //0개
    int x = 10;
    int y = 20;
    System.out.println("두 수의 곱셈은 " + x * y);
  }
  void multi(int x){ // 1개
    int y = 20;
    System.out.println("두 수의 곱셈은 " + x * y);
  }

  void multi(int x, int y){ // 2개
    System.out.println("두 수의 곱셈은 " + x * y);
  }

  // 매개변수의 타입이 다를 경우
  // 아래 두개는 같은 타입이 들어가지만 순서가 달라서 다른 메소드로 인식함
  void multi(int x, long y){
    System.out.println("두 수의 곱셈은 " + x * y);
  }

  void multi(long x, int y){
    System.out.println("두 수의 곱셈은 " + x * y);
  }
}

