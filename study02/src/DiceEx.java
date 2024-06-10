public class DiceEx {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;
//        Math.random() : 0.0~0.9까지의 숫자를 랜덤으로 출력하는 명령어
//        연산 값이 double 자동형변환 됨 > int로 강제 형변환, 소숫점은 버림
//        0.9 * 6 =5.4 + 1 = 6.4 소수점 버림 = 6
        if(num == 1){
            System.out.println("1번이 나왔습니다.");
        }
        else if(num == 2){
            System.out.println("2번이 나왔습니다.");
        }
        else if(num == 3){
            System.out.println("3번이 나왔습니다.");
        }
        else if(num == 4){
            System.out.println("4번이 나왔습니다.");
        }
        else if(num == 5){
            System.out.println("5번이 나왔습니다.");
        }
        else{
            System.out.println("6번이 나왔습니다.");
        }





    }
}
