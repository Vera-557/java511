package S12po16;

public class LessonFifteen {
//реализация методов строк 2 часть
// concat
// equals
// equalsIgnoreCase
// startsWith
// endsWith
// substring(int startIndex)
// substring(int startIndex,int endIndex)
public static char[] substring(char[] array, int startIndex, int endIndex) {
    if (startIndex < 0 || endIndex > array.length || startIndex > endIndex) {
        String end = "Неверные индексы!";
        return end.toCharArray();
    }
    int newSize = endIndex - startIndex;
    char[] substring = new char[newSize];
    for (int i = startIndex, j = 0; i < endIndex; i++, j++) {
        substring[j] = array[i];
    }
    return substring;
}

    public static char[] substring(char[] array, int start) {
        int newSize = array.length - start;
        char[] substring = new char[newSize];
        for (int i = start, j = 0; i < array.length; i++, j++) {
            substring[j] = array[i];
        }
        return substring;
    }

    public static char[] concat(char[] array, char[] array2) {
        int stringLength = array.length + array2.length;
        char[] buf = new char[stringLength];
        for (int i = 0; i < array.length; i++) {
            buf[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            buf[array.length + i] = array2[i];
        }
        return buf;
    }

    static boolean equalsIgnorCase(char[] str1, char[] str2) {
        if (str1.length != str2.length) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] >= 65 && str1[i] <= 90) {
                str1[i] += 32;
            }
            if (str2[i] >= 65 && str2[i] <= 90) {
                str2[i] += 32;
            }
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean equals(char[] str1, char[] str2) {
        if (str1.length != str2.length) {
            return false;
        }
        for (int i = 0; i < str1.length; i++) {

            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean startsWith(char[] array, char[] start) {
        if (start.length > array.length) {
            return false;
        }
        for (int i = 0; i < start.length; i++) {
            if (array[i] != start[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean endsWith(char[] array, char[] end) {
        if (end.length > array.length) {
            return false;
        }
        int startPosition = array.length - end.length;

        for (int i = startPosition, j = 0; i < array.length; i++, j++) {
            if (array[i] != end[j]) {
                return false;
            }
        }
        return true;
    }
    public static void print(char[] array){
        for (int i = 0 ; i < array.length; i ++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String stringOne = "Чашка чая ";
        String stringTwo = "горячая!";
        String stringForEquals = "Чашка Чая ";
        String stringForSubstringAndOthers = "Ча";
        char[] array1 = stringOne.toCharArray();
        char[] array2 = stringTwo.toCharArray();
        char[] arrayForEquals = stringForEquals.toCharArray();
        char[] forSubstringAndOthers = stringForSubstringAndOthers.toCharArray();
        System.out.println("Метод concat: " + concat(array1, array2));
        System.out.println("Метод equals: (сравним строки " + stringOne + " и "  + stringForEquals + ") : " + equals(array1, arrayForEquals));
        System.out.println("Метод equalsIgnorCase: : (сравним строки " + stringOne + " и "  + stringForEquals + ") : " + equalsIgnorCase(array1, arrayForEquals));
        System.out.println("Метод startsWith: (строка " + stringOne + ", начало = " + stringForSubstringAndOthers + ") : " + startsWith(array1, forSubstringAndOthers));
        System.out.println("Метод endsWith: (строка " + stringOne + ", конец = " + stringForSubstringAndOthers + ") : " + endsWith(array1, forSubstringAndOthers));
        System.out.println("Метод substring: строка = " + stringOne + ", индекс начала = 5");
        print(substring(array1, 5));
        System.out.println("Метод substring: строка = " + stringOne + ", индекс начала = 2, индекс конца = 5");
        print(substring(array1, 2, 5));
    }
}
