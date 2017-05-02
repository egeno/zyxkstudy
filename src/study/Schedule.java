package study;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Schedule {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTest(), new Date());
	}
}

class MyTest extends TimerTask {

	@Override
	public void run() {
		System.out.println(System.currentTimeMillis());
	}

}
