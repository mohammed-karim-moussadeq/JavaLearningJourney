package Algo.structure.brocode;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String [] args) {

        // queues = FIFO data structures. First-in First-Out (ex. Line of people)
        // A collection designed for holding elements prior to processing
        // Linear data structure

        // add = enqueue, offer() // just adds objects to your queue
        // remove = dequeue, poll() // removes the first object on your queue
        // queue.peek() // is to examine what is the first object we have on my queue

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Porsche 911");
        queue.offer("Nissan GTR");
        queue.offer("BMW M5 CS");
        queue.offer("Ferrari LAFerrari");
        System.out.println(queue);
        //System.out.println(queue.isEmpty()); // to check if the queue is empty it will return true if it's printed before offering/adding to the queue, it will
        // return false if O print it after offering/adding to the queue
        //System.out.println(queue.size()); // is to see the size of our queue ( how many objects we have in our queue)
        //System.out.println(queue.contains("Porsche")); // this is like the search on stack. contains means if we are looking for something on that queue, it will return false if the object isn't there and it will return true if the object is there.
        //System.out.println(queue.poll());

        // where are queues useful?
        // here are some examples: 1. keyboard Buffer ( letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue ( print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breach-first search.

    }
}
