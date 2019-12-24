import LinearList.SeqList.SeqList;

/**
 * @program: DataStructure
 * @description: test主函数
 * @author: Dallas
 * @create: 2019-12-24 10:36
 */
public class Main {
    public static void main(String[] args) {
        Object a[]={2,5,1,9,10,99,7};
        SeqList seqList=new SeqList(a,7,10);

//        System.out.println(seqList.elems[2]);
//        seqList.Traverse();
        Object e=0;
        seqList.Traverse();
        seqList.InsertElem(3,3);
        seqList.Traverse();
        seqList.SetElem(1,8);
        seqList.DeleteElem(1);
        seqList.Traverse();
        System.out.println(seqList.GetLength());
    }
}
