package Implementation;

class Graph{
    int [][] matrix;

    public Graph(int size){
        matrix = new int[size][size];
    }
    //add edge 0 / 1 / -1
    public void addEdge(int src , int dest){
        matrix[src][dest]=1;
    }

    public boolean checkEdge(int src ,int dest){
        if (matrix[src][dest] == 1)
            return true;
        return false;
    }

}





public class AdjacencyMatrix {
    public static void main(String[] args) {

    }
}
