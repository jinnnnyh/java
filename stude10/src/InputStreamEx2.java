import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// try catch 사용 안하려면 throws 사용하기
// 이 예제는 결과가 붙어서 나옴

public class InputStreamEx2 {
  public static void main(String[] args) throws IOException {
    InputStream is = null;
    is = new FileInputStream("C:\\fullstack405\\java\\test1.txt");
    int readByteNo; // 가져온 데이터 수를 저장할 변수
    byte[] readBytes = new byte[3]; // 가져온 데이터를 저장하는 변수
    String data =""; // 가져온 byte[] 데이터를 문자열로 변환하여 저장할 변수
    while(true){
      // read의 byte 배열 타입 , read(byte[]) : 지정한 배열의 크기만큼 데이터를 가져옴, 없으면 -1 출력
      readByteNo = is.read(readBytes);
      if(readByteNo == -1){
        break;
      }
      // new String() 생성자를 사용하여 byte[] 의 데이터를 문자열로 변환, 기존의 data 변수에 추가
      // 이부분 때문에 글자가 다 이어져서 나옴
      data += new String(readBytes, 0, readByteNo);
    }
    System.out.println(data);
    is.close();
  }
}
