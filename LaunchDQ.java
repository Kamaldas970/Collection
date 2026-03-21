import java.util.ArrayDeque;
import java.util.Deque;
public class LaunchDQ{
    public static void main(String args[]){

        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(23);
        dq.add(45);
        dq.add(100);
        dq.addFirst(100);
        dq.addLast(400);

        System.out.println(dq);

    }
}