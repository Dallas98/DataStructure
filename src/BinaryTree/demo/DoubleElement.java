package BinaryTree.demo;

/**
 * @program: DataStructure
 * @description: doublel类型
 * @author: Dallas
 * @create: 2019-12-25 20:55
 */
public class DoubleElement extends DataElement {
    protected double num;

    public DoubleElement() {
        num = 0;
    }

    public DoubleElement(double x) {
        num = x;
    }

    public DoubleElement(DoubleElement doubleElement) {
        num = doubleElement.num;
    }

    public void setNum(double x) {
        num = x;
    }

    public double getNum() {
        return num;
    }


    @Override
    public boolean equals(DataElement element) {
        DoubleElement temp = (DoubleElement) element;
        return (num == temp.num);
    }

    @Override
    public int compareTo(DataElement element) {
        DoubleElement temp = (DoubleElement) element;
        return (int) (num - temp.num);
    }

    @Override
    public void makeCopy(DataElement element) {
        DoubleElement temp = (DoubleElement) element;
        num = temp.num;
    }

    @Override
    public DataElement getCopy() {
        DoubleElement temp = new DoubleElement(num);
        return temp;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
