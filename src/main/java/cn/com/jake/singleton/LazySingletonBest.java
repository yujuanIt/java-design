package cn.com.jake.singleton;

/**
 * @Classname LazySingletonBest
 * @Description 双重校验锁，在同步锁的基础上，添加一层if判断，若单例已经创建，则不需要执行加锁操作就可以获取实例，从而提高性能。
 * @Date 19-2-1 下午2:34
 * @Created by yujuan
 */
public class LazySingletonBest {
    private static LazySingletonBest lazySingletonBest;

    private LazySingletonBest() {
    }

    public static LazySingletonBest newInstance() {
        //加入双重校验
        //校验锁1 第一个if
            //作用：若单例已经创建，则直接返回创建的单例对象，无需在进行加锁操作
        if (lazySingletonBest == null) {
            //校验锁2 第二个if
                //作用：防止多次创建单例问题
                //原理：
                    //1、线程A调用newInstance 运行到2位置时，此时线程B也调用了newInstance
                    //2、因线程A还没有执 lazySingletonBest = new LazySingletonBest() ,此时lazySingleton为空，因此线程B能突破第一层if判断，运行到1synchronized中的A执行完成
                    //3、当线程A释放同步锁的时候，单例已经创建，lazySingletonBest不为空
                    //4、此时线程B从1开始位置执行到2时，此时第二层if判断不成立，不会再次创建多余的实例
            synchronized (LazySingletonBest.class) {
                if (lazySingletonBest == null) {
                    lazySingletonBest = new LazySingletonBest();
                }
            }
        }
        return lazySingletonBest;

    }
}
