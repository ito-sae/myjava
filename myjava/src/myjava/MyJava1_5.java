package myjava;
import java.util.HashMap;
import java.util.Map.Entry;

public class MyJava1_5 {

	public static void main(String[] args) {
		
		//課題1-5
		//キー「1から5」
		//値「りんご、いちご、みかん、バナナ、メロン」
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "りんご");
		map.put(2, "いちご");
		map.put(3, "みかん");
		map.put(4, "バナナ");
		map.put(5, "メロン");
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" " +entry.getValue());
			
		}
		
		

	}

}
