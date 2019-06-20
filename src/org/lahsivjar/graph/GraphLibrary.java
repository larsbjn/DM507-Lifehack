package org.lahsivjar.graph;

public class GraphLibrary {

    public static Graph graph1(boolean directed) {
        // (0) --> (1)
        //  |     / |
        //  |    /  |
        //  |   /   |
        //  . .     .
        // (2)     (3)

        final Graph graph = new AdjList(4, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);

        return graph;
    }

    public static Graph graph2(boolean directed) {
        // (0) --> (1) --> (2)
        //  | \     |       |
        //  |  \    |       |
        //  |   \   |       |
        //  |    \  |       |
        //  .     . .       .
        // (5)     (4) <-- (3)

        final Graph graph = new AdjList(6, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        return graph;
    }

    public static Graph graph3(boolean directed) {
        // (0) --> (1) --> (2)
        //  |
        //  .
        // (3)

        final Graph graph = new AdjList(4, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        return graph;
    }

    public static Graph graph4(boolean directed) {
        //   ----> (2) -> (5)
        //  |       ^    /
        //  |       |   /
        //  |       |  /
        //  |       | .
        // (0) --> (1)
        //  |       ^
        //  |       |
        //  .       |
        // (3) --> (4)

        final Graph graph = new AdjList(6, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
        graph.addEdge(5, 1);

        return graph;
    }

    public static Graph graph5(boolean directed) {
        //   ----> (0) <-----
        //  |       |        |
        //  |       |        |
        //  |       .        |
        // (2) <-- (1) ---> (3) ---> (7)
        //          |        |        |
        //          |        |        |
        //          .        .        |
        //         (4) ---> (5) <-----
        //          ^        |
        //          |        |
        //          |        .
        //           ------ (6)

        final Graph graph = new AdjList(8, directed);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 0);
        graph.addEdge(3, 0);
        graph.addEdge(3, 5);
        graph.addEdge(3, 7);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 4);
        graph.addEdge(7, 5);

        return graph;
    }

    public static Graph graph6(boolean directed) {
        // (0) --> (2) --> (3)
        //  | \     |       |
        //  |  \    |       |
        //  |   \   |       |
        //  |    \  |       |
        //  .     . .       .
        // (5)     (1)     (4)

        final Graph graph = new AdjList(6, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 5);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        return graph;
    }

    public static Graph graph7(boolean directed) {
        // (0) --> (1)
        //  ^       |
        //  |       |
        //  |       .
        // (3) <-- (2) --> (4)
        //  ^               |
        //  |               |
        //   ---------------

        final Graph graph = new AdjList(5, directed);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 0);
        graph.addEdge(4, 3);

        return graph;
    }

    public static Graph graph8(boolean directed) {
        // (0) --> (1) (2) (3) --> (4)

        final Graph graph = new AdjList(5, directed);
        graph.addEdge(0, 1);
        graph.addEdge(3, 4);

        return graph;
    }

    public static Graph graph9(boolean directed) {
        // (0) --> (1) (2) (3) --> (4)

        final Graph graph = new AdjList(9, directed);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 7);
        graph.addEdge(5, 8);
        graph.addEdge(6, 3);
        graph.addEdge(6, 7);
        graph.addEdge(7, 4);
        graph.addEdge(7, 8);

        return graph;
    }

    public static Graph graph10(boolean directed) {
        // (0) --> (1) (2) (3) --> (4)
        /*
        q = 0
        r = 1
        s = 2
        t = 3
        u = 4
        v = 5
        w = 6
        x = 7
        y = 8
        z = 9
         */
        final Graph graph = new AdjList(10, directed);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 6);
        graph.addEdge(1, 4);
        graph.addEdge(1, 8);
        graph.addEdge(2, 5);
        graph.addEdge(3, 7);
        graph.addEdge(3, 8);
        graph.addEdge(4, 8);
        graph.addEdge(5, 6);
        graph.addEdge(6, 2);
        graph.addEdge(7, 8);
        graph.addEdge(8, 0);
        graph.addEdge(9, 7);

        return graph;
    }

    public static Graph graph11(boolean directed) {
        // (0) --> (1) (2) (3) --> (4)
        /*
        a = 0
        b = 1
        c = 2
        d = 3
        e = 4
        f = 5
        g = 6
        h = 7
        i = 8
         */
        final Graph graph = new AdjList(9, directed);
        graph.addEdge(0, 8);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 8);
        graph.addEdge(3, 2);
        graph.addEdge(4, 8);
        graph.addEdge(4, 3);
        graph.addEdge(5, 8);
        graph.addEdge(5, 4);
        graph.addEdge(6, 5);
        graph.addEdge(6, 7);
        graph.addEdge(7, 0);
        graph.addEdge(8, 1);
        graph.addEdge(8, 3);
        graph.addEdge(8, 6);
        graph.addEdge(8, 7);

        return graph;
    }

}
