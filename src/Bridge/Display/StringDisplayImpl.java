package Bridge.Display;

// 구현 클래스 계층
public class StringDisplayImpl extends DisplayImpl {

    private String string;			   // 표시해야 할 문자열
    private int width;				   // 바이트 단위로 계산할 문자열의 '길이'


    public StringDisplayImpl(String string) {		// 생성자에서 전달된 문자열 string을
        this.string = string;						// 필드에 기억해둔다.
        this.width = string.getBytes().length; 	    // 그리고 바이트 단위의 길이도 필드에 기억해두고 나중에 사용한다.
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");    // 앞뒤에 "|" 를 붙여서 표시한다.
    }

    @Override
    public void rawClose() {
        printLine();

    }

    private void printLine() {
        System.out.print("+");		           // 테두리의 모서리를 표현하는 "+" 마크를 표시한다.
        for (int i = 0; i < width; i++) {	   // width개의 "-"를 표시해서
            System.out.print("-");			   // 테두리 선으로 이용한다.
        }
        System.out.println("+");	           // 테두리 모서리를 표시하는 "+" 마크를 표시한다.
    }

}
