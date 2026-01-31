package KlassWork;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    class Person {
        String name;
        int age;
        boolean isMan;

        public Person(String name, int age, boolean isMan) {
            this.name = name;
            this.isMan = isMan;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + isMan;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && isMan == person.isMan && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, isMan);
        }
    }

    public class Main {


//    public static Optional<String> getData() {
//        String result = "Abdullayev";
//        return Optional.ofNullable(result);
//    }

        public static void main(String[] args) {


            /// ///////////////////////////////////////////////////////////////////////////////////////////
            /// ///////////////////////////////////////////////////////////////////////////////////////////
            //          //Терминальные методы
            /// ///////////////////////////////////////////////////////////////////////////////////////////
            /// forEach,collect,toArray,toList,reduce,min,max,
            ///  anyMatch       -> true ( esli podxodit xotyabi odin element)
            ///  allMatch       -> true ( vse podxodyat )
            ///  noneMatch      -> true ( nikto ne podxodit )
            ///  findFirst,findAny,sum,average,summaryStatistics
            /// ///////////////////////////////////////////////////////////////////////////////////////////


            Scanner sc = new Scanner(System.in);
            List<String> list = new ArrayList<>();

            int totalMovies = 123;
            for (int i = 1; i <= totalMovies; i++) {
                list.add("Movie #"+i);
            }

            int view = 10; // skolko filmov na 1 stranicu
            int page = 5;  // kakaya stranica
            int pageSize = 10; // skolko filmov na 1 stranicu

            do {
                sc = new Scanner(System.in);
                for(int i = 1; i <= pageSize; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();  // Otobrazitsa vozmojnie stranici
                page = sc.nextInt();
                //choice

//            list.stream().limit(10).forEach(System.out::println); // pecataet pravilniy diapazon

                //
            }while(true);



//        Optional<String> result = getData();
//
//        if (result.isPresent()) {
//            System.out.println(result.get().length());
//        }


//        List<Integer> list = Arrays.asList(2, 2, 32, 48, 80);
//
//        IntSummaryStatistics result = list.stream().mapToInt(x->x).summaryStatistics();
//
//        System.out.println("Count    : " + result.getCount());
//        System.out.println("Sum      : " + result.getSum());
//        System.out.println("Min      : " + result.getMin());
//        System.out.println("Max      : " + result.getMax());
//        System.out.println("Average  : " + result.getAverage());
//        System.out.println(result.getAsDouble());


//        list.stream().parallel().findAny();
//        System.out.println(result.get());


//        List<Integer> list = Arrays.asList(2, 2, 32, 42, 50);
//
//        boolean result = list.stream().anyMatch(x -> x % 2 == 0);
//        result = list.stream().allMatch(x -> x % 2 == 0);
//        result = list.stream().noneMatch(x -> x % 2 != 0);
//        System.out.println(result);


//        Long result = list.stream().count();
//        System.out.println(result);
//        list.stream().reduce((a,b) -> a+b).ifPresent(System.out::println);
//        list.stream().reduce((a,b) -> a+b).ifPresent(System.out::println);
//       Optional<Integer> result = list.stream().min(Integer::compareTo);
//         result = list.stream().max(Integer::compareTo);
//       if (result.isPresent()) {
//           System.out.println(result.get());
//       }


//        list.forEach(x -> System.out.println(x));
//        list =  list.stream().sorted().collect(Collectors.toList());
//        list =  list.stream().sorted().toList();
//        Object[] arr =  list.stream().sorted().toArray();


//       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1);


            //StreamApi


//        Stream<String> stream = Stream.of("Hello", "World");
//        stream.forEach(System.out::println);


//        String[] arr = {"a1","a2","a3"};
//        Stream<String> stream = Arrays.stream(arr);
//        stream.forEach(System.out::println);


//        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
//        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);
//        stream.forEach(x->{
//            System.out.println(x);
//        });


//        Stream<Object> stream = Stream.builder().add("a1").add("a2").add("a3").build();
//        stream.forEach(System.out::println);


//        StreamApi
            //Promejutocnie operacii -> return Stream
            //Terminalnie operacii   -> zaversayut i return result


            /// ///////////////////////////////////////////////////////////////////////////////////////////
            /// ///////////////////////////////////////////////////////////////////////////////////////////
            //          //Promejutocnie operacii -> return Stream
            /// ///////////////////////////////////////////////////////////////////////////////////////////
            //filter,map,mapToInt,mapToDouble,mapToLong,sorted,distinct,limit,skip,peek,
            //flatMap,flatMapToInt,flatMapToLong,flatMapToDouble,takeWhile,dropWhile
            /// ///////////////////////////////////////////////////////////////////////////////////////////

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
////        numbers.stream().takeWhile(n-> n<4).forEach(System.out::println);
//        numbers = numbers.stream().dropWhile(n-> n<4).toList();
//
//
//        System.out.println(numbers.size());
//
//        List<String> list = Arrays.asList("Hello", "World", "Abdullayev");
//        list.stream().flatMap(word-> Arrays.stream(word.split(""))).forEach(System.out::println);


//        List<String> list = new ArrayList<>();
//        list.add("a1");
//        list.add("a1");
//        list.add("a1");
//        list.add("a1");
//        list.add("a1");
//        list.add("a1");
//        list.add("a2");
//        list.add("a3");
//        list.add("a3");
//        list.add("a3");
//        list.add("a3");
//        list.add("a3");
//        list.add("a4");
//        list.add("a5");
//        list.add("a6");
//        list.add("a6");
//        list.add("a6");
//        list.add("a6");
//        list.add("a6");
//        list.add("a6");
//        list.add("a6");
//        list.add("a6");
//        list.add("a7");
//        list.add("a8");
//        list.add("a9");
//        list.add("a9");
//        list.add("a9");
//        list.add("a9");


//        list
//                .stream()
//                .distinct()
//                .sorted()
//                .skip(3)
//                .limit(5)
//                .filter(x -> x.startsWith("a"))
//                .forEach(x-> System.out.println(x));


//       list.stream()
//               .peek(x -> System.out.println("Hello : " + x))
//               .filter(x->x.length()>1)
//               .peek(x -> System.out.println("Farid : " + x))
//               .filter(x->x.length()>1)
//               .peek(x -> System.out.println("Bye : " + x))
//               .collect(Collectors.toList());


//        list = list.stream().skip(5).limit(2).collect(Collectors.toList());

//        for (String str : list) {
//               System.out.print(str + " ");
//        }

//        list = list.stream().distinct().collect(Collectors.toList());

//
//
//        list = list.stream().sorted().collect(Collectors.toList());
//
//
//        for (String str : list) {
//            System.out.print(str + " ");
//        }


//aFarid4
//Farid2
//Farid1

//        List<Person> list = new ArrayList<>();
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Farid", 26,true));
//        list.add(new Person("Dima", 57,true));
//        list.add(new Person("Pawa", 41,true));
//        list.add(new Person("Pawa", 41,true));
//        list.add(new Person("Pawa", 41,true));
//        list.add(new Person("Pawa", 41,true));
//        list.add(new Person("Pawa", 41,true));
//        list.add(new Person("Pawa", 41,true));
//        list.add(new Person("Mawa", 36,false));
//        list.add(new Person("Olqa", 42,false));
//        list.add(new Person("Olqa", 42,false));
//        list.add(new Person("Olqa", 42,false));
//        list.add(new Person("Olqa", 42,false));
//        list.add(new Person("Olqa", 42,false));
//        list.add(new Person("Olqa", 42,false));
//        list.add(new Person("Dawa", 12,false));
//        list.add(new Person("Oleq", 20,true));


//        list =  list.stream().distinct().collect(Collectors.toList());
////        list = list.stream().sorted((x,y)->x.name.compareTo(y.name)).collect(Collectors.toList());
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) + " ");
//        }


            //filter
//        list = list.stream().filter(x -> x.isMan==true).collect(Collectors.toList());
//        list = list.stream().filter(x -> !x.isMan).collect(Collectors.toList());
//        list = list.stream().filter(x -> (x.age < 30 && x.isMan) || (!x.isMan && x.age > 30)).collect(Collectors.toList());


            //map
//        list = list.stream().map(x -> {
//
//            x.age+=1;
//            x.name = x.isMan ? "Mr. " + x.name : "Miss " + x.name;
////            if(x.isMan) {
////                x.name = "Mr. " + x.name ;
////            }else{
////                x.name = "Miss " + x.name;
////            }
//
//            return x;
//        }).collect(Collectors.toList());


//        int[] ages  = list.stream().mapToInt(x -> x.age).toArray();


//        for (int i = 0; i < list.size(); i++) {
////            System.out.println(list.get(i) + " ");
////            System.out.println(ages[i]);
//        }


        }

    }

