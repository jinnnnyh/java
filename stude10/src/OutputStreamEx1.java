import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 파일이 새로 만들어짐 !! 신기해
// 기존 파일은 내용 수정이 돼
public class OutputStreamEx1 {
  public static void main(String[] args) throws IOException {
    OutputStream os = new FileOutputStream("C:\\fullstack405\\java\\test2.txt");
    byte[] data = "boynextdoor".getBytes();
    for (int i = 0; i < data.length; i++) {
      os.write(data[i]); // 1바이트씩 씀
    }
    os.flush();
    os.close();

    os = new FileOutputStream("C:\\fullstack405\\java\\test2-1.txt");
    byte[] data2 = "ABCDLOVE".getBytes();
    os.write(data2); // 바이트배열 크기만큼 씀 ??  ? ?영어는 ㄱㅊ은데 한국어는 깨짐 > reader 사용함
    os.flush();
    os.close();


    System.out.println("\n-----파일쓰기 완료-----");
  }
}
