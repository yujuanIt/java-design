package cn.com.jake.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * The type Viewer.
 *
 * @author yujuan
 * @time 2019 /07/30 18:56:53
 */
public class Viewer implements Observer {

    private int seatNo;

    /**
     * Instantiates a new Viewer.
     *
     * @param seatNo the seat no
     */
    public Viewer(int seatNo) {
        this.seatNo = seatNo;
    }

    @Override
    public void update(Observable o, Object arg) {

        Integer state = (Integer) arg;
        switch (state) {
            case Clown.PERFORM_GOOD:
                applause();
                break;
            case Clown.PERFORM_BAD:
                cheerBack();
                break;
            case Clown.PERFORM_COMPLETE:
                exit();
                break;
            default:
                break;
        }
    }

    private void applause() {
        System.out.println("座位号" + getSeatNo() + "的观众鼓掌了！");
    }

    private void cheerBack() {
        System.out.println("座位号" + getSeatNo() + "的观众发出了倒喝彩！");
    }

    private void exit() {
        System.out.println("座位号" + getSeatNo() + "的观众退场！");
    }

    /**
     * Gets seat no.
     *
     * @return the seat no
     * @author yujuan
     * @time 2019 /07/30 18:56:53
     */
    public int getSeatNo() {
        return seatNo;
    }
}
