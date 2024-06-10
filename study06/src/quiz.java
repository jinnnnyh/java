import java.util.Scanner;

public class quiz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 스캐너 선언해놓고 가져다 쓰기

    System.out.println("-----문제1)-----");
    Song mySong = new Song("Nessun Dorma");
    Song yourSong = new Song("공주는 잠 못 이루고");
    System.out.println("내 노래는 " + mySong.getTitle());
    System.out.println("네 노래는 " + yourSong.getTitle());

/////////////////////////////////////////////////////////////////////////////

    System.out.println("\n-----문제2)-----");
    System.out.print("이름과 전화번호 입력 >>");
    String name = sc.next();
    String tel = sc.next();
    // 입력받은 내용을 기반으로 객체 생성
    Phone p1 = new Phone(name, tel);

    // 두번째 변수는 String 붙여서 새로운 변수 선언 하지 않고, 변수 재활용
    // 그럼 안에 들어있던 첫번째 값은 출력해서 사라지는건가? >> 덮이씌우는듯, 새 변수 만들어서 하는게 좋다고함

    System.out.print("이름과 전화번호 입력 >>");
    name = sc.next();
    tel = sc.next();
    Phone p2 = new Phone(name, tel);

    System.out.println(p1.getName() + "의 번호 " + p1.getTel());
    System.out.println(p2.getName() + "의 번호 " + p2.getTel());

/////////////////////////////////////////////////////////////////////////////

    System.out.println("\n-----문제3)-----");

//    Rect[] rect = new Rect[4];
//    Rect 클래스 타입의 배열을 생성한 것이지 Rect 클래스 타입의 객체 생성 X
//    Rect 클래스 타입의 배열 요소는 현재 모두 null

//    rect[i] = new Rect(width, height);
//    Rect 클래스 타입의 배열의 i번 index에 새로운 Rect 클래스 타입의 객체를 생성
//    객체 생성 전 배열은 {null, null, null, null}

//    if(i + 1 == rect.length){}
//    인덱스의 개수와 같아지면 저장완료 뜨고 for 문 끝
    // 나는 sub 배열 만들어서 다시 저장하고 확인함 , Rect 배열 만들어서 썼으면 새 배열 안만들어도 됨

    //  Rect 배열 사용못함 + 2중 배열 사용해서 만듬 + Rect 클래스 메소드 사용X = 문제의도 X
    //  쌤코드 읽고 배열 확인하기

    int[][] r1Arr = new int[4][2];
    int [] sub = new int[4];

    for (int i = 0; i < r1Arr.length; i++) {
      System.out.print((i+1) + " 너비와 높이 >>");
      r1Arr[i][0] = sc.nextInt();
      r1Arr[i][1] = sc.nextInt();
      Rect rect = new Rect(r1Arr[i][0], r1Arr[i][1]); // ?????
      sub[i] = r1Arr[i][0] * r1Arr[i][1]; // 요소들 저장됐는지 확인
    }

    for (int i = 0; i < r1Arr.length; i++) {
      System.out.println(sub[i]);
    }

    System.out.println("저장하였습니다");

    int sum = 0;
    for (int i = 0; i < sub.length; i++) {
      sum += sub[i];
    }
    System.out.println("사각형 전체 합은 " + sum );

/////////////////////////////////////////////////////////////////////////////

    System.out.println("\n-----문제4)-----");
    System.out.print("인원수 >>");
    int count = sc.nextInt();
    // 2차원 배열 안써도 됨, 1차원 배열 쓰고 요소를 객체로 넣으면 됨
//    Phone2 phone = new Phone2[count];

    String [][] strArr = new String[count][2];

    for (int i = 0; i < count; i++) {
      System.out.print("이름과 전화번호 입력 >>");
      // String name = sc.next();
      // String tel = sc.next();
      // phone[i] = new Phone2(name, tel);

      strArr[i][0] = sc.next();
      strArr[i][1] = sc.next();
      Phone p3 = new Phone(strArr[i][0], strArr[i][1]); // 머임 어떻게 저장된거임 ?? ???
      // strArr에 저장되긴했는데 p3에 저장된건지는 확인을 안함
      // for 문 돌때마다 p3만들어서 넣은건가 ????????
      // 코드 대박 잘못만들었네............................    왜 실행된거임........
    }

      // 들어갔는지 확인하는 부분
    // for (int i = 0; i < strArr.length; i++) {
    //  System.out.println(strArr[i][0]+" "+strArr[i][1]);
    // }
    String name4 ;
    int check;
    sc.nextLine();
    // 스캐너를 통해서 키보드 입력을 받았을 경우
    // 입력을 위해서 사용한 메소드의 종류에 따라 '\n'이 메모리에 남아있는 경우가 있음
    // nextLine()을 한 번 실행해서 버퍼의 내용을 없애줌
    // 출력하면 메모리에서 없어지나보다

    // 여긴 진짜 잘못만들었음 ........................
    while(true) {
      check = 0;
      System.out.print("검색할 이름 >>");
      name4 = sc.nextLine();
      for (int i = 0; i < count; i++) {
        if (name4.equals(strArr[i][0])) {
          // 바로 출력문 넣지말고 한번 저장했다가 사용하면 check 같은 확인 변수 따로 선언 안해도 됨
          // 근데 그럼 나중에 출력할 떄 조건문이 좀 복잡해짐

          System.out.println(strArr[i][0] + "의 번호는 " + strArr[i][1] + " 입니다.");
          check ++;
        }
      }
      if (name4.equals("exit")) {
        System.out.println("프로그램을 종료합니다");
        break;
      }
      if (check == 0){
        System.out.println(name4 + " 없습니다");
      }
    }

///////////////////////////////////////////////////////////////
    System.out.println("\n-----문제5)-----");


  }
}
