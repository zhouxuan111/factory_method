/**
 * 测试
 * @author xuanzhou
 * @date 2020/6/23 10:48
 */
public class Test {

    public static void main(String[] args) {
        OperationFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.operate());
    }
}
