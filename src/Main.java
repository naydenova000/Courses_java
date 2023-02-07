import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String textParam = "fgfghgh123";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(textParam);
        int start = 0;
        while (matcher.find(start)) {
            String value = textParam.substring(matcher.start(), matcher.end());
            int resultParam = Integer.parseInt(value);
            System.out.printf("Результат переведен в число = ", resultParam);
            String resultInt = String.join("", String.valueOf(resultParam).split(""));
            int i = Integer.parseInt (resultInt);
            int a = i /100;
            int b = i %100/10;
            int c = i%10;
            System.out.printf("Сумма найденных чисел", a+b+c);
            start = matcher.end();
        }
    }
}