import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "fgfghgh123";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        int start = 0;
        while (matcher.find(start)) {
            String value = text.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            System.out.printf("Результат переведен в число = ", result);
            String result_int = String.join("", String.valueOf(result).split(""));
            int i = Integer.parseInt (result_int);
            int a = i /100;
            int b = i %100/10;
            int c = i%10;
            System.out.printf("Сумма найденных чисел", a+b+c);
            start = matcher.end();
        }
    }
}