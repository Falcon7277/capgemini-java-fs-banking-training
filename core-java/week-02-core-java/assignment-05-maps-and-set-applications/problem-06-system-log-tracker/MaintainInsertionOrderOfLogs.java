import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaintainInsertionOrderOfLogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> logMap = new LinkedHashMap<>();
        int n = sc.nextInt();//number of log entries
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String time = sc.next();
            logMap.put(name, time);
        }

        for (Map.Entry<String, String> entry : logMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
