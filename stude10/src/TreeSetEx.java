import java.util.TreeSet;

public class TreeSetEx {
  public static void main(String[] args) {
    // TreeSet 객체 생성
    // 정렬O, 검색 쉬움
    TreeSet<Integer> scores = new TreeSet();
    scores.add(87);
    scores.add(98);
    scores.add(75);
    scores.add(65);
    scores.add(95);

    Integer score = null;

    // 이진트리에서
    // 제일 왼쪽에 있는 값 = 제일 작은 값 출력
    score = scores.first();
    System.out.println("가장 낮은 점수 : " + score);

    // 제일 오른쪽에 있는 값 = 제일 큰 값
    score = scores.last();
    System.out.println("가장 높은 점수 : " + score);

    // 지정한 값보다 작은 값
    score = scores.lower(95);
    System.out.println("95보다 아래 점수 : " + score);

    // 지정한 값보다 큰 값
    score = scores.higher(95);
    System.out.println("95보다 위에 점수 : " + score);

    // 지정한 값이거나 작은 값
    score = scores.floor(95);
    System.out.println("95 이거나 바로 아래 점수 " + score );

    // 지정한 값이거나 큰 값
    score = scores.ceiling(85);
    System.out.println("85 이거나 바로 위의 점수 " + score);

    while(!scores.isEmpty()){
      // pollFirst() : 이진트리에서 지정한 공간에서 작은 값부터 출력해서 없앰
      score = scores.pollFirst();
      System.out.println(score + "(남은수 : "+scores.size() + ")");
    }


  }
}
