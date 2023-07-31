package ss18.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String PHONE_REGEX = "^\\([8][4]\\)[-]\\([0]\\d{9}\\)$";

    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regexPhone) {
        matcher = pattern.matcher(regexPhone);
        return matcher.matches();
    }

    public static final String[] validatePhone = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidatePhone = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneNumber phonenumber = new PhoneNumber();
        for (String phone : validatePhone) {
            boolean valid = phonenumber.validate(phone);
            System.out.println("Phone is " + phone + " is validate " + valid);
        }
        for (String phone : invalidatePhone) {
            boolean invalid = phonenumber.validate(phone);
            System.out.println("Phone is " + phone + " is invalidate " + invalid);
        }
    }
}
