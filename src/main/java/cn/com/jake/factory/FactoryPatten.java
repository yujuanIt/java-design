package cn.com.jake.factory;

/**
 * @Classname FactoryPattren
 * @Description TODO
 * @Date 19-2-1 下午4:09
 * @Created by yujuan
 */
public class FactoryPatten {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.manuFacture().show();

        FactoryB factoryB = new FactoryB();
        factoryB.manuFacture().show();
    }
}

