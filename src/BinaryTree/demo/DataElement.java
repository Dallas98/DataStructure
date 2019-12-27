package BinaryTree.demo;

/**
 * @program: DataStructure
 * @description:节点信息抽象类
 * @author: Dallas
 * @create: 2019-12-25 18:48
 */
public abstract class DataElement {
    public abstract boolean equals(DataElement element);

    public abstract int compareTo(DataElement element);

    public abstract void makeCopy(DataElement element);

    public abstract DataElement getCopy();
}
