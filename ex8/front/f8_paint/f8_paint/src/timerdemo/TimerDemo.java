package timerdemo;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
	TimerDemo timerDemo = new TimerDemo();
	timerDemo.createAndRunRepeatedTask();
    }

    private void createAndRunRepeatedTask() {
	TimerTask task = new RepeatedTask();
	Timer timer = new Timer();
	timer.schedule(task, 1000, 500);
	//για να σταματήσει καλούμε (a):
	//timer.cancel();
    }
}

// η εργασία που θέλουμε να επαναλαμβάνεται
class RepeatedTask extends TimerTask {
    public void run() {
	System.out.println("τικ");
	//για να σταματήσει καλούμε (b):
	//cancel();
    }
}
