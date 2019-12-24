package LinearList.LinkList;

import LinearList.DataElement;

/**
 * @program: DataStructure
 * @description: 单链表模板
 * @author: Dallas
 * @create: 2019-12-24 15:33
 */
public abstract class LinkList {

    protected class LinkListNode { //链表节点类
        DataElement info;
        LinkListNode link;
    }

    protected LinkListNode first;
    protected LinkListNode last;
    protected int count;

    public LinkList(){
        first=null;
        last=null;
        count=0;
    }

    public LinkList(LinkList otherLinkList){
        copy(otherLinkList);
    }

    public void initializeList(){
        first=null;
        last=null;
        count=0;
    }

    public boolean isEmptyList(){
        return (first==last);
    }

    public void print(){
        LinkListNode current;
        current=first;
        while(current!=null){
            System.out.println(current.info+" ");
            current=current.link;
        }
    }

    public int lemgth(){
        return count;
    }

    public DataElement front(){
        DataElement element=first.info.getCopy();
        return element;
    }

    public DataElement back(){
        DataElement element=last.info.getCopy();
        return element;
    }

    public void insertFisrt(DataElement newItem){
        LinkListNode node=new LinkListNode();
        node.info=newItem.getCopy();
        node.link=first;
        first=node;
        if(last==null){
            last=node;
        }
        count++;
    }

    public void insertLast(DataElement lastItem){
        LinkListNode node=new LinkListNode();
        node.info=lastItem.getCopy();
        node.link=null;
        if(first==last){
            first=node;
            last=node;
        }else{
            last.link=node;
            last=node;
        }
        count++;
    }

    private void copy(LinkList otherList){//拷贝链表，尾插入法
        LinkListNode newNode;
        LinkListNode current;
        first=null;
        if(otherList.first==null){
            first=null;
            last=null;
            count=0;
        }
        else{
            count=otherList.count;
            current=otherList.first;
            first=new LinkListNode();
            first.info=current.info.getCopy();
            first.link=null;
            last=first;
            current=current.link;
            while (current!=null){
                newNode=new LinkListNode();
                newNode.info=current.info.getCopy();
                newNode.link=null;
                last.link=newNode;
                current=current.link;
            }
        }
    }

    private void copyList(LinkList otherList){
        if(this!=otherList){
            copy(otherList);
        }
    }

    public abstract void deleteNode(DataElement deleteItem);

    public abstract boolean search(DataElement search);



}
