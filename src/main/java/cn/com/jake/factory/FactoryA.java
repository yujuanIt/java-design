package cn.com.jake.factory;

/**
 * @Classname FactoryA
 * @Description TODO
 * @Date 19-2-1 下午4:08
 * @Created by yujuan
 */
public class FactoryA extends Factory{
    @Override
    public Product manuFacture() {
        return new ProductA();
    }
}
