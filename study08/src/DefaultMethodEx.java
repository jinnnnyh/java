public class DefaultMethodEx {
  public static void main(String[] args) {
    // 객체 못만든다고 하지 않았나 ?
    // MyInterface mi1 = new MyInterface(); 이게 안되는건가

    MyInterface mi1 = new MyClassA();
    mi1.method1();
    mi1.method2();

    System.out.println();

    MyInterface mi2 = new MyClassB();
    mi2.method1();
    mi2.method2();
  }
}
