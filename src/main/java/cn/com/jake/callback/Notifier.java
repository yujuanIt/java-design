package cn.com.jake.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Notifier
 * @Description TODO
 * @Date 19-2-12 下午2:31
 * @Created by yujuan
 */
public class Notifier {
    private static final Logger LOGGER = LoggerFactory.getLogger(Notifier.class);

    public void excute(Caller caller, String msg) throws Exception {
        LOGGER.info("收到消息：{}", msg);
        LOGGER.info("消息等待中...");
        TimeUnit.SECONDS.sleep(2);
        caller.getCallBackListener().callBackNotify("我在北京");

    }

}
