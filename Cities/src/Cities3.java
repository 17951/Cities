import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cities3 {

	private Map<String, String> countries = new HashMap();

	public Cities3() {
        countries.put("Poland", "Warsaw");
        countries.put("German", "Berlin");
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");
        countries.put("Russia", "Moscow");
        countries.put("Great Britain", "London");
    }

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.countries);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Countries other = (Countries) obj;
		if (!Objects.equals(this.countries, other.countries)) {
			return false;
		}
		return true;
	}

	public Collection<String> capitals() {
		return countries.keySet();
	}

	public Collection<String> countries() {
		return countries.values();
	}

	public Collection<String> sortedCapitals() {
		TreeSet set = new TreeSet();
		set.addAll(capitals());
		return set;
	}

	public Collection<String> sortedCountries() {
		TreeSet set = new TreeSet();
		set.addAll(countries());
		return set;
	}

	public Map<String, String> sortedByCountries() {
		TreeMap map=new TreeMap(countries);
		return map;
	}

	public Map<String, String> sortedByCapitals() {

	}

	@Override
	public String toString() {
		return countries.toString();
	}

	public static void main(String[] args) {
		Cities3 c = new Cities3();
		System.out.println(c);

		System.out.println(c.capitals());
		System.out.println(c.countries());
		System.out.println(c.sortedCapitals());
		System.out.println(c.sortedCountries());

	}

}