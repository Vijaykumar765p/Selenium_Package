import java.util.ArrayList;
import java.util.List;


public class List_Java {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		System.out.println("Total size is -> "+l.size());
		l.add("table");//0
		l.add("chair");//1
		l.add("mobile");//2
		l.add("keys");//3
		System.out.println("Total size is -> "+l.size());
		
		System.out.println(l.get(3));
		
		//List<WebElement>

	}

}
