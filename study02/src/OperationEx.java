public class OperationEx {
    public static void main(String[] args) {
        //byte 타입의 변수 선언
        byte byteValue1 = 10;
        byte byteValue2 = 20;
//        자바에서 정수 타입의 기본 타입은 int 타입
//        정수(int가 아닌 다른 정수) 타입의 데이터를 연산 시 int 타입으로 진행
//        아래의 연산은 결과값이 int 타입이 됨
//        int 타입의 결과값을 byte 타입의 변수에 저장하려고 하기 때문에 오류 발생
//      byte byteValue3 = byteValue1 + byteValue2;

        //오류 안나게 하려면 강제 형변환 해야함
        //byte 범위 안에 있는 값이라 데이터 손실(공간적 손실?)은 잃어나지만 데이터가 변하지는 않음 (?
        byte byteValue3 =(byte) (byteValue1 + byteValue2);
//        byte타입의 변수 2개를 연산하여 int 타입의 변수에 저장
//        자동 타입 변환으로 데이터 저장
        int intValue = byteValue1 + byteValue2;
        System.out.println(intValue);

        
//        char 타입의 변수 선언과 동시에 데이터 저장
        char charValue1 = 'A';
        char charValue2 = 1;

//        char 타입의 변수 2개를 연산하면 int 타입의 결과값이 출력
//        char에 저장할 때 오류
    //  char charValue3 = charValue1+charValue2;
        //  char charValue3 = (char)(charValue1+charValue2);

//        int에 저장할 때 OK
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 : " + intValue2);
        System.out.println("출력문자 : "+ (char)intValue2);


//        int 타입의 정수끼리 연산, 문제X
        int intValue3 = 10;
//        소수점 이하의 데이터는 무시
        int intValue4 = intValue3 / 4;
        System.out.println(intValue4);

//
        int intValue5 = 10;
//        10/4.0 > double로 '자동 변환됐는데' int 에 저장하려니까 오류
//      int intValue6 = 10 / 4.0;
        double dubleValue = intValue5 / 4.0;
//        int 타입의 데이터 / double 타입의 데이터 연산하여 int 타입의 데이터를 double 타입으로 자동 변환 후 연산
        System.out.println(dubleValue);

    }
}
