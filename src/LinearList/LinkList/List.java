package LinearList.LinkList;

import LinearList.DataElement;

/**
 * @program: DataStructure
 * @description: List方法
 * @author: Dallas
 * @create: 2019-12-24 22:36
 */
public interface List {

    boolean isEmptyList();

    void print();

    int length();

    DataElement front();

    DataElement back();

    void insertFisrt(DataElement newItem);

    void insertLast(DataElement lastItem);

    void insert(DataElement element,int i);

    void deleteNode(DataElement deleteItem);

    boolean search(DataElement search);
}

