package cn.com.jake.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname Caller
 * @Description TODO
 * @Date 19-2-12 下午2:30
 * @Created by yujuan
 */
public class Caller {
    private final static Logger LOGGER = LoggerFactory.getLogger(Caller.class);
    private CallBackListener callBackListener;
    private Notifier notifier;
    private String question;

    public void call() {
        LOGGER.info("开始提问");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    notifier.excute(Caller.this, question);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        LOGGER.info("提问完毕，等待回答");
    }

    public CallBackListener getCallBackListener() {
        return callBackListener;
    }

    public void setCallBackListener(CallBackListener callBackListener) {
        this.callBackListener = callBackListener;
    }

    public Notifier getNotifier() {
        return notifier;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
