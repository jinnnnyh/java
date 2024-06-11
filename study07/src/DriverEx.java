public class DriverEx {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Taxi t = new Taxi();
    Bus b = new Bus();

    v.run();
    t.run();
    b.run();

    // 다형성
    v = t;
    v.run();

    v = b;
    v.run();

    System.out.println("\n----매개변수의 다형성----");
    Driver d = new Driver();
    // 매개변수는 Vehicle 클래스 타입만 받을 수 있음
    // Vehicle 타입 안에 자식인 Taxi, Bus 넣을 수 있음 , 오버라이딩
    d.drive(b); // v=b
    d.drive(t); // v=t
  }
}
