package cn.com.jake.abstractFactory;

/**
 * @Classname FactoryB
 *
 * @Description TODO
 * @Date 19-2-1 下午5:01
 * @Created by yujuan
 */
public class FactoryB extends Factory {
    @Override
    public AbstractProduct manuFactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct manuFactureMould() {
        return new MouldProductB();
    }
}
