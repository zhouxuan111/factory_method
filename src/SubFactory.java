/**
 * 减法工厂
 * @author xuanzhou
 * @date 2020/6/23 10:47
 */
public class SubFactory extends OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
