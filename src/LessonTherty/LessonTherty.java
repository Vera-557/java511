package LessonTherty;

import java.util.*;
import java.util.stream.Collectors;

public class LessonTherty {
    public static void main(String[] args) {
        System.out.println("Задачи на промежуточные операции Stream API");
        System.out.println("1. filter - фильтрация");
        // Дан список чисел. Найти все чётные числа.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Твоё решение:
        List<Integer> numbers2 = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        // Ожидаемый результат: [2, 4, 6, 8, 10]
        for (Integer num : numbers2){
            System.out.print(num + ", ");
        }
        System.out.println();
        // Дан список слов. Найти все слова длиной больше 4 символов.
        List<String> words = Arrays.asList("cat", "elephant", "dog", "tiger", "ant", "butterfly");
        // Твоё решение:
        List<String> words2 = words.stream().filter(n -> n.length() > 4).collect(Collectors.toList());
        Iterator <String> i = words2.iterator();
        // Ожидаемый результат: ["elephant", "tiger", "butterfly"]
        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
        System.out.println("\n2. map - преобразование");
        // Дан список чисел. Умножить каждое число на 2.
        List<Integer> numbersMultiply = Arrays.asList(1, 2, 3, 4, 5);
        // Твоё решение:
        List<Integer> numbersMultiply2 = numbersMultiply.stream().map(n -> n * 2).collect(Collectors.toList());
        // Ожидаемый результат: [2, 4, 6, 8, 10]
        for (Integer numM : numbersMultiply2){
            System.out.print(numM + " ");
        }
        System.out.println();
        // Дан список слов. Преобразовать все слова в ВЕРХНИЙ РЕГИСТР.
        List<String> wordsUp = Arrays.asList("farid", "oleg", "dawa", "dima");
        // Твоё решение:
        List<String> wordsUp2 = wordsUp.stream().map(w -> w.toUpperCase() + " ").collect(Collectors.toList());
        // Ожидаемый результат: ["FARID", "OLEG", "DAWA", "DIMA"]
        wordsUp2.forEach(System.out::print);
        System.out.println();
        System.out.println("3. mapToInt - преобразование в IntStream");
        // Дан список слов. Получить список длин каждого слова (как int[]).
        List<String> wordsInt = Arrays.asList("cat", "elephant", "dog", "tiger");
        // Твоё решение:
        List<Integer> wordsInt2 = wordsInt.stream().map(String::length).collect(Collectors.toList());//почему не получается с мап ту  инт? логичнее же?
        // Ожидаемый результат: [3, 8, 3, 5]
        System.out.println(wordsInt2);
        // Дан список чисел. Получить массив квадратов этих чисел (как int[]).
        List<Integer> numberSquares = Arrays.asList(1, 2, 3, 4, 5);
        // Твоё решение:
        int [] squares = numberSquares.stream().mapToInt(n -> n * n).toArray();
        System.out.println(Arrays.toString(squares));
        // Ожидаемый результат: [1, 4, 9, 16, 25]
        System.out.println("4. sorted - сортировка");
        // Дан список чисел. Отсортировать их по возрастанию.
        List<Integer> numbersSort = Arrays.asList(5, 2, 8, 1, 9, 3);
        // Твоё решение:
        List<Integer> numbersSort2 = numbersSort.stream().sorted().toList();//можно не указывать ничего дополнительно, он в естественном порядке сам все сделает
        // Ожидаемый результат: [1, 2, 3, 5, 8, 9]
        System.out.println(numbersSort2);
        // Дан список слов. Отсортировать их по длине (от короткого к длинному).
        List<String> wordsLength = Arrays.asList("elephant", "cat", "dog", "butterfly", "ant");
        // Твоё решение:
        List<String> wordsLength2 = wordsLength.stream().sorted(Comparator.comparing(w -> w.length())).toList();
        // Ожидаемый результат: ["cat", "dog", "ant", "elephant", "butterfly"]
        System.out.println(wordsLength2);
        System.out.println("5. distinct - удаление дубликатов");
        // Дан список чисел с дубликатами. Оставить только уникальные.
        List<Integer> numbersUnicum = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
        // Твоё решение:
        Set<Integer> numbersUnicum2 = numbersUnicum.stream().collect(Collectors.toSet());
        // Ожидаемый результат: [1, 2, 3, 4, 5]
        System.out.println(numbersUnicum2);
        // Дан список слов с повторениями. Оставить только уникальные слова.
        List<String> wordsUnic = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");
        // Твоё решение:
        Set<String> wordsUnic2 = wordsUnic.stream().collect(Collectors.toSet());
        // Ожидаемый результат: ["apple", "banana", "orange", "kiwi"]
        System.out.println(wordsUnic2);
        System.out.println("6. limit - ограничение количества");
        // Дан список чисел. Взять только первые 3 элемента.
        List<Integer> numbersOnly3 = Arrays.asList(10, 20, 30, 40, 50, 60);
        // Твоё решение:
        List<Integer> numbersOnly32 = numbersOnly3.stream().limit(3).toList();
        // Ожидаемый результат: [10, 20, 30]
        System.out.println(numbersOnly32);
        // Дан список слов. Взять только первые 4 слова.
        List<String> wordsOnly4 = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
        // Твоё решение:
        List<String> wordsOnly42 = wordsOnly4.stream().limit(4).toList();
        // Ожидаемый результат: ["one", "two", "three", "four"]
        System.out.println(wordsOnly42);
        System.out.println("7. skip - пропуск элементов");
        // Дан список чисел. Пропустить первые 2 элемента, взять остальные.
        List<Integer> numbersSkip = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Твоё решение:
        List<Integer> numbersSkip2 = numbersSkip.stream().skip(2).toList();
        // Ожидаемый результат: [3, 4, 5, 6]
        System.out.println(numbersSkip2);
        // Дан список слов. Пропустить первые 3 слова, взять остальные.
        List<String> wordsSkip = Arrays.asList("a", "b", "c", "d", "e", "f");
        // Твоё решение:
        List<String> wordsSkip2 = wordsSkip.stream().skip(3).toList();
        // Ожидаемый результат: ["d", "e", "f"]
        System.out.println(wordsSkip2);
        System.out.println("8. peek - промежуточный просмотр");
        // Дан список чисел. Вывести каждое число в консоль ПЕРЕД фильтрацией (оставить только чётные).
        List<Integer> numbersSkape = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Твоё решение:
        List<Integer> numbersSkape2 = numbersSkape.stream()
                .peek(n -> System.out.println(n))
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("И список: " + numbersSkape2);
        // Использовать peek для вывода, затем filter для чётных
        // Ожидаемый результат в консоли:
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
        // И список: [2, 4, 6]
        // Дан список слов. Преобразовать в ВЕРХНИЙ РЕГИСТР и вывести каждое слово в консоль.
        List<String> wordsUpTwo = Arrays.asList("hello", "world", "java");
        // Твоё решение:
        List<String> wordsUpTwo2 = wordsUpTwo.stream().map(w->w.toUpperCase())
                .peek(w-> System.out.println())
                .toList();
        System.out.println(wordsUpTwo2);//ужас, пока допишешь, с ума сойдешь....
        // Использовать map для преобразования, затем peek для вывода
        // Ожидаемый результат в консоли:
        // HELLO
        // WORLD
        // JAVA
        // И список: ["HELLO", "WORLD", "JAVA"]
        System.out.println("9. takeWhile - брать пока условие TRUE");
        // Дан список чисел. Взять элементы пока они меньше 5.
        List<Integer> numbersMin5 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1);
        // Твоё решение:
        List<Integer> numbersMin52 = numbersMin5.stream()
                .takeWhile(n -> n < 5)
                .toList();
        // Ожидаемый результат: [1, 2, 3, 4] (остановился на 5)
        System.out.println(numbersMin52);
        // Дан список слов. Брать слова пока их длина <= 4 символов.
        List<String> wordsMin4 = Arrays.asList("cat", "dog", "bird", "elephant", "ant", "cow");
        // Твоё решение:
        List<String> wordsMin42t = wordsMin4.stream()
                .takeWhile(word -> word.length() <= 4)
                .toList();
        // Ожидаемый результат: ["cat", "dog", "bird"] (остановился на "elephant")
        System.out.println(wordsMin42t);
        System.out.println("10. dropWhile - пропускать пока условие TRUE");
        // Дан список чисел. Пропускать элементы пока они меньше 5, затем взять все остальные.
        List<Integer> numbersSkipTo3 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1);
        // Твоё решение:
        List<Integer> numbersSkipTo32 = numbersSkipTo3.stream()
                .dropWhile(n -> n < 5)
                .toList();
        // Ожидаемый результат: [5, 6, 2, 1] (начал брать с 5)
        System.out.println(numbersSkipTo32);
        // Дан список слов. Пропускать слова пока их длина <= 3, затем взять все остальные.
        List<String> wordsDrop = Arrays.asList("cat", "dog", "ant", "elephant", "cow", "bird");
        // Твоё решение:
        List<String> wordsDrop2 = wordsDrop.stream().dropWhile(w->w.length()<=3).toList();
        // Ожидаемый результат: ["elephant", "cow", "bird"] (начал брать с "elephant")
        System.out.println(wordsDrop2);
    }
}
