package com.list;

public class MyNode <K>implements INode<K>{
    private  K Key;
    private  INode next;
    public  MyNode(K key){
        this.Key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return Key;
    }

    @Override
    public void setKey(K key) {
        this.Key=key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
