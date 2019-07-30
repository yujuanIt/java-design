package cn.com.jake.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * The type Notifier.
 *
 * @author yujuan
 * @time 2019 /07/30 18:35:23
 */
public class Notifier {
    private static final Logger LOGGER = LoggerFactory.getLogger(Notifier.class);

    /**
     * Excute.
     *
     * @param caller the caller
     * @param msg    the msg
     * @throws Exception the exception
     * @author yujuan
     * @time 2019 /07/30 18:35:23
     */
    public void excute(Caller caller, String msg) throws Exception {
        LOGGER.info("收到消息：{}", msg);
        LOGGER.info("消息等待中...");
        TimeUnit.SECONDS.sleep(2);
        caller.getCallBackListener().callBackNotify("我在北京");

    }

}
