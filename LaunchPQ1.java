import java.util.PriorityQueue;
public class LaunchPQ1{
    public static void main(String args[]){

        PriorityQueue pq=new PriorityQueue();
        pq.add(60);
         pq.add(80);
          pq.add(30);
           pq.add(500);
            pq.add(34);
             pq.add(25);
              pq.add(100);
              pq.offer(1000);
              System.out.println("The Top most element is "+pq.peek()); //this method fetch the top element
                System.out.println(pq.poll()); // This method retrives & removes high priority element
              System.out.println(pq);



    }

}