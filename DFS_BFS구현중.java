/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BFS{
    Graph graph;
    
    public BFS(Graph graph){
        this.graph = graph;
    }
    
    public void print_BFS_Search(int vertexNum){
        Queue<Node> q = new LinkedList<>();
        System.out.print(graph.nodes[vertexNum]+"\t");
        q.offer(graph.nodes[vertexNum]);
        while(q.isEmpty()==false){
            for(int i=0;i<graph.nodes[vertexNum].adjacencyList.size();i++){
                System.out.println(i);
                if(!graph.nodes[vertexNum].adjacencyList.get(i).marked){
                    System.out.println(graph.nodes[vertexNum].adjacencyList.get(i));
                    q.offer(graph.nodes[vertexNum].adjacencyList.get(i));
                }
            }
            System.out.print(q.poll());
        }
    }
}

class DFS{
    Graph graph;
    public DFS(Graph graph){
        this.graph = graph;
    }
    public void print_DFS_Search(int vertexNum){
        int nextIdx = -1;
        System.out.print(graph.nodes[vertexNum]+"\t");
        
        for(int i=0;i<graph.nodes[vertexNum].adjacencyList.size();i++){
            if(!graph.nodes[vertexNum].adjacencyList.get(i).marked){
                graph.nodes[vertexNum].adjacencyList.get(i).marked = true;
                nextIdx = i;
                break;
            }
        }
        
        if(nextIdx == -1)
            return;
        
        System.out.println("next_vtx_num: "+graph.nodes[vertexNum].adjacencyList.get(nextIdx).vertexNum);
        
        print_DFS_Search(graph.nodes[vertexNum].adjacencyList.get(nextIdx).vertexNum);
    }
    void setFalse(){
        for(int i=1;i<graph.nodes.length;i++){
            graph.nodes[i].marked = false;
        }
    }
}
class Node implements Comparable<Node>{
        int vertexNum;
        LinkedList<Node> adjacencyList; // 노드의 인접리스트
        boolean marked;                 // 노드 방문 여부
        public Node(int n){
            this.vertexNum = n;
            this.marked = false;
            adjacencyList = new LinkedList<Node>();
        }
        @Override
        public String toString(){
            return String.valueOf(vertexNum);
        }
        @Override
        public int compareTo(Node n){
            return vertexNum - n.vertexNum;
        }
    }   // 노드 클래스
    

class Graph{
    void printAdjacencyList(){  // 인접리스트 출력 메소드
        for(int i=1;i<nodes.length;i++){
            System.out.print("Vertex's Number:("+i+")\t");
            if(nodes[i].adjacencyList == null){
                System.out.println("null");
                continue;
            }
            for(Node n:nodes[i].adjacencyList){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
    }
    Node[] nodes;
    Graph(int size){
        nodes = new Node[size+1];
    }
    void init(int totalVertex){
        for(int i=1;i<totalVertex+1;i++){
            nodes[i] = new Node(i);
        }
    }
    void init(int a, int b){    // Graph초기화 메소드
        if(nodes[a] == null)
            nodes[a] = new Node(a);
        
        if(nodes[b] == null)
                nodes[b] = new Node(b);
                
        this.nodes[a].adjacencyList.add(nodes[b]);
        this.nodes[b].adjacencyList.add(nodes[a]);
        Node[] temp =  this.nodes[a].adjacencyList.toArray(new Node[this.nodes[a].adjacencyList.size()]);
        Arrays.sort(temp);
        this.nodes[a].adjacencyList = new LinkedList(Arrays.asList(temp));
    }
    @Override
    public String toString(){
        return Arrays.toString(nodes);
    }
}
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
	    Graph graph = new Graph(N);
	    graph.init(N);
	    for(int i=0;i<M;i++){
	        st = new StringTokenizer(br.readLine(), " ");
	        graph.init(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
	    }
		System.out.println(graph);  // 그래프의 노드 출력
		graph.printAdjacencyList();
		DFS dfs = new DFS(graph);
		graph.nodes[1].marked = true;
		dfs.print_DFS_Search(1);
		dfs.setFalse();
		System.out.println("===============");
		BFS bfs = new BFS(graph);
		graph.nodes[1].marked = true;
		bfs.print_BFS_Search(1);
	}
}
