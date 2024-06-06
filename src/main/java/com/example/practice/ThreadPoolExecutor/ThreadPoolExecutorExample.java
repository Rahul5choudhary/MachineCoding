package com.example.practice.ThreadPoolExecutor;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 100, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFcatory(), new CustomRejectHandler());
        for (int i = 1; i <= 100; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(4000);
                } catch (Exception e) {
                    //handle this exception
                }
                System.out.println("Task processed by ThreadName " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }

    static class CustomThreadFcatory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            Thread th = new Thread(r);
            th.setPriority(Thread.NORM_PRIORITY);
            th.setDaemon(false);
            return th;
        }
    }

    static class CustomRejectHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("Task Rejected :" + r.toString() + r.getClass().getName());
        }
    }
}
