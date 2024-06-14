public class MyClassB implements MyInterface{

  @Override
  public void method1() {
    System.out.println("MyClassB method1");
  }

  // 디폴트 메소드 오버라이딩없이 사용 가능하지만 MyClassB 클래스에 맞게 오버라이딩하여 사용함
  @Override
  public void method2() {
    System.out.println("MyClassB method2");
  }
}
