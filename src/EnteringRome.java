public class EnteringRome {
    // класс, отвечающий за римские цифры
    int romeNumberOne;
    String action;
    int romeNumberTwo;

    //значения в конструкторе инициализируются при помощи метода getDigits
    public EnteringRome(String romeNumberOne, String action, String romeNumberTwo) {
        if(getDigits(romeNumberOne) != 0){
            this.romeNumberOne = getDigits(romeNumberOne);}
        this.action = action;
        if(getDigits(romeNumberTwo) != 0){
            this.romeNumberTwo = getDigits(romeNumberTwo);}
    }
    //метод проверки и замены цифр
    public int getDigits(String str){
        switch (str){
            case "I": return RomeNumbers.I.getDigit();
            case "II": return RomeNumbers.II.getDigit();
            case "III": return RomeNumbers.III.getDigit();
            case "IV": return RomeNumbers.IV.getDigit();
            case "V": return RomeNumbers.V.getDigit();
            case "VI": return RomeNumbers.VI.getDigit();
            case "VII": return RomeNumbers.VII.getDigit();
            case "VIII": return RomeNumbers.VIII.getDigit();
            case "IX": return RomeNumbers.IX.getDigit();
            case "X": return RomeNumbers.X.getDigit();
        }
        return 0;
    }

}
