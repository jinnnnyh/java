public class CalculatorEx {
  public static void main(String[] args) {
    // 정적 멤버를 사용한 연산
    // Calculator클래스 타입의 객체가 없음

    // 객체명.필드명이 아닌, 클래스명.필드명으로 사용함
    double result1= 10*10*Calculator.pi;
    int result2 = Calculator.plus(10,5);
    int result3 = Calculator.minus(10,5);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);

    // Calculator 클래스 타입의 객체를 생성하고 인스턴스 멤버를 통해서 연산
    // 인스턴스 멤버를 사용한 연산
    // 정적 멤버를 객체를 통해서 접근하는 방식은 권장하지 않음
    // 결과는 똑같음
    System.out.println("\n---------------\n");
    Calculator cal = new Calculator();
    result1 = 10*10*cal.pi;
    result2 = cal.minus(10,5);
    result3 = cal.plus(10,5);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);

    System.out.println("\n---------------\n");

    Calculator2 cal1 = new Calculator2();
    Calculator2 cal2 = new Calculator2();

    // 객체의 인스턴스 필드를 가지고 연산
    // 값을 따로따로 변경 >> 전부 오류 X
    cal1.num1=10;
    cal1.num2=20;
    System.out.println("두 수의 덧셈은 : " + (cal1.num1+cal1.num2));

    cal2.num1=100;
    cal2.num2=200;
    System.out.println("두 수의 덧셈은 : " + (cal2.num1+cal2.num2));

    // 정적 멤버
    cal1.staticNum1 = 10;
    cal1.staticNum2 = 20;
    System.out.println("두 수의 덧셈은 : " + (cal1.staticNum1+cal1.staticNum2));

    cal2.staticNum1 = 100;
    cal2.staticNum2 = 200;
    System.out.println("두 수의 덧셈은 : " + (cal2.staticNum1+cal2.staticNum2));

    System.out.println("\n---------------\n");

    // 값을 동시에 변경
    // 객체의 인스턴스 멤버
    cal1.num1 = 100;
    cal1.num2 = 200;
    cal2.num1 = 1000;
    cal2.num2 = 2000;
    System.out.println("cal1 두 수의 덧셈은 : " + (cal1.num1+cal1.num2));
    System.out.println("cal2 두 수의 덧셈은 : " + (cal2.num1+cal2.num2));

    // Calculator2의 정적멤버를 객체로 불러와서 인스턴스 멤버로 사용함
    // 값이 제대로 나오지 않음
    cal1.staticNum1 = 100;
    cal1.staticNum2 = 200;
    cal2.staticNum1 = 1000;
    cal2.staticNum2 = 2000;

    System.out.println("cal1 두 수의 덧셈은 : " + (cal1.staticNum1+cal1.staticNum2)); //// 얘 왜 3000나와???
    System.out.println("cal2 두 수의 덧셈은 : " + (cal2.staticNum1+cal2.staticNum2));

    System.out.println("\n---------------\n");


    //// 마지막으로 저장된 값이 들어가는건가 ?
    // 같은 주소를 공유하므로 동시에 저장할 때 제일 마지막 값이 저장됨
    // 선언 후 바로 실행하면 문제 없음
    cal1.staticNum1 = 10;
    cal1.staticNum2 = 20;
//    System.out.println("cal1의 static 두 수의 덧셈은` : " + (cal1.staticNum1+cal1.staticNum2));
    cal2.staticNum1 = 1000;
    cal2.staticNum2 = 2000;
//    System.out.println("cal2의 static 두 수의 덧셈은 : " + (cal2.staticNum1+cal2.staticNum2));

    Calculator2.staticNum1 = 10000;
    Calculator2.staticNum2 = 20000;
    System.out.println("cal1의 static 두 수의 덧셈은 : " + (cal1.staticNum1+cal1.staticNum2));
    System.out.println("cal2의 static 두 수의 덧셈은 : " + (cal2.staticNum1+cal2.staticNum2));
    System.out.println("Calculator2의 static 두 수의 덧셈은 : " + (Calculator2.staticNum1+Calculator2.staticNum2));

    // 객체 필드마다 다른 값을 넣어야 한다면 인스턴스 멤버
    // 값이 동일하게 들어가야한다면 정적 멤버


  }
}
