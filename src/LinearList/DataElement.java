package LinearList;

/**
 * @program: DataStructure
 * @description:
 * @author: Dallas
 * @create: 2019-12-24 20:41
 */
public abstract class DataElement {
    public abstract boolean equals(DataElement otherElement);
    public abstract int compareTo(DataElement otherElement);
    public abstract void makeCopy(DataElement otheerElement);
    public abstract DataElement getCopy();
}
