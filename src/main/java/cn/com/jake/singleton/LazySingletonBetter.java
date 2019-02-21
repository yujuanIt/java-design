package cn.com.jake.singleton;

/**
 * @Classname LazySingletonBetter
 * @Description 同步锁，懒汉式的改进 使用同步锁synchronized锁住创建单例的方法，防止多个线程同时调用，从而避免单例被多次调用
 * 1、newInstance 方法块只能运行在一个线程中
 * 2、若该段代码已在一个线程中运行，另外一个线程试图运行该代码，则会被一直阻塞猪
 * 3、在这个线程安全的方法里实现了单例的创建，保证了多线程下单例对象的唯一性
 *
 * 缺点：每次访问都要进行线程同步，即调用synchronized锁，造成过多的同步开销（加锁=耗时、耗能）实际上只需要在第一次调用该方法的时候需要同步，一旦单例创建后，就没有必要在同步
 * @Date 19-2-1 下午2:24
 * @Created by yujuan
 */
public class LazySingletonBetter {
    //类加载时，先不创建对象，单例的引用先赋值未null
    private static LazySingletonBetter lazySingletonBetter = null;

    //构造函数私有化，防止他人创建实例
    private LazySingletonBetter() {
    }

    //方式一 加入同步锁
    public static synchronized LazySingletonBetter newInstance1() {
        //先判断单利是否为空，避免重复创建
        if (lazySingletonBetter == null) {
            lazySingletonBetter = new LazySingletonBetter();
        }
        return lazySingletonBetter;
    }

    //方式二
    public static LazySingletonBetter newInstance2() {
        synchronized (LazySingletonBetter.class) {
            if (lazySingletonBetter == null) {
                lazySingletonBetter = new LazySingletonBetter();
            }
        }
        return lazySingletonBetter;
    }

}
