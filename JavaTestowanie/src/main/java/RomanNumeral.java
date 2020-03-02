import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeral {
    private int num;
    private TreeMap<Integer, String> Roman;
    public RomanNumeral(int num){
    
        this.num = num;
    
        Roman = new TreeMap<Integer, String>(Collections.reverseOrder());
    
        Roman.put(1000, "M");
        Roman.put(900, "CM");
        Roman.put(500, "D");
        Roman.put(400, "CD");
        Roman.put(100, "C");
        Roman.put(90, "XC");
        Roman.put(50, "L");
        Roman.put(40, "XL");
        Roman.put(10, "X");
        Roman.put(9, "IX");
        Roman.put(5, "V");
        Roman.put(4, "IV");
        Roman.put(1, "I");
    
    }
    
    public String getRomanNumeral(){
        int val = num;
        String romanVal = "";
        for (Map.Entry<Integer, String> entry: Roman.entrySet()) {
            while (val >= entry.getKey()){
                romanVal += entry.getValue();
                val -= entry.getKey();
            }


        }
        return romanVal;
        
        
    }
    
    

}
