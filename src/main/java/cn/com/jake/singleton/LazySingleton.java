package cn.com.jake.singleton;

/**
 * @Classname LazySingleton
 * @Description 懒汉式：单例创建时可控，需要时才创建单例
 * @Date 19-2-1 下午2:18
 * @Created by yujuan
 */
public class LazySingleton {

    //类加载时，先不自动创建实例，将单例的引用赋值为null
    private static LazySingleton lazySingleton = null;

    //构造函数私有化，防止他人创建实例
    private LazySingleton() {
    }

    //需要时调用newInstance 创建实例
    public static LazySingleton newInstance() {
        //先判断是否为空，避免重复创建
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
