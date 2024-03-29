import java.util.*;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list 
// representation 
class StrongConnectedComponents
{
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List

    //Constructor
    StrongConnectedComponents(int v)
    {
        v++;
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w) { adj[v].add(w); }

    // A recursive function to print DFS starting from v
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        int n;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i =adj[v].iterator();
        while (i.hasNext())
        {
            n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }

    // Function that returns reverse (or transpose) of this graph
    StrongConnectedComponents getTranspose()
    {
        StrongConnectedComponents g = new StrongConnectedComponents(V);
        for (int v = 0; v < V; v++)
        {
            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i =adj[v].listIterator();
            while(i.hasNext())
                g.adj[i.next()].add(v);
        }
        return g;
    }

    void fillOrder(int v, boolean visited[], Stack stack)
    {
        // Mark the current node as visited and print it
        visited[v] = true;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].iterator();
        while (i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
                fillOrder(n, visited, stack);
        }

        // All vertices reachable from v are processed by now,
        // push v to Stack
        stack.push(new Integer(v));
    }

    // The main function that finds and prints all strongly
    // connected components
    void printSCCs()
    {
        Stack stack = new Stack();

        // Mark all the vertices as not visited (For first DFS)
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++)
            visited[i] = false;

        // Fill vertices in stack according to their finishing
        // times
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                fillOrder(i, visited, stack);

        // Create a reversed graph
        StrongConnectedComponents gr = getTranspose();

        // Mark all the vertices as not visited (For second DFS)
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Now process all vertices in order defined by Stack
        while (stack.empty() == false)
        {
            // Pop a vertex from stack
            int v = (int)stack.pop();

            // Print Strongly connected component of the popped vertex
            if (visited[v] == false)
            {
                gr.DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    // Driver method
    public static void main(String args[])
    {
        // 1 2 3 4 5 6 7 8 9 10 11
        // A B C D E F G H I J K
        //forsøg på at løse opg 10 i MC17
        // Create a graph given in the above diagram
		StrongConnectedComponents g = new StrongConnectedComponents(9);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(5, 2);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 3);
        g.addEdge(6, 8);
        g.addEdge(6, 9);
        g.addEdge(7, 4);
        g.addEdge(7, 8);
        g.addEdge(8, 5);
        g.addEdge(8, 9);

        //Eksemplet fra https://www.geeksforgeeks.org/strongly-connected-components/
        /*StrongConnectedComponents g = new StrongConnectedComponents(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);*/



        System.out.println("Following are strongly connected components "+
                "in given graph ");
        g.printSCCs();
    }
} 