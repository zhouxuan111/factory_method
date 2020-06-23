/**
 * 加法工厂
 * @author xuanzhou
 * @date 2020/6/23 10:46
 */
public class AddFactory extends OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
