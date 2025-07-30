package Implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {
    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V]; //V represents visited nodes (1 if visited else 0 (or true false )
        Queue<Integer> q = new LinkedList<>();

        q.add(0);  //or 1 if 1 based indexing
        vis[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            //get all adjacent vertices of the dequeed node
            // if an adjacent node has not been visited then mark it visited
            //visited and enque it

            for (Integer it : adjList.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void dfs(int node, boolean vis[] , ArrayList<ArrayList<Integer>> adjList,ArrayList<Integer> ls){

        //mark the starting node / current node as visited
        vis[node]=true;
        ls.add(node); //ls stores the answer

        //get neighbour nodes
        for(Integer it : adjList.get(node)){
            if(vis[it] == false){
                dfs(it,vis,adjList,ls);
            }
        }
    }
    //fucntion to get list containing

    public ArrayList<Integer> dfsans(int v,ArrayList<ArrayList<Integer>> adjList)
    {
        boolean vis[] = new boolean[v+1];
        vis[0]=true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,vis,adjList,ls);
        return ls;
    }
}


