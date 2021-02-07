package com.list;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }
    public boolean isEmpty(){
        return myLinkedList.head == null;
    }
    public INode peak(){
        if (!isEmpty()){
            return myLinkedList.head;
        }else {
            System.out.println("Stack is empty");
        }return null;
    }
    public INode pop() {
       /* INode<Integer> peak = (INode<Integer>) peak();
        while (peak != null) {
            myLinkedList.pop();
            peak = (INode<Integer>) peak();
        }*/
        return myLinkedList.pop();
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }


}
