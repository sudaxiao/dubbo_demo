package group;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author xiaosuda
 * @date 2017/12/19
 */
public class ConnectionWatcher implements Watcher {


    private static final int SESSION_TIMEOUT = 5000;
    protected ZooKeeper zooKeeper;
    private CountDownLatch connectedSignal = new CountDownLatch(1);


    public void connect(String hosts) throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper(hosts, SESSION_TIMEOUT, this);
        connectedSignal.await();
    }

    @Override
    public void process(WatchedEvent watchedEvent) {
        if (watchedEvent.getState() == Event.KeeperState.SyncConnected) {
            connectedSignal.countDown();
        }
    }

    public void close() throws InterruptedException {
        zooKeeper.close();
    }
}
