public class AdvancedForEx {
  public static void main(String[] args) {
    int[] scores = {90,95,80,83,71};

    System.out.println("---- 향상된 for문으로 연산하기 ----");
    int sum = 0;
    
    // scores 배열, 컬렉션이라고 함
    // 배열 안에있는 데이터를 처음부터 끝까지 한개씩 꺼냄
    // 값을 받을 변수 : 배열
    for (int score : scores) {
      sum += score;
    }
    
    System.out.println("접수 총합 : " + sum);
    double avg = (double) sum / scores.length;
    System.out.println("점수 평균 : " + avg);

    System.out.println("\n---- 기존 for문으로 연산하기 ----");
    
    sum = 0;

    // 시작과 끝을 원하는 위치로 설정할 수 있음
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    
    System.out.println("접수 총합 : " + sum);
    avg = (double) sum / scores.length;
    System.out.println("점수 평균 : " + avg);
  
  }
}
