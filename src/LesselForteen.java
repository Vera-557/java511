public class LesselForteen {
    //Реализация методов строк
    public class HomeWork {
        public static void main(String[] args) {
            String name = "Farid";
            String nameWithSpace = "      Farid     ";
            int index = 2;
            char [] symbol = name.toCharArray();
            char [] symbolWithSpace = nameWithSpace.toCharArray();
            String word = "Salamandra";
            char [] symbolWord = word.toCharArray();
            char letter = 'a';
            System.out.println("Создадим свою реализацию стандартных методов String");
            System.out.print("Метод print: распечатаем наш массив, как слово: ");
            print(symbol);
            System.out.println("Метод length: длинна строки = " + length(symbol));
            System.out.println("Метод charAt: индекс = " + index + ", символ = " + charAt(symbol, index));
            System.out.print("Метод trim: изначальная строка = ");
            print(symbolWithSpace);
            System.out.print("Строка с примененным методом = ");
            print(trim(symbolWithSpace));
            System.out.print("Метод lTrim: Строка с примененным методом = ");
            print(lTrim(symbolWithSpace));
            System.out.print("Метод rTrim: Строка с примененным методом = ");
            print(rTrim(symbolWithSpace));
            System.out.print("Метод toLowerCase: ");
            print(toLowerCase(symbol));
            System.out.print("Метод toUpperCase: ");
            print(toUpperCase(symbol));
            System.out.println("Метод indexOf: символ = " + letter + ", его индекс = " + indexOf(symbolWord, letter));
            System.out.println("Метод lastIndexOf: символ = " + letter + ", его индекс = " + lastIndexOf(symbolWord, letter));
        }
//     +   length            public static int length( char[] str)
//     +   charAt            public static char charAt( char[] str,int index)
//     +   toLowerCase       public static char[] toLowerCase( char[] str)
//     +   toUpperCase       public static char[] toUpperCase( char[] str)
//     +   trim              public static char[] trim(char[] str)
//     +   lTrim             public static char[] lTrim(char[] str)   (arr size maybe change)
//     +   rTrim             public static char[] rTrim(char[] str)   (arr size maybe change)
//     +   print             public static void print(char[] arr)
//     -   indexOf           public static int indexOf(char[] arr,char symb)
//     -   lastIndexOf       public static int lastIndexOf(char[] arr,char symb)


        //Метод length возвращает нам количество символов в строке
        public static int length(char[] str) {
            int count = 0;
            for (int i = 0; i < str.length; i++) {
                count++;
            }
            return count;
        }

        // Метод charAt возвращает символ по указанному индексу
        public static char charAt(char[] str, int index) {
            if (index < 0 || index >= str.length) {
                return 0;
            }
            return str[index];
        }
        //Метод print распечатывает массив, как строку
        public static void print (char [] str) {
            for (int i = 0; i < str.length; i ++){
                System.out.print(str[i]);
            }
            System.out.println();
        }
        //Метод trim удаляет пробелы сначала и с конца строки
        public static char[] trim(char [] str){
            int leftCount = 0, rightCount = 0;
            for (int i = 0; i < str.length; i++){
                if (str[i] == ' '){
                    leftCount++;
                }else break;
            }
            for (int i = str.length - 1; i >= 0; i --){
                if (str[i] == ' '){
                    rightCount++;
                }else {
                    break;
                }
            }
            char [] result = new char[str.length - (leftCount + rightCount)];
            for (int i = leftCount, j = 0; i < str.length - rightCount; i ++, j++){
                result[j] = str[i];
            }
            return result;
        }
        //Метод lTrim удаляет пробелы сначала строки
        public static char[] lTrim(char[] str){
            int leftCount = 0;
            for (int i = 0; i < str.length; i++){
                if (str[i] == ' '){
                    leftCount++;
                }else break;
            }
            char [] result = new char[str.length - leftCount];
            for (int i = leftCount, j = 0; i < str.length; i ++, j++){
                result[j] = str[i];
            }
            return result;
        }
        //Метод rTrim удаляет пробелы с конца строки
        public static char[] rTrim(char[] str) {
            int rightCount = 0;
            for (int i = str.length - 1; i >= 0; i--) {
                if (str[i] == ' ') {
                    rightCount++;
                } else {
                    break;
                }
            }
            char[] result = new char[str.length - rightCount];
            for (int i = 0, j = 0; i < str.length - rightCount; i++, j++) {
                result[j] = str[i];
            }
            return result;
        }
        //Метод toLowerCase переводит все буквы в нижний регистр
        public static char[] toLowerCase( char[] str){
            for (int i = 0; i < str.length; i++){
                if (str[i] >= 'A' && str[i] <= 'Z') {
                    str[i] += 32;
                }
            }
            return str;
        }
        //Метод toUpperCase переводит все буквы в нижний регистр
        public static char[] toUpperCase( char[] str){
            for (int i = 0; i < str.length; i ++){
                if (str[i] >= 'a' && str[i] <= 'z') {
                    str[i] -= 32;
                }
            }
            return str;
        }
        //Метод indexOf возвращает индекс указанного символа (поиск с лева на права ) иначе -1
        public static int indexOf(char[] arr,char symb){
            for (int i = 0; i < arr.length; i ++){
                if (arr[i] == symb){
                    return i;
                }
            }
            return -1;
        }
        //Метод lastIndexOf возвращает индекс указанного символа (поиск справа налево) иначе -1
        public static int lastIndexOf(char[] arr,char symb){
            for (int i = arr.length; i > 0; i --){
                if (arr[i - 1] == symb){
                    return i;
                }
            }
            return -1;
        }
    }

}
