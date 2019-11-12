import org.graphstream.graph.Graph;

public class matrizADJ {

	private int nodeCount;
	private Graph grafo;
	private byte adjMatriz[][];

	public void criarMatriz(Graph grafo, int tam)
	{
		setNodeCount(tam);
		this.adjMatriz = new byte[getNodeCount()][getNodeCount()];
		for(int i = 0; i < getNodeCount(); i++)
		{
			for(int j = 0; j < getNodeCount(); j++)
			{
				this.adjMatriz[i][j] = (byte) (grafo.getNode(i).hasEdgeBetween(j) ? 1 : 0);
			}
		}
	}
	
	public void imprimirMatriz()
	{
		for(int i = 0; i < getNodeCount(); i++)
		{
			for(int j = 0; j < getNodeCount(); j++)
			{
				System.out.print(adjMatriz[i][j] + " ");
			}
			System.out.println();
		}
			
	}

	public int getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(int nodeCount) {
		this.nodeCount = nodeCount;
	}

	public Graph getGrafo() {
		return grafo;
	}

	public void setGrafo(Graph grafo) {
		this.grafo = grafo;
	}

	public byte[][] getAdjMatriz() {
		return adjMatriz;
	}

	public void setAdjMatriz(byte[][] adjMatriz) {
		this.adjMatriz = adjMatriz;
	}
}
