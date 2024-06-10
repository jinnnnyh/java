public class ArrayRefObjEx {
  public static void main(String[] args) {


    // 객체를 참조하는 배열, 배열 선언 시 데이터 타입을 참조 타입으로 설정

    // 배열을 선언만 함, 빈 배열
    String[] strArr = new String[3];

    // 데이터 입력 전
    for (int i = 0; i < strArr.length; i++) {
      System.out.println("strArr[" + i + "] = " + strArr[i]);
    }

    // 기본 타입처럼 String 데이터를 입력
    strArr[0] = "Java";
    strArr[1] = "Java";

    // new 키워드를 사용하여 데이터 입력
    strArr[2] = new String("Java");
    
    // 데이터 입력 후

    // 주소 비교
    System.out.println(strArr[0] == strArr[1]); // 서로 같은 힙
    System.out.println(strArr[0] == strArr[2]); // 서로 다른 힙

    // 문자열 비교
    System.out.println(strArr[0].equals(strArr[2])); // 서로 같은 문자열
  }
}
