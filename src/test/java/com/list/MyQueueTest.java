package com.list;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
   @Test
    public void given3Numbers_WhenAddedToQueue_ShouldPassResult(){
       MyNode<Integer> myFirstNode = new MyNode<>(56);
       MyNode<Integer> mySecondNode = new MyNode<>(30);
       MyNode<Integer> myThirdNode = new MyNode<>(70);
       MyQueue myQueue = new MyQueue();
       myQueue.enqueue(myFirstNode);
       myQueue.enqueue(mySecondNode);
       myQueue.enqueue(myThirdNode);
       myQueue.printStack();
       INode peak = myQueue.peak();
       Assert.assertEquals(myFirstNode, peak);
   }
   @Test
   public void given3Numbers_WhenDequeue_ShouldPassResult() {
      MyNode<Integer> myFirstNode = new MyNode<>(56);
      MyNode<Integer> mySecondNode = new MyNode<>(30);
      MyNode<Integer> myThirdNode = new MyNode<>(70);
      MyQueue myQueue = new MyQueue();
      myQueue.enqueue(myFirstNode);
      myQueue.enqueue(mySecondNode);
      myQueue.enqueue(myThirdNode);
      myQueue.printStack();
      INode deque = myQueue.dequeue();
      myQueue.printStack();
      Assert.assertEquals(myFirstNode, deque);
   }
}
