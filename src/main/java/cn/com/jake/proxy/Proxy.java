package cn.com.jake.proxy;

/**
 * @Classname Proxy
 * @Description TODO
 * @Date 19-2-1 下午2:59
 * @Created by yujuan
 */
public class Proxy implements Subject {
    @Override
    public void buyMac() {
        //引用真实对象并创建真是对象实例
        RealSubject realSubject = new RealSubject();
        //调用真是对象的方法，进行代理购买mac
        realSubject.buyMac();
        //代理对象做额外的操作，TODO 面向切面编程 AOP
        wrapMac();
    }
    private void wrapMac(){
        System.out.println("用盒子包装好mac");
    }
}
