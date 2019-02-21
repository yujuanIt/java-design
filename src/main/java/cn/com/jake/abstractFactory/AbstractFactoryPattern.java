package cn.com.jake.abstractFactory;

/**
 * @Classname AbstractFactoryPattern
 * @Description TODO
 * @Date 19-2-1 下午5:07
 * @Created by yujuan
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.manuFactureContainer().show();
        factoryA.manuFactureMould().show();

        FactoryB factoryB = new FactoryB();
        factoryB.manuFactureContainer().show();
        factoryB.manuFactureMould().show();
    }
}
