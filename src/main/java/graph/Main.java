package graph;

import java.util.Set;

public class Main {
    public static void main(String arg[]){
        Graph mygraph =Graph.createGraph();

        Set<String> breadthFirstTraversal =mygraph.breadthFirstTraversal(mygraph,"Bob");
        Set<String> depthFirstTraversal =mygraph.depthFirstTraversal(mygraph,"Bob");
        System.out.println(breadthFirstTraversal);
        System.out.println(depthFirstTraversal);
    }
}
