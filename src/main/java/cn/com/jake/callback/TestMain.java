package cn.com.jake.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname TestMain
 * @Description TODO
 * @Date 19-2-12 下午2:36
 * @Created by yujuan
 */
public class TestMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        Caller caller = new Caller();
        caller.setNotifier(notifier);
        caller.setQuestion("你在哪儿");
        caller.setCallBackListener(new CallBackListener() {
            @Override
            public void callBackNotify(String msg) {
                LOGGER.info("回复：{}", msg);
            }
        });
    }
}
