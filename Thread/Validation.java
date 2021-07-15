package Thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
  public static final Pattern EmailRegex = 
  Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
  
  public static final Pattern MobileRegex = 
  Pattern.compile("^\\d{10,11}$");

  private Validation() {}

  public static String validateEmail(String email) {
    Matcher matcher = EmailRegex.matcher(email);
    if (matcher.find()) {
      return email;
    } else {
      throw new RuntimeException("Email is not valid");
    }
  }

  public static String validateMobile(String mobile) {
    Matcher matcher = MobileRegex.matcher(mobile);
    if (matcher.find()) {
      return mobile;
    } else {
      throw new RuntimeException("Mobile is not valid. It must have 10 to 11 digits");
    }
  }

}
