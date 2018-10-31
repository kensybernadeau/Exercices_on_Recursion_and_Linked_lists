

public class Pair<E> {
	private E first; 
	private E second; 
	public E getFirst() { return first;}
	public void first(E first) { this.first = first;}
	public void setSecond(E second) { this.second = second;}
	public E second() { return second;}
	public Pair(E first, E second) {super();  this.first = first;  this.second = second; }
	public Pair() {}
	
	public String toString(){
		return "("+first+","+second+")";
	}
}
