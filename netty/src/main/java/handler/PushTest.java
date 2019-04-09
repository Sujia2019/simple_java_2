package handler;

import push.PushServer;

public class PushTest implements Runnable{

    @Override
    public void run() {
        while (true){
            PushServer.socketChannelMap.forEach((key, value) -> {
                System.out.println("channel id is: " + key);
                System.out.println("channel: " + value.isActive());
                value.writeAndFlush("hello, it is Server test header ping \\n");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
