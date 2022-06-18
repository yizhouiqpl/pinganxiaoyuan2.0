
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: yizhouiqpl
 * @Date: 2022/06/15/21:09
 */
public class TaskTest {

    @Test
    public void test() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                System.out.println("当前时间 ===> " + simpleDateFormat.format(new Date()));
            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        //public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);
        //command--执行的任务,initialDelay--延迟开始,period--间隔时间,unit--时间单位
        service.scheduleAtFixedRate(runnable, 0, 5, TimeUnit.SECONDS);
    }

}
