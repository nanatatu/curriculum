import java.util.ResourceBundle;
 
public class ResourceMain {
 
 public static void main(String args[]) {
 ResourceBundle bundle = ResourceBundle.getBundle("test");	//プロパティファイル名
 String value = bundle.getString("name");	//任意のキー
 System.out.println(value);
 }
}