/**
 * 运算抽象类
 * @author xuanzhou
 * @date 2020/6/23 10:40
 */
public abstract class Operation {

    public double numberA;

    public double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 实现运算，返回运算结果
     * @return
     */
    public abstract double operate();
}
