import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        CountItemsMatchingaRule obj = new CountItemsMatchingaRule();
        int result = obj.countMatches(items, ruleKey, ruleValue);
        System.out.println("Matching items count: " + result);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int key = 0; 
    int count = 0;

    switch (ruleKey) {
        case "type": key = 0; break;
        case "color": key = 1; break;
        case "name": key = 2; break;
    }

    for (List<String> item : items) {
        if (item.get(key).equals(ruleValue)) {
            count++;
        }
    }
    return count;
    }
}
