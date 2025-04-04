import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.*;
public class Graph {
    public long test(){
        return 4;
    }





    public static void main(String[] args) {











        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        int n= 3;
        for (int i = 0; i <n+1 ; i++) {
            graph.add(new ArrayList<>());
        }


        graph.get(1).add(2);
        graph.get(1).add(3);



        graph.get(2).add(3);
        graph.get(2).add(1);


        for (int i = 1; i <n+1 ; i++) {
            System.out.print("Vertices " + i + ": ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
