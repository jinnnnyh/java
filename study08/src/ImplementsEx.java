public class ImplementsEx {
  public static void main(String[] args) {
    ImplClass impl = new ImplClass();
    impl.methodA();
    impl.methodB();
    impl.methodC();

    System.out.println("\nInterA 실행");
    InterA ia =impl;
    ia.methodA();

    System.out.println("\nInterB 실행");
    InterB ib =impl;
    ib.methodB();

    System.out.println("\nInterC 실행");
    InterC ic =impl;
    ic.methodA();
    ic.methodB();
    ic.methodC();
  }
}
// 인터페이스 상속
// 중복된 부분 있는 인터페이스 생성해야 된다면 상속을 사용하자
