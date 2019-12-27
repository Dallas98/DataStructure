package BinaryTree.demo;


/**
 * @program: DataStructure
 * @description: int类型
 * @author: Dallas
 * @create: 2019-12-25 20:29
 */
public class IntElement extends DataElement {
    protected int num;

    public IntElement() {
        num = 0;
    }

    public IntElement(int x) {
        num = x;
    }

    public IntElement(IntElement intElement) {
        num = intElement.num;
    }

    public void setNum(int x) {
        num = x;
    }

    public int getNum() {
        return num;
    }


    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public boolean equals(DataElement element) {
        IntElement temp = (IntElement) element;
        return (num == temp.num);
    }

    @Override
    public int compareTo(DataElement element) {
        IntElement temp = (IntElement) element;
        return (num - temp.num);
    }

    @Override
    public void makeCopy(DataElement element) {
        IntElement temp = (IntElement) element;
        num = temp.num;
    }

    @Override
    public DataElement getCopy() {
        IntElement temp = new IntElement(num);
        return temp;
    }
}
