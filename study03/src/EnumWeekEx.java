import java.util.Calendar;
import java.util.Scanner;

public class EnumWeekEx {
  public static void main(String[] args) {
    // 사용자가 생성한 열거형 타입의 변수 today로 선언
    // Week에 선언한 7개만 저장 가능
    
    Week today = null;
    
    // 자바에서 제공하는 날짜 관련 클래스, 현재 시간을 기준으로 날짜를 가져옴
    Calendar cal = Calendar.getInstance();
    int week = cal.get(Calendar.DAY_OF_WEEK);

    // week값에 따라 today에 다른 값 저장
    switch (week){
      case 1:
        today = Week.SUNDAY;
        break;
      case 2:
        today = Week.MONDAY;
        break;
      case 3:
        today = Week.TUESDAY;
        break;
      case 4:
        today = Week.WEDNESDAY;
        break;
      case 5:
        today = Week.THURSDAY;
        break;
      case 6:
        today = Week.FRIDAY;
        break;
      case 7:
        today = Week.SATURDAY;
        break;
    }
    System.out.println("오늘 요일 : " + today);
    if (today == Week.SUNDAY){
      System.out.println("일요일에는 축구를 합니다");
    }
    else{
      System.out.println("열심히 자바 공부합시다");
    }

    // 126p Q.2
    System.out.println("\n정수 10개 입력");
    Scanner sc1 = new Scanner(System.in);
    int[] arrNum = new int[10];
    for (int i = 0 ; i < arrNum.length; i++) {
      System.out.print(i+1 +"번째 정수 입력 >> ");
      arrNum[i] = sc1.nextInt();
    }

    System.out.print("3의 배수는 : ");
    for (int i = 0 ; i < arrNum.length; i++) {
      if(arrNum[i] % 3 == 0){
        System.out.print(arrNum[i]+" ");
      }
    }

    // Q.4
    String[] day = {"일","월","화","수","목","금","토"};
    Scanner sc2 = new Scanner(System.in);

    while (true){
      System.out.print("정수를 입력하세요>> ");
      int dayNum = sc2.nextInt();

      if (dayNum > 0){
        System.out.println(day[dayNum % 7]);
      }
      else if(dayNum < 0) {
        System.out.println("프로그램을 종료합니다.. ");
        break;
      }
//      else{
//        System.out.println("경고! 수를 입력하지 않았습니다.");
//      }
    }


    // Q.6
    String[] eng = {"student","love","java","happy","future"};
    String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};
    Scanner sc3 = new Scanner(System.in);
    while(true){
      System.out.print("영어 단여를 입력하세요 >> ");
      String str1 = sc3.nextLine();
      for(int i =0 ; i < eng.length; i++){
        if (str1.equals(eng[i])){
          System.out.println(kor[i]);
          break;
        }
//        else{
//          System.out.println("그런 영어단어가 없습니다.");
//          break;
//        }
      }
      if(str1.equals("exit")){
        System.out.println("종료합니다..");
        break;
      }
    }
  }
}
