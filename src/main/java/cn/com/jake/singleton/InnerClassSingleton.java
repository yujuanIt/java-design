package cn.com.jake.singleton;

/**
 * @Classname InnerClassSingleton
 * @Description 根据静态内部类的特性，同时解决了按需加载，线程安全的问题，同时实现简单
 * 1、在静态内部类中创建单例，在装载该内部类的时候才会去创建单例
 * 2、线程安全，类是由JVM加载，而JVM只会加载一遍，保证只有一个实例
 * @Date 19-2-1 下午2:45
 * @Created by yujuan
 */
public class InnerClassSingleton {
    //创建静态内部类
    private static class InnerClassSingleton2 {
        //在静态内部类中创建实例
        private static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
    //私有构造函数
    private InnerClassSingleton() {
    }
    //延迟加载，按需创建
    public static InnerClassSingleton newInstance() {
        return InnerClassSingleton2.innerClassSingleton;
    }
    //调用过程说明：
        //1、外部调用类的newInstance()
        //2、自动调用InnerClassSingleton2.innerClassSingleton 得到初始化
            //2.1 此时单例类InnerClassSingleton2 得到初始化
            //2.2 而该类在装载&被初始化时，会初始化它的静态域，从而创建单例
            //2.3 由于是静态域，因此只会JVM加载一次，java虚拟机保证的线程的安全性
        //3、最终只创建了一个单例
}
