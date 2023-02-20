package home1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // 1. Перебать параметры запуска приложения
        // Java путь к нашему классу - параметры
        // Расспарсить текст и вытащить все числа и сложить


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры:");
        String textParam = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d[0-9]+\\d");
        Matcher matcher = pattern.matcher(textParam);
        while (matcher.find()) {
            System.out.println("Найдено от " + matcher.start() + " до " + (matcher.end()-1));
        }
    }
}