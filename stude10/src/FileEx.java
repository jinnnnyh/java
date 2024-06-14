import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileEx {
  public static void main(String[] args) throws IOException {
    // File 클래스 타입의 객체 생성, 지정한 경로의 폴더 및 파일을 사용하여 File 객체 생성
    File dir  = new File("C:\\fullstack405\\java");
    File file1 = new File("C:\\fullstack405\\java\\test1.txt");
    File file2 = new File("C:\\fullstack405\\java\\test2.txt");
    File file3 = new File("C:\\fullstack405\\java\\test3.txt");

    // 파일이 이미 존재할 경우 덮어씌워지기 때문에 아래와 같은 File 클래스를 이용한 확인 절차가 필요함
    // 없으면 만들고 아니면 넘어감
    if (dir.exists() == false) {
      // mkdir() : 폴더생성
      dir.mkdir();
    }
    if(file1.exists() == false){
      // createNewFile() : 파일 생성
      file1.createNewFile();
    }
    if(file2.exists() == false){
      file2.createNewFile();
    }
    if(file3.exists() == false){
      file3.createNewFile();
    }

    File temp = new File("C:\\fullstack405\\java");
    // 자바에서 제공하는 날짜 정보를 쉽게 표기하기 위한 클래스
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
    // listFiles() : 지정한 경로의 목록을 가져옴
    File[] contents = temp.listFiles();

    for (File file : contents){
    System.out.println("날짜    시간    형태    크기    이름");
      System.out.println("----------------------------");
      if (file.isDirectory()){ // 디렉토리인지
        System.out.println("\t<DIR>\t\t\t" + file.getName());
      }
      else { // 아닌지 (파일인지
        System.out.println(file.length() +"\t"+ file.getName());
      }
    }

  }
}
