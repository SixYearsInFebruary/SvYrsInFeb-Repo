package tianli.dang;

/**
 * Created by dangtianli on 15/5/29.
 */
public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        Test test = new Test(data);
        test.getData().setFlag(true);
        test.getData().setNumber(10);
        System.out.println("flag = " + test.getData().isFlag());
        System.out.println("number = " + test.getData().getNumber());
        System.out.println();
        data.show();
        System.out.println();
        test.show();
        System.out.println();

        test.setData(new Data());
        test.show();
        System.out.println();

    }
}
