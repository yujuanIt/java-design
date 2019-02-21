package cn.com.jake.factory;

/**
 * @Classname FactroyB
 * @Description TODO
 * @Date 19-2-1 下午4:09
 * @Created by yujuan
 */
public class FactoryB extends Factory {

    @Override
    public Product manuFacture() {
        return new ProductB();
    }
}
