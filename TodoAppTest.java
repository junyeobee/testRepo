public class TodoAppTest{
    public void todoApp(){
        // 테스트용 메소드
        int todoCount = 5; // 예시로 5개의 할 일이 있다고 가정
        // 할 일 목록을 출력
        System.out.println("할 일 목록:");
        for (int i = 1; i <= todoCount; i++) {
            System.out.println(i + ". 할 일 " + i);
        }
        // 할 일 추가
        System.out.println("새로운 할 일을 추가합니다: 할 일 6");
        todoCount++;
        // 할 일 목록을 다시 출력
        System.out.println("업데이트된 할 일 목록:");
        for (int i = 1; i <= todoCount; i++) {
            System.out.println(i + ". 할 일 " + i);
        }
    }
}