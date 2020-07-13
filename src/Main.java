import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    /* создаются два цифровых режима, EnteringRome - римские цифры, EnteringData - арабские, числовые значения
     * от 1 до 10 определяются в конструкторах указанных классов. неоюходимости в Enum нет, но мысль первой пришла по нему
     * (static final, неизменяемые). Деление на нуль не произойдет, поскольку последнего попросту нет в значениях.
     * private fields and getters in EnteringData class, public fields in EnteringRome class*/
/* Ответы в виде вещественных чисел в случае деления, по условиям операции следующие: +, -, * и /.
Поэтому исключений для них не создано.
**/

    public class Main {
        public static void main(String[] args) throws IOException, UncorrectNumber {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();

            String []strings = str.split(" ");

            // если римские числа, то создаем объект класса RomeNumbers, который их преобразует
            if(isRomuls(strings) == 2){
                EnteringRome romeNumbers = new EnteringRome(strings[0], strings[1], strings[2]);
                switch (strings[1]){
                    case "+":
                        System.out.println(romeNumbers.romeNumberOne + romeNumbers.romeNumberTwo);
                        break;
                    case "-":
                        System.out.println(romeNumbers.romeNumberOne - romeNumbers.romeNumberTwo);
                        break;
                    case "/":               // создадим более точный ответ, в виде числа с точкой
                        double answer;
                        answer = (double) romeNumbers.romeNumberOne / (double) romeNumbers.romeNumberTwo;
                        System.out.printf("%.2f", answer);
                        break;
                    case "*":
                        System.out.println(romeNumbers.romeNumberOne * romeNumbers.romeNumberTwo);
                        break;
                }
            }
            // если арабские цифры, то их режимом управляет класс EnteringData
            else if(isNumbers(strings) == 2){
                EnteringData data = new EnteringData(strings);
                switch (strings[1]){
                    case "+":
                        System.out.println(data.getFirstDigit() + data.getSecondDigit());
                        break;
                    case "-":
                        System.out.println(data.getFirstDigit() - data.getSecondDigit());
                        break;
                    case "/":
                        double answer;     // создадим более точный ответ, в виде числа с точкой
                        answer = (double)data.getFirstDigit() / (double)data.getSecondDigit();
                        System.out.printf("%.2f",answer);
                        break;
                    case "*":
                        System.out.println(data.getFirstDigit() * data.getSecondDigit());
                        break;
                }
            }
            else throw new UncorrectNumber();
        }

        // метод проверки на арабские цифры, если правильно, вернет число 2
        public static int isNumbers(String[] strings){
            String[]numbers = new String[]{"1","2","3","4","5","6","7","8","9","10"};
            int isDigit = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (strings[0].equals(numbers[i])){
                    isDigit++;
                }
                if(strings[2].equals(numbers[i])){
                    isDigit++;
                }
            }
            return isDigit;
        }
        //метод проверки на римские цифры, если правильно, то вернет число 2
        public static int isRomuls(String[]strings){
            String[]romuls = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
            int isRomul = 0;
            for (int i = 0; i < romuls.length; i++) {
                if(strings[0].equals(romuls[i])){
                    isRomul++;
                }
                if(strings[2].equals(romuls[i])){
                    isRomul++;
                }
            }
            return isRomul;
    }
}
