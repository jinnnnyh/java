public class CatEx {
  public static void main(String[] args) {
    // 부모 클래스인 Animal 클래스 타입의 변수 선언
    // 얘도 참조타입인가 ? ㅇㅇ 클래스로 선언한 변수기때문
    Animal animal;

    // Animal 클래스를 상속받은 자식 클래스인 Cat 클래스 타입의 객체 선언
    // 객체는 참조타입
    Cat cat = new Cat();

    // 부모 클래스 타입 변수에 자식 클래스 타입 객체를 대입
    // Cat 이 Animal 을 상속받고 있기 때문에 가능
    // 자바의 다형성과 자동 타입 변환에 의해서 자식 클래스 타입의 객체를 부모 클래스 타입의 변수에 대입함
    animal = cat;
    // 이런 경우만 강제 타입 변환 사용할 수 있다는거 아녀

    // 두 참조 타입의 변수가 가지고 있는 주소가 같은지 확인
    if (cat == animal){
      System.out.println("cat 과 animal 은 같다");
    }
    else {
      System.out.println("cat 과 animal 은 다르다");
    }
  }
}
