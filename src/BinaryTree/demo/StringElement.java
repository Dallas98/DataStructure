package BinaryTree.demo;

/**
 * @program: DataStructure
 * @description: String类型
 * @author: Dallas
 * @create: 2019-12-25 21:35
 */
public class StringElement extends DataElement {
    protected String str;

    public StringElement() {
        str = null;
    }

    public StringElement(String s) {
        str = s;
    }

    public StringElement(StringElement stringElement) {
        str = stringElement.str;
    }

    public void setString(String s) {
        str = s;
    }


    @Override
    public boolean equals(DataElement element) {
        StringElement temp = (StringElement) element;
        return (str.compareTo(temp.str) == 0);
    }

    @Override
    public int compareTo(DataElement element) {
        StringElement temp = (StringElement) element;
        return (str.compareTo(temp.str));
    }

    @Override
    public void makeCopy(DataElement element) {
        StringElement temp = (StringElement) element;
        str = new String(temp.str);
    }

    @Override
    public DataElement getCopy() {
        StringElement temp = new StringElement();
        return temp;
    }

    @Override
    public String toString() {
        return str;
    }
}
