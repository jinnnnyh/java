public class FieldInitValueEx {
  public static void main(String[] args) {
    // FieldInitValue(라이브러리 클래스)의 주소값을 가지는 fiv 객체 생성
    FieldInitValue fiv = new FieldInitValue();

    System.out.println("byteField : " + fiv.byteField);
    System.out.println("sholtField : " + fiv.shortField);
    System.out.println("intField : " + fiv.intField);
    System.out.println("longField : " + fiv.longField);

    System.out.println("booleanField : " + fiv.booleanField);
    System.out.println("charField : " + fiv.charField);

    System.out.println("floatField : " + fiv.floatField);
    System.out.println("doubleField : " + fiv.doubleField);

    // 배열, string 타입의 초기값 = null
    System.out.println("arrIntField : " + fiv.arrIntField);
    System.out.println("referenceField : " + fiv.referenceField);





  }
}
