package BinaryTree.demo;

/**
 * @program: DataStructure
 * @description: 节点类
 * @author: Dallas
 * @create: 2019-12-25 19:45
 */
public class BiTreeNode {
    DataElement info;
    BiTreeNode lChild;
    BiTreeNode rChild;

    BiTreeNode() {
        info = null;
        lChild = null;
        rChild = null;
    }

    BiTreeNode(DataElement info,BiTreeNode lChild, BiTreeNode rChild) {
        this.info = info;
        this.lChild = lChild;
        this.rChild = rChild;
    }
}
