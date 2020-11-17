package Facade.case1;

import java.util.Arrays;

public class ComplexProduct {
    char nameChars[] = new char[10];

    public ComplexProduct() {
    }

    public void setFirstNameCharacter(char c) {
        nameChars[0] = c;
    }

    public void setSecondNameCharacter(char c) {
        nameChars[1] = c;
    }

    public void setThirdNameCharacter(char c) {
        nameChars[2] = c;
    }

    public void setFourthNameCharacter(char c) {
        nameChars[3] = c;
    }

    public void setFifthNameCharacter(char c) {
        nameChars[4] = c;
    }

    public void setSixthNameCharacter(char c) {
        nameChars[5] = c;
    }

    public void setSeventhNameCharacter(char c) {
        nameChars[6] = c;
    }

    public void setEighthNameCharacter(char c) {
        nameChars[7] = c;
    }

    public void setNinthNameCharacter(char c) {
        nameChars[8] = c;
    }

    public void setTenthNameCharacter(char c) {
        nameChars[9] = c;
    }

    public String getName() {
        return String.valueOf(nameChars);
    }
}
