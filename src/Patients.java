/**
 * Created by jc277099 on 23/03/15.
 */
public class Patients {
    Patient[] records;
    int current;

    public Patients(int maxSize) {
        records = new Patient[maxSize];
    }

    public void add(Patient patient) {
        records[current++] = patient;

    }

    public Patient get(int i) {
        return records[i];
    }

    public int count() {
        return current;
    }

    public boolean isFull() {
        if (records.length == current)
            return true;

        else {
            return false;
        }
    }


    public boolean isEmpty() {
        if (current == 0)
            return true;
        else {
            return false;
        }
    }

}
