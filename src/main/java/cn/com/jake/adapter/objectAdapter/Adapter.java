package cn.com.jake.adapter.objectAdapter;

/**
 * @Classname Adapter
 * @Description TODO
 * @Date 19-2-1 下午4:01
 * @Created by yujuan
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
