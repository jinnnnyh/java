public class StringEqualsEx {
  public static void main(String[] args) {
    // 기본 타입처럼 String 타입을 사용하여 생성한 String 타입 변수
    // 같은 힙 공유
    // 같은 데이터라고 판단하고 같은 주소에 넣어버림
    String strVal1 = "한태산";
    String strVal2 = "한태산";
    
    // new 키워드를 사용하여 생성한 String 타입 변수
    // 힙에 새로운 공간을 만들고(주소값 다름) 데이터 저장
    String strVal3 = new String("한태산");
    String strVal4 = new String("한태산");

    System.out.println("변수 strVal1 : " + strVal1);
    System.out.println("변수 strVal2 : " + strVal2);
    System.out.println("변수 strVal3 : " + strVal3);
    System.out.println("변수 strVal4 : " + strVal4);
    
    System.out.println("\n기본 타입처럼 사용할 때");
    if (strVal1 == strVal2){
      System.out.println("strVa1과 strVal2는 참조가 같음");
    }
    else{
      System.out.println("strVal1 과 strVal2는 참조가 다름");
    }

    // String 타입의 변수에 저장된 데이터끼리 비교 검사
    // equals() : 문자열을 비교하는 명령어
    if(strVal1.equals(strVal2)){
      System.out.println("strVal1과 strVal2는 문자열이 같음");
    }
    else{
      System.out.println("strVal1과 strVal2는 문자열이 다름");
    }

    System.out.println("\nnew String() 사용했을 때");
    if(strVal3==strVal4){
      System.out.println("strVa3과 strVal4는 참조가 같음");
    }
    else{
      System.out.println("strVal3과 strVal4는 참조가 다름");
    }
    
    if(strVal3.equals(strVal4)){
      System.out.println("strVal3과 strVal4는 문자열이 같음");
    }
    else{
      System.out.println("strVal3과 strVal4는 문자열이 다름");
    }
    
    System.out.println();
    
    if (strVal1 == strVal3){
      System.out.println("strVal1과 strVal3는 참조가 같다");
    }
    else{
      System.out.println("strVal1과 strVal3는 참조가 다름");
    }
    
    if (strVal1.equals(strVal3)){
      System.out.println("strVal1과 strVal3는 문자열이 같다");
    }
    else{
      System.out.println("strVal1과 strVal3는 문자열이 다름");
    }
    System.out.println();

    // String 타입 변수 strVal5에 strVal3을 저장, 5에 3이 저장하고 있는 주소를 대입
    // '한태산'이라는 문자열의 주소값
    String strVal5 = strVal3;
    System.out.println("변수 strVal5 : " + strVal5);

    if (strVal3 == strVal5){
      System.out.println("strVal3과 strVal5는 참조가 같다");
    }
    else{
      System.out.println("strVal3과 strVal5는 참조가 다름");
    }

    if (strVal3.equals(strVal5)){
      System.out.println("strVal3과 strVal5는 문자열이 같다");
    }

  }
}
