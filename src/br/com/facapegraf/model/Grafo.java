package br.com.facapegraf.model;
import java.util.ArrayList;
import java.util.List;

/**Class de Objetos do tipo Grafo, onde conter� as listas de V�rtices e Arestas, e suas Condi��es.

 * @author Lucas Barros e Marcus Vinicius

 * @version 1.00

 */

public class Grafo {
	
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private List<Vertice> vertices = new ArrayList<Vertice>();
	
	// Adinionar Aresta. Ao incluir uma aresta obrigat�riamente, inclui-se dois v�rtices
	
	public Grafo(){
		
	}
	
	/** Adicionar uma Aresta ao Grafo
     * @param Valor Vertice 1 e Valor Vertice 2
     */	
	public void addAresta(int V1, int V2){
		
		Vertice v1 = AddVertice(V1); 
		Vertice v2 = AddVertice(V2); 
		
		Aresta a = new Aresta(v1,v2);
		

		if(!arestas.contains(a)){
			arestas.add(a);
			v1.getArestas().add(a); 
			v2.getArestas().add(a);
		}			
	}
	
	/** Adicionar uma Aresta ao Grafo
     * @param Objeto Vertice 1 e Objeto Vertice 2 
     */	
	
	public void addAresta(Vertice V1, Vertice V2){
		
		Vertice v1 = AddVertice(V1.getValor()); 
		Vertice v2 = AddVertice(V2.getValor()); 
		
		Aresta a = new Aresta(v1,v2);
		

		if(!arestas.contains(a)){
			arestas.add(a);
			v1.getArestas().add(a); 
			v2.getArestas().add(a);
		}			
	}
	
	/**
	 * @param Objeto Aresta
	*/
	
	public void AddAresta(Aresta a){
		addAresta(a.getV1(), a.getV2());
	}
	
	/** M�todo para adicionar um v�rtice ao gr�fo Valor
	 *   @param Valor Vertice 1 
     *   @return Valor do v�rtice 1
     */
	
	public Vertice AddVertice(int V){	 	
		Vertice v1 = new Vertice(V);		
		if(!vertices.contains(v1)){
			vertices.add(v1);
		}	
		return v1;		
	}
	
	/** M�todo para adicionar um v�rtice ao gr�fo Objeto
	*   @param Objeto Vertice
    *   @return v�rtice 1
    */
	
	public Vertice AddVertice(Vertice V){	 	
		Vertice v1 = AddVertice(V.getValor());
		
		if(!vertices.contains(v1)){
			vertices.add(v1);
		}	
		return v1;		
	}
	
	/** M�todo para retornar uma lista de Aresta do Grafo
     *
     *   @return Lista de arestas do Grafo
     */
	
	public List<Aresta> getArestas() {
		return arestas;
	}
	
	/** M�todo para adicionar uma lista de Aresta ao Grafo
     *
     * @param List<Aresta> = Lista de Arestas.
     */
	
	public void setAretas(List<Aresta> arestas) {
		//this.arestas = arestas;
		for (Aresta aresta : arestas) {
			AddAresta(aresta);
		}
	}
	
	/** M�todo para retornar uma lista de v�rtices do Grafo
	 *
     *   @return Lista de vertives
     */
	
	public List<Vertice> getVertices() {
		return vertices;
	}
	
	/** M�todo para adicionar uma lista de V�rtices ao Grafo
     *
     * @param List<Vertice> => Lista de vertices
     */	
	public void setVertices(List<Vertice> vertices) {
		//this.vertices = vertices;
		for (Vertice vertice : vertices) {
			AddVertice(vertice);
		}
	}
}