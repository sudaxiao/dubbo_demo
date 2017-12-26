package group;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author xiaosuda
 * @date 2017/12/19
 */
public class CreateGroup implements Watcher{

    private static final int SESSION_TIMEOUT = 5000;
    private ZooKeeper zooKeeper;
    private CountDownLatch connectionSignal = new CountDownLatch(1);


    public void connect(String host) throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper(host , SESSION_TIMEOUT, this);
        connectionSignal.await();
    }


    @Override
    public void process(WatchedEvent watchedEvent) {
        if (watchedEvent.getState() == Event.KeeperState.SyncConnected) {
            connectionSignal.countDown();
        }
    }

    public void create(String groupName) throws KeeperException, InterruptedException {
        String path = "/" + groupName;
        String createPath = zooKeeper.create(path, null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("Created " + createPath);
    }

    public void close() throws InterruptedException {
        zooKeeper.close();
    }

    public static void main(String [] args) throws IOException, InterruptedException, KeeperException {
        CreateGroup createGroup = new CreateGroup();
        createGroup.connect("118.89.150.75:2181");
        createGroup.create("xiaosuda1");
        createGroup.close();
    }
}
