import java.util.Arrays;

public class ArrayCopyEx {
  public static void main(String[] args) {
    System.out.println("---- 배열 복사하기 ----\n");

    // int 타입의 배열 선언과 동시에 데이터 저장
    int[] arr1 = {10, 20, 30};

    // int 타입의 배열 선언하고 배열 arr1의 주소값을 대입
    // 주소값이 같아져서 같은 힙을 공유, 한 개만 수정해도 둘 다 바뀜
    int[] arr2 = arr1;

    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    System.out.println("\n---- 배열 arr1에 데이터 수정 ----\n");

    arr1[0] = 100;
    arr1[1] = 200;
    arr1[2] = 300;

    // arr1 데이터만 수정했는데 arr2 수정됨
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    System.out.println("\n---- 배열 arr2에 데이터 수정 ----\n");
    // arr2 데이터만 수정했는데 arr1 수정됨
    arr2[0] = 1000;
    arr2[1] = 2000;
    arr2[2] = 3000;

    // arr1 데이터만 수정했는데 arr2 수정됨
    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }



    System.out.println("\n---- for문으로 값 직접 복사----\n");
    int[] arr3 = {10, 20 ,30}; // 원본 배열
    int[] arr4 = new int[3]; //복사 받을 배열, 새로운 힙 생성

    System.out.println("----배열 내용 복사 전 배열 내용----");
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }
    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    System.out.println("----배열 내용 복사----");
    // 인덱스로 넣음
    for (int i = 0; i < arr3.length; i++) {
      arr4[i] = arr3[i];
    }

    System.out.println("----배열 내용 복사 후 결과----");
    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    System.out.println("---- 원본 배열 내용 수정 후 배열 내용 ----");

    arr3[0] = 100;
    arr3[1] = 200;
    arr3[2] = 300;
    // arr4의 데이터는 수정되지 않음
    // 원본 배열인 arr3인 데이터가 수정되어도 사본 배열인 arr4의 데이터는 그대로 유지
    // arr3, 4는 서로 주소값이 다른 힙
    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }


    System.out.println("\n---- arraycopy()를 사용하여 배열 복사 ----\n");

    int[] arr5 = {10, 20, 30};
    int[] arr6 = new int[3];

    System.out.println("---- 원본배열내용----");
    for (int i = 0; i < arr5.length; i++) {
      System.out.println("arr5[" + i + "] : " + arr5[i]);
    }

    System.out.println();

    for (int i = 0; i < arr6.length; i++) {
      System.out.println("arr6[" + i + "] : " + arr6[i]);
    }

    System.out.println("\n---- arraycopy()로 복사 ----\n");
    // System.arraycopy() : System 클래스에서 제공하는 배열 복사 메소드
    // 5개의 매개변수를 사용함
    // 원본, 원본에서 복사 시작 index, 복사받을 배열, 붙여넣기 할 index, 복사할 크기
    System.arraycopy(arr5,0,arr6,0,arr5.length);

    System.out.println("----배열 내용 복사 후 결과----");
    for (int i = 0; i < arr6.length; i++) {
      System.out.println("arr6[" + i + "] : " + arr6[i]);
    }

    System.out.println("\n---- 원본 배열 내용 수정 후 배열 내용 ----");
    arr5[0] = 100;
    arr5[1] = 200;
    arr5[2] = 300;
    // arr6은 수정 안됨
    for (int i = 0; i < arr6.length; i++) {
      System.out.println("arr6[" + i + "] : " + arr6[i]);
    }

    System.out.println("\n---- Arrays 클래스를 사용하여 복사 ----\n");
    // copyOf() : 원본의 내용을 지정한 개수만큼 복사, 복사 시작 index는 무조건 0으로 지정
    // 사용법 : int[] 배열명 = Arrays.copyOf(원본배열, 복사할 크기);
    // copyOfRange() : 원본의 내용을 지정한 위치에서 지정한 위치만큼 복사, 복사 시작 index와 복사 완료 index를 지정할 수 있음
    // 사용법 : int[] 배열명 = Arrays.copyOfRange(원본배열, 복사 시작 index, 복사 완료 index);

    int[] arr7 = {10, 20, 30};
    int[] arr8 = new int[3];

    System.out.println("---- 원본배열내용----");
    for (int i = 0; i < arr7.length; i++) {
      System.out.println("arr7[" + i + "] : " + arr7[i]);
    }

    System.out.println();

    for (int i = 0; i < arr8.length; i++) {
      System.out.println("arr8[" + i + "] : " + arr8[i]);
    }
    System.out.println("---- copyOf()로 복사 ----");
    // 0번 인덱스부터 arr7의 길이만큼 복사
    arr8 = Arrays.copyOf(arr7, arr7.length);

    System.out.println("----배열 내용 복사 후 결과----");
    for (int i = 0; i < arr8.length; i++) {
      System.out.println("arr8[" + i + "] : " + arr8[i]);
    }

  }
}
