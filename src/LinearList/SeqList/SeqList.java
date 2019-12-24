package LinearList.SeqList;


/**
 * @program: DataStructure
 * @description: 顺序表模板
 * @author: Dallas
 * @create: 2019-12-24 09:05
 */
public class SeqList {
    public int length;
    public int maxLength;
    public Object elems[];

    public SeqList(int size) {
        elems = new Object[size];
        maxLength = size;
        length = 0;
    }

    public SeqList(Object v[], int n, int size) {
        elems = new Object[size];
        maxLength = size;
        length = n;
        for (int i = 0; i < n; i++) {
            elems[i] = v[i];
        }
    }

    public int GetLength() {
        return length;
    }

    public boolean IsEmpty() {
        if (length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Clear() {
        length = 0;
    }

    public void Traverse() {
        for (int i = 0; i < length; i++) {
            System.out.print(elems[i]+" ");
        }
        System.out.println();
    }

    public int LocateElem(Object e){
        int i=0;
        while(i<length&&e!=elems[i]){
            i++;
        }
        return i<length?i+1:0;

    }

    public Object GetElem(int i){
        if(i<1||i>length){
            return false;
        }
        else{
            return elems[i-1];
        }
    }

    public boolean SetElem(int i,Object e){
        if(i<1||i>length){
            return false;
        }
        else{
            elems[i-1]=e;
            return true;
        }
    }

    public boolean DeleteElem(int i){
        if(i<1||i>length){
            return false;
        }
        else{
            for(int j=i;j<length;j++){
                elems[j-1]=elems[j];
            }
            length--;
            return true;
        }
    }

    public boolean InsertElem(Object e){
        if(length==maxLength){
            return false;
        }
        else {
            elems[length]=e;
            length++;
            return true;
        }
    }

    public boolean InsertElem(Object e,int i){
        if(i<1||i>length){
            return false;
        }
        else {
            for(int j=length;j>i-1;j--){
                elems[j]=elems[j-1];
            }
            elems[i-1]=e;
            length++;
            return true;
        }
    }
}
