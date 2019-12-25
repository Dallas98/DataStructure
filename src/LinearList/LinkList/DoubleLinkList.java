package LinearList.LinkList;


import LinearList.DataElement;

/**
 * @program: DataStructure
 * @description: 双向循环链表
 * @author: Dallas
 * @create: 2019-12-24 15:35
 */
public abstract class DoubleLinkList implements List {

    protected class DoubleLinkListNode {
        DataElement info;
        DoubleLinkListNode prior;
        DoubleLinkListNode next;

        DoubleLinkListNode(){

        }
        DoubleLinkListNode(DataElement element){
            info=element;
            prior=null;
            next=null;
        }
    }

    protected DoubleLinkListNode head;

    public DoubleLinkList() {
        head = new DoubleLinkListNode();
        head.prior = head;
        head.next = head;
    }

    public DoubleLinkList(DoubleLinkList otherLinkList) {
        copyList(otherLinkList);
    }

    public void initializeList() {
        head = new DoubleLinkListNode();
        head.prior = head;
        head.next = head;
    }

    public boolean isEmptyList() {
        if (head.next == head.prior) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        DoubleLinkListNode p = head.next;
        while (p != head) {
            System.out.print(p.info + " ");
        }
    }

    public int length() {
        DoubleLinkListNode p = head;
        int count = 0;
        while (p.next != head) {
            count++;
            p = p.next;
        }
        return count;
    }

    public DataElement front() {
        return head.next.info.getCopy();
    }

    public DataElement back() {
        return head.prior.info.getCopy();
    }

    public void insertFisrt(DataElement newItem) {
        DoubleLinkListNode node =new DoubleLinkListNode(newItem);
        head.next.prior=node;
        node.next=head.next;
        node.prior=head;
        head.next=node;

    }

    public void insertLast(DataElement lastItem) {
        DoubleLinkListNode node =new DoubleLinkListNode(lastItem);
        node.prior=head.prior;
        head.prior.next=node;
        node.next=head;
        head.prior=node;
    }

    private void copy(DoubleLinkList otherList) {//拷贝链表，尾插入法
            DoubleLinkListNode node;
            DoubleLinkListNode p=otherList.head;
            DoubleLinkListNode current=head;
            while(p.next!=otherList.head){
                node=new DoubleLinkListNode(p.next.info);
                current.next=node;
                node.prior=current;
                p=p.next;
                current=current.next;
            }
            current.next=head;
            head.prior=current;
    }

    private void copyList(DoubleLinkList otherList) {
        if(this!=otherList){
            copy(otherList);
        }
    }

    public void deleteNode(int i){//删除第i个元素
        int count=0;
        DoubleLinkListNode current=head;
        while (count<i-1&&current.next!=null){
            current=current.next;
        }
        DoubleLinkListNode p=current.next;
        current.next=p.next;
        p.next.prior=current;
    }

    public abstract boolean search(DataElement search);
}