package group;

import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author xiaosuda
 * @date 2017/12/19
 */
public class ListGroup extends ConnectionWatcher {

    public void list(String groupName) throws KeeperException, InterruptedException {
        String path = "/" + groupName;

        List<String> children = zooKeeper.getChildren(path, false);
        if (children.isEmpty()) {
            System.out.printf("No members in group %s\n", groupName);
            System.exit(1);
        }
        for (String child : children) {
            System.out.println(child);
        }
    }
    public static void main(String [] args) throws IOException, InterruptedException, KeeperException {
        ListGroup listGroup = new ListGroup();
        listGroup.connect("118.89.150.75:2181");
        listGroup.list("xiaosuda");
        listGroup.close();
    }
}
