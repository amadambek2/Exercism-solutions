import java.util.Map;
import java.util.HashMap;


public class DialingCodes {
    private Map<Integer, String> dialingCodes;

    public DialingCodes(){
        dialingCodes = new HashMap<>();
    }

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(dialingCodes.containsKey(code) || dialingCodes.containsValue(country)){
            return;
        }
        dialingCodes.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry:dialingCodes.entrySet()){
            if(entry.getValue().equals(country)){
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) { 
        dialingCodes.entrySet().removeIf(entry -> entry.getValue().equals(country));
        dialingCodes.put(code,country);    
    }
}
