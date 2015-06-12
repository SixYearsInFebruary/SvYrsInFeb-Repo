package tianli.dang;

/**
 * Created by dangtianli on 15/5/29.
 */
public class Test {
    private Data data;
    public Test(Data data) {
        System.out.println("flag = " + data.isFlag());
        System.out.println("number = " + data.getNumber());
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void show() {
        System.out.println("flag = " + data.isFlag());
        System.out.println("number = " + data.getNumber());
    }
}
