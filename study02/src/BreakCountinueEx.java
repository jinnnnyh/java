public class BreakCountinueEx {
  public static void main(String[] args) {
    System.out.println("\n----- break -----\n");
    
    // while문의 조건식에 true를 입력하여 무한 반복
    while(true){

      // 1~6까지의 정수 중 하나를 랜덤으로 출력
      int num = (int)(Math.random()*6) + 1;
      System.out.println("랜덤 숫자" + num);

      // 출력된 랜덤 숫자 = 6 이면 break 실행
      if(num == 6){
        System.out.println("반복문 종료");
        break; // 가장 가까운 반복문인 while 종료
      }
    }
    
    System.out.println("\n----- continue -----\n");
    int num = (int)(Math.random()*10) + 1;
    System.out.println("num의 값은 : " + num);
    for(int i = 1; i <= 10; i++){
      if(i == num){
        continue;
      }
      System.out.println("i 의 값은 : " + i);
    }


  }
}
