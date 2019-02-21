package cn.com.jake.adapter.classAdapter;

/**
 * @Classname Adapter
 * @Description TODO
 * @Date 19-2-1 下午3:54
 * @Created by yujuan
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        this.specificRequest();
    }
}
