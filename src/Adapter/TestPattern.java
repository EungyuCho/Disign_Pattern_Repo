package Adapter;

public class TestPattern {
    public static void main(String[] args) {
        Aplayer player1 = new AplayImpl();
        player1.play("aaa.mp3");

        // 계약 기간 만료로 APlayerImpl을 사용할 수 없게 되었다.
        // 새로 BPlayer를 도입하였다.

        Bplayer player2 = new BplayImpl();
        player2.playFile("aaa.mp3");

        // 기존의 코드와 도입된 코드의 변경 없이 어댑터를 구현해서 사용할 수 있다.
        // 오류가 발생 시 어댑터 코드만 확인하면 된다.
        player1 = new BToAAdapter(new BplayImpl());
        player1.play("ccc.mp3");
    }
}
