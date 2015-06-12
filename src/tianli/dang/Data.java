package tianli.dang;

/**
 * Created by dangtianli on 15/5/29.
 */
public class Data {
    private boolean flag = false;
    private int number = 0;
    public Data() {
        System.out.println("flag = " + this.flag);
        System.out.println("number = " + this.number);
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void show() {
        System.out.println("flag = " + this.flag);
        System.out.println("number = " + this.number);
    }
}
