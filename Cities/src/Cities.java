import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {
	private Map<String, List<String>> provinces = new HashMap<>();

	public Cities() {
		List<String> list1 = new ArrayList<>();
		list1.add("Malbork");
		list1.add("Gdansk");
		list1.add("Tczew");
		provinces.put("Pomorskie", list1);

		List<String> list2 = new ArrayList<>();
		list2.add("Elblag");
		list2.add("Olsztyn");
		list2.add("Wegorzewo");
		list2.add("Paslek");
		list2.add("Pisz");
		provinces.put("WarminskoMazurskie", list2);
	}
	public List<String> provinces(){
		
	}
	public List<String> cities(String province){
		
		
	}
	
	public Map<String,String> provinceWithOneCity(){
		
	}
	public Collection<String> cities(){
		
	}
	
public static void main(String[] args) {
	Cities city=new Cities();
	System.out.println(city.provinces);
	
	
}
}