package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {
    TransferQueue<ShareItem> queue;

    public Consumer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(450);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    ShareItem item = queue.take();
                    System.out.format("Processing " + item);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
