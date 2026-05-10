import java.util.Map;
import java.util.TreeMap;

public class CityTemperatureReport {
    public static void main(String[] args) {
        //Storing city temperatures
        TreeMap<String, Integer> cityTempMap = new TreeMap<>();
        cityTempMap.put("Nagpur", 38);
        cityTempMap.put("Mumbai", 34);
        cityTempMap.put("Delhi", 40);
        cityTempMap.put("Pune", 33);
        cityTempMap.put("Chennai", 36);

        //Displaying a sorted report
        System.out.println("City Temperature Report: ");
        for (Map.Entry<String, Integer> entry : cityTempMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "°C");
        }

        //Finding highest and lowest temperature cities
        String hottestCity = null;
        String coldestCity = null;
        int maxE = Integer.MIN_VALUE;
        int minE = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : cityTempMap.entrySet()) {
            int temp = entry.getValue();
            if (temp > maxE) {
                maxE = temp;
                hottestCity = entry.getKey();
            }

            if (temp < minE) {
                minE = temp;
                coldestCity = entry.getKey();
            }
        }

        System.out.println("\nHottest City: " + hottestCity + " (" + maxE + "°C)");
        System.out.println("Coldest City: " + coldestCity + " (" + minE + "°C)");    }
}
