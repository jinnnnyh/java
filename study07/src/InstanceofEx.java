public class InstanceofEx {
  public static void main(String[] args) {
    // 부모 클래스인 Parent3 클래스 타입의 변수에 자식 클래스인 Child3 클래스 타입의 객체를 저장
    // 원본이(알맹이) 자식 클래스 객체인 부모 클래스(껍데기) 타입 변수
    Parent3 parentA = new Child3();
    method1(parentA);
    method2(parentA);

    System.out.println();

    // 부모 클래스의 객체
    // 원본이 부모
    Parent3 parentB = new Parent3();
    method1(parentB);
    method2(parentB);
  }

  // instanceof 사용하여 강제 타입 변환
  // 원본이 child3 맞는지 확인함, 맞으면 타입 변환 실행
  public static void method1(Parent3 parent){
    if(parent instanceof Child3){
      Child3 child = (Child3)parent; // 강제 타입 변환
      System.out.println("method1 - Child3 타입으로 변환 성공");
    }
    else {
      System.out.println("method1 - Child3 타입으로 변환 실패");
    }
  }
  // instanceof 없이 강제 타입 변환
  public static void method2(Parent3 parent){
    Child3 child = (Child3)parent;
    System.out.println("method2 - Child3 타입으로 변환 성공");
  }
}
