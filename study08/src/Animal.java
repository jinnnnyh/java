// 추상 클래스로 선언한 Animal 클래스
public abstract class Animal {
  public String kind;
  public void breathe(){
    System.out.println("숨을 쉽니다");
  }

  // 추상 메소드 : 메소드의 선언부만 존재하고, 몸체인 코드블록은 존재하지 않는 메소드
  // 추상 메소드로 메소드 선언 시 반드시 abstract 키워드 사용
  // 추상 메소드를 가지고 있는 클래스는 반드시 추상 클래스로 선언해야 함
  public abstract void sound();
}

// ex) Animal 클래스의 sound()다 > 동물의 소리를 넣어라 하는 규격을 정해놓음