package ss18.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[ACP]\\d{4}[GHIK]$";

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static String[] validateClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] inValidateClassName = new String[]{"M0318G", "P0323A"};


    public static void main(String[] args) {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
        ClassName classNameExample = new ClassName();
        for (String className : validateClassName) {
            boolean validate = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is valid " + validate);
        }
        for (String className : inValidateClassName) {
            boolean invalidate = classNameExample.validate(className);
            System.out.println("Class name is " + className + " is invalid " + invalidate);
        }
    }
}
