import java.util.ArrayList;

public class SLL<E> {
	private static class Node<E> {
		private E element; 
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public Node(E element) { this(element, null); } 
		public Node() { this(null, null); }
		public E getElement() { return element; }
		public void setElement(E element) { this.element = element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> next) { this.next = next; }	
	
		public String toString(){
			return ""+element;
		}
	}

	private Node<E> first = null; 
	private int size = 0; 	
	public void addFirst(E e) { 
		first = new Node<>(e, first); 
		size++; 
	}
	
    
	public String toString() { 
		String s = ""; 
		Node<E> current = first; 
		while (current != null) { 
			s += " " + current.getElement(); 
			current = current.getNext(); 
		}
		return s; 
	}	
	
	
	//EXERCISE 2 
	public void reverse(){
		if(size>1){
			first = recReverse(first).getFirst();
		}
	}
	public Pair<Node<E>> recReverse(Node<E> first){
		Node<E> next = first.getNext();
		if(next == null){
			Pair<Node<E>> ptr = new Pair<>(first,first);
			this.first = first;
			return ptr;
		}
		else{
			Pair<Node<E>> wPair = recReverse(next);
			wPair.second().setNext(first);
			first.setNext(null);
			wPair.setSecond(first);
			return wPair;
		}
	}

	
	public ArrayList<E> lessThan(E e) { 
		   ArrayList<E> result = new ArrayList<>();     
		   if (size > 0) 
		      recLessThan(first, e, result);   
		   return result; 
		}
	private void recLessThan(Node<E> fr, E e, ArrayList<E> result) { 
		   if (fr != null) { 
		      if (((Comparable<E>) fr.getElement()).compareTo(e) < 0)
		         result.add(e); 
		      recLessThan(fr.getNext(), e, result); 
		   }
		} 

	//Problem 3
	public ArrayList<Pair<E>> consecutiveIncreasingPairs() { 
		   ArrayList<Pair<E>> result = new ArrayList<>();    
		   if (size > 0) 
		      recCIP(first, result); 
		   return result; 
		}
	public void recCIP(Node<E> first, ArrayList<Pair<E>> result){
		if((first!=null && first.getNext()!= null)){
			 if (((Comparable<E>) first.getElement()).compareTo(first.getNext().getElement()) < 0)
			 	result.add(new Pair<E>(first.getElement(), first.getNext().getElement()));
			 recCIP(first.getNext(),result);
		}		
	}
	
	

	


	

}
