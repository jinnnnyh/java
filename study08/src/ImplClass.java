// 인터페이스 InterA, B 를 상속받은 인터페이스 InterC를 상속받음
public class ImplClass implements InterC {
  // 그래서 추상 메소드 3개 구현해야함
  @Override
  public void methodA(){
    System.out.println("ImplClass.methodA");
  }

  @Override
  public void methodB() {
    System.out.println("ImplClass.methodB");
  }

  @Override
  public void methodC() {
    System.out.println("ImplClass.methodC");
  }
}
