package cn.com.jake.adapter.objectAdapter;

/**
 * @Classname AdapterParttern
 * @Description TODO
 * @Date 19-2-1 下午4:02
 * @Created by yujuan
 */
public class AdapterParttern {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
