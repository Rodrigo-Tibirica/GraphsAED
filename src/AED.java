
import java.util.Collection;
import java.util.Iterator;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;


public class AED {
	
	public static void main(String[] args) {
		
		Graph Europa = new MultiGraph("Europa");
		
		Europa.addNode("Paris");
		Europa.addNode("Londres");
		Europa.addNode("Lisboa");
		Europa.addNode("Berlim");
		Europa.addNode("Veneza");
		Europa.addNode("Helsinque");
		Europa.addEdge("Paris-Londres", "Paris", "Londres", true);
		Europa.addEdge("Londres-Lisboa", "Londres", "Lisboa");
		Europa.addEdge("Lisboa-Berlim", "Lisboa", "Berlim");
		Europa.addEdge("Berlim-Veneza", "Berlim", "Veneza");
		Europa.addEdge("Veneza-Helsinque","Veneza", "Helsinque");
		Europa.addEdge("Helsinque-Paris","Helsinque", "Paris");
		
		
		Node A = Europa.getNode("Paris");
		Edge E = Europa.getEdge("Paris-Londres");
		//System.out.println(A.getDegree());
		//System.out.println(A.getId());
		//System.out.println(A.hasEdgeToward("Berlim"));
		//System.out.println(E.isDirected());
		
		for(Edge n:Europa.getEachEdge())
		{
			System.out.println(n.getId());
		}
		
		matrizADJ adjunta = new matrizADJ();
		adjunta.criarMatriz(Europa, Europa.getNodeCount());
		adjunta.imprimirMatriz();
		for(int i = 0; i < Europa.getNodeCount(); i++)
		{
			Node node = Europa.getNode(i);
			node.addAttribute("ui.label", node.getId());
			//System.out.println(node);
		}
		Europa.display();
	}

}
