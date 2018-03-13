import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Countries {
	private Map<String, String> countries = new HashMap<>();

	public Countries() {
		countries.put("Poland", "Warsaw");
		countries.put("German", "Berlin");
		countries.put("Russia", "Moscow");
		countries.put("Russia", "Moscow");
		countries.put("Great Britain", "London");
		countries.put("France", "Paris");
		countries.put("Spain", "Madrid");
	}

	@Override
	public String toString() {
		return countries.toString();
	}

	public Collection<String> countries() {
		return countries.keySet();
	}

	public Collection<String> capitals() {
		return countries.values();
	}

	public static void main(String[] args) {
		Countries c = new Countries();
		System.out.println(c);
		Collection<String> country=c.countries();
		Collection<String> capital=c.capitals();
		System.out.println(country.toString());
		System.out.println(capital.toString());

	}
}
