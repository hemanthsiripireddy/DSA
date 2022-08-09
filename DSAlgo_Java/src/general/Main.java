package general;

public class Main {

	public static void main(String[] args) {
	TopologicalSorting tp=new TopologicalSorting(5);
	tp.initialize(5);
	tp.addEdge(0, 1);
	tp.addEdge(0, 2);
	tp.addEdge(2, 1);
	tp.addEdge(1, 3);
	tp.addEdge(1, 4);
	tp.addEdge(3, 4);
	tp.dfs(5);
	tp.print();
	

	}
	

}
