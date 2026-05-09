import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTokenSystem {
    public static void main(String[] args) {
        Queue<Patient> patients = new PriorityQueue<>();

        patients.add(new Patient(1, "Rahul", "normal"));
        patients.add(new Patient(2, "Anita", "emergency"));
        patients.add(new Patient(3, "Vikram", "normal"));
        patients.add(new Patient(4, "Sita", "emergency"));
        patients.add(new Patient(5, "Aman", "normal"));
        System.out.println("Treatment Order by priority: ");
        while (!patients.isEmpty()) {
            Patient p = patients.poll();
            System.out.println(p);
        }
    }
}

class Patient{
    int id;
    String name;
    String status;

    public Patient(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}

class patientComparator implements Comparator<Patient>{

    @Override
    public int compare(Patient o1, Patient o2) {
        if (o1.status.equalsIgnoreCase("emergency") &&
                o2.status.equalsIgnoreCase("normal")) {
            return -1;
        }

        if (o1.status.equalsIgnoreCase("normal") &&
                o2.status.equalsIgnoreCase("emergency")) {
            return 1;
        }

        // If both have same status, maintain FIFO by ID
        return Integer.compare(o1.id, o2.id);
    }
}



