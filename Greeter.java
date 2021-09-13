import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    return messages.getString("greeting") + ", " + name;
  }

  public static void main(String[]args) {
	String[] yxr={"en","NZ","yxr"};
    String language = yxr[0];
    String country = yxr[1];
    String name = yxr[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}
