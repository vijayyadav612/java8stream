package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyUsingGroupByMethod {
    public static void main(String[] args) {
        String str = "vijay kumar yadav";
        Map<String, Long> countMap = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(countMap);

    }
}
