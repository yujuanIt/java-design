package cn.com.jake.adapter.classAdapter;

/**
 * @Classname AdapterPattern
 * @Description TODO
 * @Date 19-2-1 下午3:55
 * @Created by yujuan
 */
public class AdapterPattern {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
