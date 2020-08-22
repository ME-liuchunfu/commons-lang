package xin.spring.bless.fast.commons.lang.factory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述，线程工厂
 * 作者： liuchunfu
 * 时间：2020-07-31 16:11
 */
public class ThreadFactory {

    private ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

    private ThreadFactory(){}

    private static ThreadFactory instance = null;

    /**
     * 方法： 获取线程池实例
     * @return 返回线程池工厂
     */
    public static synchronized ExecutorService getInstance() {
        if (instance == null) {
            instance = new ThreadFactory();
        }
        return instance.pool;
    }

    /**
     * 方法描述： 关闭线程
     */
    public static void shutdown(){
        if (instance != null) {
            instance.pool.shutdown();
        }
    }

}
