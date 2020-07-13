public enum RomeNumbers {
    //Enum - связан с классом, отвечающим за римские цифры
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10);

    private int digit;

    RomeNumbers(int digit) {
        this.digit = digit;
    }
    //метод для возврата арабских цифр
    public int getDigit() {
        return digit;
    }
}
