package cn.com.jake.proxy;

/**
 * @Classname RealSubject
 * @Description 创建真实对象类（RealSubject）,即”我“
 * @Date 19-2-1 下午2:58
 * @Created by yujuan
 */
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台mac");
    }
}
