import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    // 126p Q.2
    System.out.println("Q2) 정수 10개 입력");
    Scanner sc1 = new Scanner(System.in);
    // 입력받은 데이터를 저장할 배열
    int[] arrNum = new int[10];
    
    // for문 사용하여 10번 키보드 입력 받음
    for (int i = 0 ; i < arrNum.length; i++) {
      System.out.print(i+1 +"번째 정수 입력 >> ");
      // 키보드 입력을 정수로 입력받고 지정한 배열의 인덱스에 저장
      arrNum[i] = sc1.nextInt();
    }

    System.out.print("3의 배수는 : ");
    for (int i = 0 ; i < arrNum.length; i++) {
      // 3으로 나눈 나머지가 0이면
      if(arrNum[i] % 3 == 0){
        System.out.print(arrNum[i]+" ");
      }
    }
    System.out.println();

    // Q.4
    // 문자의 배열이므로 char 타입의 배열을 선언
    char[] day = new char[]{'일','월','화','수','목','금','토'};
    Scanner sc2 = new Scanner(System.in);
    
    while (true){
      System.out.print("Q4) 정수를 입력하세요>> ");
      int dayNum = sc2.nextInt();
      if (dayNum > 0){
        // 연산식을 직접 넣는것 보단 index로 수정하면 더 깔끔함
        // int index = dayNum % 7 
        System.out.println(day[dayNum % 7]);
      }
      else if(dayNum < 0) {
        System.out.println("프로그램을 종료합니다.. ");
        break;
      }
      // 예외발생 처리구문 아직 안배웠음 
      // 쌤은 try catch 구문 사용해서 예외처리함
//      else{
//        System.out.println("경고! 수를 입력하지 않았습니다.");
//      }
    }
    System.out.println();
    
    // Q.6
    String[] eng = {"student","love","java","happy","future"};
    String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};

    Scanner sc3 = new Scanner(System.in);

    while(true){
      System.out.print("Q6) 영어 단여를 입력하세요 >> ");
      String str1 = sc3.nextLine();

      if(str1.equals("exit")){
        System.out.println("종료합니다..");
        break;
      }
      else{
        for(int i =0 ; i < eng.length; i++) {
          if (str1.equals(eng[i])) {
            System.out.println(kor[i]);
            break;
          // 단어가 없는 경우 공백을 저장하는 변수를 생성하고 출력을 여기서 말고 for문 밖에서 하면 됨
          }
        }
      }
    }

    System.out.println();
    //Q.8
    Scanner sc4 = new Scanner(System.in);
    // 0가위 1바위 2보
    // 랜덤 숫자로 index로 선택하여 사용하게 함
    String[] com = {"가위","바위","보"};
    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

    while (true){
      System.out.print("가위 바위 보! >> ");
      String input = sc4.nextLine();
      int index = (int)(Math.random()*3); // 0~2 까지 랜덤

      // 1. 그만할지, 계속할지 여부 결정
      if (input.equals("그만")){
        System.out.println("게임을 종료합니다.");
        break; // 제일 가까운 반복문인 while 멈춤
      }
      // 2. 가위바위보 연산
      if(input.equals("가위")){
        if(com[index].equals("가위")){
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 비겼습니다"); //결과 출력
        }
        else if(com[index].equals("바위")){
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 컴퓨터가 이겼습니다"); //결과 출력
        }
        else {
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 사용자가 이겼습니다"); //결과 출력
        }
      }
      else if(input.equals("바위")){
        if(com[index].equals("가위")){
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 사용자가 이겼습니다"); //결과 출력
        }
        else if(com[index].equals("바위")){
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 비겼습니다"); //결과 출력
        }
        else {
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 컴퓨터가 이겼습니다"); //결과 출력
        }
      }
      else if(input.equals("보")){
        if(com[index].equals("가위")){
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 컴퓨터가 이겼습니다"); //결과 출력
        }
        else if(com[index].equals("바위")){
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 사용자가 이겼습니다"); //결과 출력
        }
        else {
          System.out.println("사용자 : " + input + ", 컴퓨터 : "+ com[index] +", 비겼습니다"); //결과 출력
        }
      }
    }
  }
}
