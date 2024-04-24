import java.util.*;

public abstract class Calculator {
    private ArrayList<Double> list;

    public Calculator(ArrayList<Double> list) {
        this.list = list;
    }

    public void inquiryList() {
        int index = 1;
        for (double data : getList()) {
            System.out.println((index++) + "번째: " + data);
        }
    }

    public void removeFirstData() {
        list.remove(0);
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