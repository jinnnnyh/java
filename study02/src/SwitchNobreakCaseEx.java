public class SwitchNobreakCaseEx {

  public static void main(String[] args) {
    int time = (int)(Math.random()*4) + 8;
//    8~12까지 숫자를 랜덤으로 출력
    System.out.println("현재 시간 : " + time);
    
    switch (time) {
      case 8:
        System.out.println("출근합니다");
      case 9:
        System.out.println("회의를 합니다");
      case 10:
        System.out.println("업무를 봅니다");
      default:
        System.out.println("외근을 나갑니다");
    }

//    switch 조건식에 문자열 넣기
    String position = "과장";
    switch (position) {
      case "부장":
        System.out.println("700만원");
        break;
      case "과장":
        System.out.println("500만원");
        break;
      default:
        System.out.println("100만원");
    }

  }
}
