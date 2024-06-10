public class CastingEx {
    public static void main(String[] args) {
        int intValue = 44032 ;
        char charValue = (char) intValue;
        //int 값을 char로 형변환, int 값에 맞는 문자 출력, 아스키코드값 = 가
        //10진수 44032는 16진수로 변환 시 AC00가 되고 AC00는 한글 유니코드표에서 문자 '가'를 뜻함
        System.out.println(charValue);

        long longValue = 500 ;
        //int 500 > long 자동 변환
        //500L long 타입 변수
        intValue = (int) longValue;
        // long값을 int로 강제형변환,
        System.out.println(intValue);

        double doubleValue = 3.14 ;
        intValue = (int) doubleValue;
        // double값을 int로 강제 형변환, 소수점 삭제, 큰 값 > 작은 값 강제 형변환
        System.out.println(intValue);

    }
}
