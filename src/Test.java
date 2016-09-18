import java.util.*;

/**
 * Created by Elizaveta Naimark on 12.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            list1.add(r.nextInt(10));
        }
        for(Integer element : list1){
            System.out.print(element + " ");
        }

        System.out.println("");

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(list1);
        for(Integer e : set1){
            System.out.print(e + " ");
        }
    }
}
