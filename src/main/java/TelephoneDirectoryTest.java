import java.util.*;

public class TelephoneDirectoryTest {
    public class TelephoneDirectory {
        public static void main(String[] args) {
            Testset();
            TelephoneDirectoryTest();
        }

        private static void Testset() {
            Set<String> set = new TreeSet<>();
            Collections.addAll(set, "fff" ,"fdf", "vvv", "ccc", "fvf", "fff", "fdf", "wrw", "ccc", "ghg", "fgq");
            System.out.println(set);
        }

        private static void TelephoneDirectoryTest() {
            Map<String, Integer> map = new TreeMap<>();
            map.put("Egor", 89023203);
            map.put("Dima", 23243453);
            map.put("Vova", 23233234);
            map.put("Sveta", 23233232);
            map.put("Olya", 25665656);
            map.put("Igor", 9596959);
            map.put("Dima", 23556655);
            map.put("Vanya", 23676554);
            map.put("Anna", 56565464);
            map.put("Toma", 56565656);
            map.put("Sveta", 9600600);
            System.out.println(map);
        };
    }
}
