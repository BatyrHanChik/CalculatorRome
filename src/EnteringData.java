public class EnteringData {

    //класс отвечает за арабские цифры

    private int firstDigit;
    private String action;
    private int secondDigit;

    public EnteringData(String[]strings) {
        this.firstDigit = Integer.parseInt(strings[0]);
        this.action = strings[1];
        this.secondDigit = Integer.parseInt(strings[2]);
    }

    public int getFirstDigit() {
        return firstDigit;
    }

    public int getSecondDigit() {
        return secondDigit;
    }

    public String getAction() {
        return action;
    }
}
