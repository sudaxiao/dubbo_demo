package group;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;

import java.io.IOException;

/**
 *
 * @author xiaosuda
 * @date 2017/12/19
 */
public class JoinGroup extends ConnectionWatcher {

    public void join(String groupName, String memberName) throws KeeperException, InterruptedException {
        String path = "/" + groupName + "/" + memberName;
        String createPath = zooKeeper.create(path, null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println("Created" + createPath);
    }

    public static void main(String [] args) throws IOException, InterruptedException, KeeperException {
        JoinGroup joinGroup = new JoinGroup();
        joinGroup.connect("118.89.150.75:2181");
        joinGroup.join("xiaosuda", "duck");
        joinGroup.join("xiaosuda", "cow");
        joinGroup.join("xiaosuda", "goat");
    }


}
