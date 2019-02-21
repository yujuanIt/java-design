package cn.com.jake.simpleFactory;

/**
 * @Classname Factory
 * @Description 创建工厂类，通过创建静态方法从而根据传入不同参数创建不同具体产品类的实例
 * @Date 19-2-1 下午3:06
 * @Created by yujuan
 */
public class Factory {
    public static Product ManuFacture(String ProductName) {
        switch (ProductName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            case "C":
                return new ProductC();
            default:
                return null;
        }
    }
}
