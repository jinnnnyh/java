import java.io.IOException;
import java.util.Scanner;

public class WhileEx {
  public static void main(String[] args) {
    System.out.println("----- 기본 while -----");
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }
    System.out.println("\n----- 1~100까지의 합----");
    int sum = 0;
    int j = 1;
    while (j <= 100) {
      sum += j;
      j++;
    }
    System.out.println(sum);
    boolean run = true; // 프로그램 실행 상태를 저장하는 변수
    int speed = 0; // 일반 변수
    int keyCode = 0; // 사용자가 입력한 키보드의 키값을 저장하는 변수
    
    // run = true 이므로 while문은 무한 반복
    // 메뉴 선택창 무한 반복
    while (run) { 
      // 아스키 코드값 : 13 CR(엔터키), 10 LF(화면 맨처음으로 가는것)
      if (keyCode != 13 && keyCode != 10) {
        System.out.println("----------");
        System.out.println("1.증속 | 2.감속 | 3.중지");
        System.out.println("----------");
        System.out.println("선택 : ");
      }
      
      // 자바가 아닌 외부 리소스 사용 시 오류가 발생할 수 있으므로 예외처리 로직 추가
      try{
        // 사용자의 키보드 입력을 받음, read() : 1글자만 받음
        keyCode= System.in.read();
        // 1(49),2(50),3(51) 아스키 코드값 입력 받음
        // else if 문으로 사용자가 입력한 값을 확인함
        if(keyCode==49){
          speed++;
          System.out.println("현재속도 : "+speed);
        }
        else if(keyCode==50){
          speed--;
          System.out.println("현재속도 : "+speed);
        }
        else if(keyCode==51){
          // 무한 반복 중인 while문의 조건식의 값을 flase로 변경하여 while문 탈출
          run = false;
        }
      }
      catch(IOException e) {
        System.out.println("잘못된 입력입니다.\n다시 입력해주세요");
      }
    }
    System.out.println("----프로그램종료----");

    System.out.println("\n----do~while----\n");

    System.out.println("메시지를 입력하세요");
    System.out.println("프로그램을 종료하려면 q를 입력하세요");
    // Scanner 키보드 입력을 위해 사용하는 클래스
    Scanner sc = new Scanner(System.in);
    String inputString; // 사용자가 입력한 내용을 저장할 변수
    do{
      System.out.print(">> ");
      // next() 키보드 입력을 문자열 데이터로 가져옴, 공백을 기준으로 하여 데이터를 구분함
      // nextLine() 입력한 한줄을 읽어옴, 문자 데이터를 가져옴
      // 엔터키(\n)를 기준으로 하나의 라인으로 인식함
      // nextInt() 키보드 입력을 '정수' 데이터를 가져옴
      // nextDouble() 키보드 입력을 '실수' 데이터를 가져옴
      
      // 무조건 한번은 실행이 되어야함, 입력 받지 않았는데도 공백으로 일단 실행, 2번째부터 입력가능
      inputString = sc.nextLine();
      System.out.println(" - " + inputString);
    }while(!inputString.equals("q")); // q가 아니면 do로 돌아가서 실행

    System.out.println();
    System.out.println("프로그램 종료");
    //sout + tab 자동완성




  }
}
