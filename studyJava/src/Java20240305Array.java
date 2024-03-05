public class Java20240305Array {
    public static void main(String[] args) {
        // 배열 선언법
        int[] intArray1; // 자바 스타일 << * 매우 권장 *
        int intArray2[]; // C언어 스타일이고 쓰이지 않음

        // 배열 객체 생성
        int[] intArray3 = new int[5];   // 메모리에 5개의 빈 저장소를 만듦
        // 배열 객체에 값 입력
        intArray3[0] = 10;
        intArray3[1] = 20;
        intArray3[2] = 30;
        intArray3[3] = 40;
        intArray3[4] = 50;
        for(int i = 0 ; i < 5 ; i++) {
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------- 구분선 --------------------");

        // 배열의 선언, 생성, 입력을 한번에 수행하는 코드
        int[] intArray4 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i = 0 ; i < intArray4.length ; i++) {
            System.out.print(intArray4[i] + " ");
        }
    }
}
