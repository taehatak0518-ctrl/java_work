import constant.ConstEx;

import javax.swing.*;

public class Main {
    static void main(String[] args) {
        System.out.println("그룹이름:" + ConstEx.GROUP_NAME);
        // 두 명의 메모장 = 일반변수
        int chulsuMemo = 0;
        int gildongMemo=0;
        // 길동의 메모값을 +1
        gildongMemo++;
        System.out.println("철수메모값:"+chulsuMemo);
        System.out.println("길동메모값:"+gildongMemo);

        // 단톡방 인원 3명 들어옴
        ChatRoom.mamberCount++;
        ChatRoom.mamberCount= ChatRoom.mamberCount + 1;
        ChatRoom.mamberCount+=1;

        System.out.println(ChatRoom.ROOM_NAME+",인원:"=ChatRoom.ROOM_NAME);




    }
}
