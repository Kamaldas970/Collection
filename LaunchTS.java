import java.util.TreeSet;
public class LaunchTs{
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(20);
        ts.add(30);
        ts.add(80);
        ts.add(100);
        ts.add(1000);
        System.out.println("The Higher is "+ts.higher(60));//Single Higher element // (80)
        System.out.println("The lower is "+ts.lower(50)); //Single lower element // (20)
        System.out.println(ts.ceiling(65));
        System.out.println(ts.floor(55));
            System.out.println(ts.headSet(100));

        System.out.println(ts);
    }
    }
