import com.codeclan.CountryInfo;

import java.util.HashMap;
public class HashMapCountries {
    public static void main(String[] args){
        HashMap<String, CountryInfo> countries;
        countries = new HashMap<>();
        CountryInfo uk_info = new CountryInfo("London", "Europe", 64044000);
        CountryInfo germany_info = new CountryInfo("Berlin", "Europe", 84044000);
        CountryInfo france_info = new CountryInfo("Paris", "Europe", 52044000);
        CountryInfo japan_info = new CountryInfo("Tokyo", "East Asia", 127044000);


        countries.put("UK", uk_info );
        countries.put("Germany", germany_info );
        countries.put("France", france_info);
        countries.put("Japan", japan_info);

        System.out.println(countries.get("UK").getPopulation());
    }
}
