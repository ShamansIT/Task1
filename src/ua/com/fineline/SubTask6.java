package ua.com.fineline;

public class SubTask6 {

    public SubTask6(){}

    public final static String strAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String LetterColumnToNumber(String letter){
        // метод визначення порядкового номера стовпця за його буквеним номером
        int number = 0, resultNumber = 0;
        int lengthLetter = letter.length();

        for (int i = 0; i < lengthLetter; i++) {
            char charIndex = letter.charAt(lengthLetter - i - 1);
            number = (strAlphabet.indexOf((int)charIndex)+1);
            number *= Math.pow(26, i);
            resultNumber += number;
        }
        return String.valueOf(resultNumber);
    }

    public String NumberToLetterColumn(int columnNumberIn){
        // метод визначення літери стовпця за його порядковим номером
        int letterIndex = 0;
        String columnLetter = "";
        String lengthNumber = String.valueOf(columnNumberIn);

        for (int i = 0; i < lengthNumber.length(); i++) {
            columnNumberIn--;
            letterIndex = ((int)columnNumberIn%26 + 1);
            columnLetter = (strAlphabet.charAt(letterIndex - 1))+columnLetter;
            columnNumberIn = (int) ((columnNumberIn - columnNumberIn % 26) / 26);
        }
        return columnLetter;
    }

    public String GetRightColumn(String letter){
        //використовуючи літеру стовпця, напишіть метод визначення номер стовпця, який розміщено праворуч від заданого.
        if (!isNumeric(letter)) {
            LetterColumnToNumber(letter);
            letter +=1;
            return NumberToLetterColumn(Integer.parseInt(letter));
        }
        else return (LetterColumnToNumber(letter)+1);
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
