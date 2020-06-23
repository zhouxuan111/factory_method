/**
 * 除法工厂
 * @author xuanzhou
 * @date 2020/6/23 10:48
 */
public class DivFactory extends OperationFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
