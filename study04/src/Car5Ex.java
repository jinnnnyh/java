public class Car5Ex {
  public static void main(String[] args) {

    // 같은 이름, 다른 매개변수 생성자 오버로딩 실습

    Car5 car1 = new Car5();
    // 필드값에 기본값 들어가있어서 초기화되지 않아도 사용할 수 있음 >>
    System.out.println("car1.company : " + car1.company);
    System.out.println("car1.model : " + car1.model);
    System.out.println("car1.color : " + car1.color);
    System.out.println("car1.maxSpeed : " + car1.maxSpeed);

    System.out.println();

    Car5 car2 = new Car5("세단");
    System.out.println("car2.company : " + car2.company);
    System.out.println("car2.model : " + car2.model);
    System.out.println("car2.color : " + car2.color);
    System.out.println("car2.maxSpeed : " + car2.maxSpeed);

    System.out.println();

    Car5 car3 = new Car5("세단", "검정색");
    System.out.println("car3.company : " + car3.company);
    System.out.println("car3.model : " + car3.model);
    System.out.println("car3.color : " + car3.color);
    System.out.println("car3.maxSpeed : " + car3.maxSpeed);

    System.out.println();

    Car5 car4 = new Car5("SUV","흰색",200);
    System.out.println("car4.company : " + car4.company);
    System.out.println("car4.model : " + car4.model);
    System.out.println("car4.color : " + car4.color);
    System.out.println("car4.maxSpeed : " + car4.maxSpeed);




  }
}
