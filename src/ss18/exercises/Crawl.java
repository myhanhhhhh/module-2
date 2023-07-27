package ss18.exercises;

import ss18.exercises.Crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawl {
    private static final String REGEX_NEWS = "<a href=\"(.*?)\">(.*?)</a>";

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://dantri.com.vn/the-gioi.htm");

        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        content = content.replaceAll("\\n+", ",");
        Pattern pattern = Pattern.compile(REGEX_NEWS);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}