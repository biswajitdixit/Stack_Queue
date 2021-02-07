package com.list;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
  @Test
    public void given3NumberWhenAddedToStackShouldHaveLastAddedNode(){
      MyNode<Integer> myFirstNode = new MyNode<>(70);
      MyNode<Integer> mySecondNode = new MyNode<>(30);
      MyNode<Integer> myThirdNode = new MyNode<>(56);
      MyStack myStack = new MyStack();
      myStack.push(myFirstNode);
      myStack.push(mySecondNode);
      myStack.push(myThirdNode);
      myStack.printStack();
      INode peak = myStack.peak();
      Assert.assertEquals(myThirdNode,peak);
  }
  @Test
  public void given3Numbers_WhenPopFromStack_ShouldPassResult() {
    MyNode<Integer> myFirstNode = new MyNode<>(70);
    MyNode<Integer> mySecondNode = new MyNode<>(30);
    MyNode<Integer> myThirdNode = new MyNode<>(56);
    MyStack myStack = new MyStack();
    myStack.push(myFirstNode);
    myStack.push(mySecondNode);
    myStack.push(myThirdNode);
    myStack.printStack();
    INode<Integer> pop = myStack.pop();
    myStack.printStack();
    Assert.assertEquals(myThirdNode, pop);
  }

}
