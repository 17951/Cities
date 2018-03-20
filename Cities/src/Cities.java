import java.util.ArrayList;
import java.util.Collection;
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

	public Collection<String> provinces() {
		return provinces.keySet();
	}

	public List<String> cities(String province) {
		return provinces.get(province);

	}

	public Map<String, String> provinceWithOneCity() {
		 Map<String,String> map = new HashMap();
		for(String  key:provinces.keySet()) {
			List<String> list=provinces.get(key);
			String city=list.get(0);
			map.put(key, city);
			
		}
		return map;
	}

	public Collection<List<String>> cities() {
		return provinces.values();
	}

	public static void main(String[] args) {
		Cities city = new Cities();
		System.out.println(city.provinces);
		System.out.println();
		System.out.println(city.cities());

	}
}