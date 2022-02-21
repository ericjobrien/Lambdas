import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<String> name = new ArrayList<>();
        name.add("tyler ruperti");
        name.add("prakash");
        name.add("tyler seufert");
        name.add("shawntaria");
        name.add("max");

        name.forEach(str -> System.out.println(str));
        name.forEach(str -> System.out.println(str.toUpperCase()));

        List<String> everyoneUppercase = name.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        List<String> onlyTylers = name.stream().filter(str -> str.contains("tyler")).collect(Collectors.toList());


        System.out.println(everyoneUppercase.toString());
        System.out.println(onlyTylers.toString());

    }


}
