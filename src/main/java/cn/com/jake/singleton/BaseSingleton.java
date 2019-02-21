package cn.com.jake.singleton;

//http://note.youdao.com/noteshare?id=c0d47507426e697edfa7630c33894561

/**
 * @Classname LazySingleton
 * @Description 饿汉单例：单例创建不可控，类加载时就创建
 * @Date 19-2-1 下午2:18
 * @Created by yujuan
 */
public class BaseSingleton {
    //加载该类时，单例就会自动被创建
    private static BaseSingleton baseSingleton = new BaseSingleton();

    //构造函数设置有私有函数，禁止他人创建实例
    private BaseSingleton() {

    }

    //通过静态方法获得创建的单例
    public static BaseSingleton newInstance() {
        return baseSingleton;
    }
}
