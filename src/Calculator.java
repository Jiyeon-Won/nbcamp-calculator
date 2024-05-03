import java.util.*;

public abstract class Calculator {
    private ArrayList<Double> list;

    public Calculator(ArrayList<Double> list) {
        this.list = list;
    }

    public void inquiryList() {
        int index = 1;
        for (double data : list) {
            System.out.println((index++) + "번째: " + data);
        }
    }

    public void removeData(int num) {
        if (!list.isEmpty()) {
            list.remove(num);
        }
    }

    public void addList(double data) {
        list.add(data);
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }
}