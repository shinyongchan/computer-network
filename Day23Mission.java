// Day23Mission01
import java.util.List;
import java.util.stream.Stream;

public class Day23Mission {
    public static void main(String[] args) {
        List <String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        Stream <String> n = names.stream();
        n.filter(s -> s.charAt(0) < '이').forEach(s -> System.out.print(s+" "));
        System.out.println();
        n = names.stream();
        n.sorted().forEach(s -> System.out.print(s+" "));
        System.out.println();
        n = names.stream();
        System.out.println(n.findFirst());
        n = names.stream();
        System.out.println(n.findFirst().get());
        n = names.stream();
        System.out.println(n.count());
    }
}
