package Bridge.Display;

// 기능 클래스 계층
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for(int i = 0; i< times; i++){   	// times회 반복해서 표시한다
            print();
        }
        close();
    }

}