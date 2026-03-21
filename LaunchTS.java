import java.util.TreeSet;
public class LaunchTs{
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(20);
        ts.add(30);
        ts.add(100);
        ts.add(80);
        ts.add(1000);
//Duplicates are not allowed
//null value gives nullpointerException
        System.out.println(ts);
    }
    }
