import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main extends Person {
    public Main(String john, int i) {
        super(john, i);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));


        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);
        System.out.println(sum);


        Stream<Integer> numEven = numbers.stream()
                .filter(num -> num % 2 == 0);
        System.out.println(numEven);


        Optional<Integer> sum35 = numbers.stream()
                .map(num ->{
        if (num%3==0 && num%5==0){
            return num;
        }
        return null;
        })
                .reduce(Integer::sum);


        Optional<Integer> averageValue = numbers.stream()
                .reduce(Integer::sum)
                .map(num -> num / numbers.size());


        List<String> StartWithA = words.stream()
                .filter(el -> el.startsWith("a"))
                .map(String::toUpperCase)
                .toList();


    }
    public static Set<String> unikMore4 (List<String> str, int i){
        return str.stream()
                .filter(el -> el.length() > i)
                .collect(Collectors.toSet());
    }

//    public static List<Person> age(List<Person> list, int age){
//        return list.stream()
//                .filter(el -> el.age)
//                .sorted()
//                .toList();
//    } 

}