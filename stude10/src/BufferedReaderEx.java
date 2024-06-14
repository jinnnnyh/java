import java.io.*;
// 이런건 실무에서 언제쓰는걸까

public class BufferedReaderEx {
  public static void main(String[] args) throws IOException {
    // 키보드 입력 받기
    InputStream is = System.in;
    // 입력 스트립을 Reader가 받음
    Reader reader = new InputStreamReader(is);
    // Reader의 정보를 BufferedReader에 저장
    BufferedReader br = new BufferedReader(reader);

    System.out.print("입력 : ");
    // readLine() : BufferedReader에 입력된 데이터를 한번에 가져옴
    String lineString = br.readLine();

    System.out.println("출력 : " + lineString);
    br.close();
    reader.close();
    is.close();

  }
}
