// Day23Mission02
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day23Mission {
    public static void main(String[] args) {

        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
        Stream<Integer> a = ages.stream();
        System.out.println(a.reduce((x, y) -> x + y).get());
        a = ages.stream();
        System.out.println(a.max((x, y) -> x - y).get());
        IntStream ai = ages.stream().mapToInt(i -> i.intValue());
        System.out.println(ai.average().getAsDouble());
    }
}
enum Gender {남, 여};