package cn.com.jake.abstractFactory;

/**
 * @Classname FactoryA
 * @Description TODO
 * @Date 19-2-1 下午5:01
 * @Created by yujuan
 */
public class FactoryA extends Factory {
    @Override
    public AbstractProduct manuFactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct manuFactureMould() {
        return new MouldProductA();
    }
}
