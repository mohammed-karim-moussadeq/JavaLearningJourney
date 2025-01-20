package Algo.structure.brocode;

import java.util.*;


public class priotiryQueues {
    public static void main(String[] args){
        // Priority Queue = first in first out data structure that serves elements
        // with the highest priorities first before elements with lower prio

        Queue <Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.2);
        queue.offer(4.2);
        queue.offer(1.2);
        queue.offer(6.2);
        queue.offer(5.2);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
