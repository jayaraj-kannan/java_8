import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNthHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> mapValue = new HashMap<>();
        mapValue.put("emp1", 150000);
        mapValue.put("emp3", 50000);
        mapValue.put("emp15", 250000);
        mapValue.put("emp6", 350000);
        mapValue.put("emp7", 150000);
        mapValue.put("emp2", 250000);
        mapValue.put("emp9", 150000);
        mapValue.put("emp11", 80000);
        mapValue.put("emp31", 15000);
        mapValue.put("emp16", 15000);
        mapValue.put("emp21", 50000);
        mapValue.put("emp65", 15000);
        mapValue.put("emp19", 15000);
        mapValue.put("emp41", 50000);
        mapValue.put("emp23", 15000);
        mapValue.put("emp52", 80000);
        System.out.println(getResult(53, mapValue));

    }

    private static Map.Entry<Integer, java.util.List<String>> getResult(int num, Map<String, Integer> mapValue) {
        try {
            return mapValue.entrySet().stream()
                    .collect(Collectors.groupingBy(Map.Entry::getValue,
                            Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                    )).entrySet().stream()
                    .sorted(Collections
                            .reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num - 1);
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }

        return null;
    }

}
