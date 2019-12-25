package BinaryTree;

/**
 * @program: DataStructure
 * @description: String类型
 * @author: Dallas
 * @create: 2019-12-25 21:35
 */
public class StringElement extends DataElement{
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

    public void setString(String s){
        str=s;
    }


    @Override
    public boolean equals(DataElement element) {
        return false;
    }

    @Override
    public int compareTo(DataElement element) {
        return 0;
    }

    @Override
    public void makeCopy(DataElement element) {

    }

    @Override
    public DataElement getCopy() {
        return null;
    }

    @Override
    public String toString() {
        return str;
    }
}
