package collection;

import java.util.PriorityQueue;

public class MyPriorityQueue {

	public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(45);
        pq.add(20);
        pq.add(13);
        System.out.println(pq);
        
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
       
        
		
	}

}
