import java.util.ArrayList;
import java.util.Random;

public class p4 {

	public static void main(String[] args) {
		
		Random y = new Random();
		ArrayList<Integer> x = new ArrayList<>();
		int n = 10;
		for (int i = 0; i<n; i++){
			x.add(y.nextInt(n));
		}
		System.out.println("Original List: "+x);
		sort(x);
		System.out.println("Sorted List: " + x);
	}
	//Problem 4
	public static <E> void sort(ArrayList<E> myList){
		if (myList.size() > 1) {     
			ArrayList<E> a1, a2; 

			a1 = new ArrayList<E>(); 
			a2 = new ArrayList<E>(); 
			for(int i= 0 ; i<myList.size()/2; i++){
				a1.add(myList.get(i));
			}

			for(int i= myList.size()/2 ; i<myList.size(); i++){
				a2.add(myList.get(i));
			}

			sort(a1);    
			sort(a2);    
			int i = 0, j = 0;
			while (i + j < myList.size()) {
				if (j == a2.size() || (i < a1.size() && (((Comparable<E>) a1.get(i)).compareTo(a2.get(j)) < 0)))
					myList.set(i + j, a1.get(i++));

				else
					myList.set(i+j, a2.get(j++));
			}

		}
	}
	
	
	
	
	
	
	
	
	
	

	public static <E> void  sort(Queue<E> q){    
		   if (q.size() > 1) {  
		      Queue<E> q1, q2; 
		     
		      q1 = new ArrayQueue<>(); 
		      q2 = new ArrayQueue<>(); 

		     
		      int n = q.size(); 
		      for (int i=0; i<n/2; i++) 
		          q1.enqueue(q.dequeue()); 
		      while (!q.isEmpty())
		          q2.enqueue(q.dequeue()); 

		      sort(q1);    
		      sort(q2);    

		      while (!q1.isEmpty() && !q2.isEmpty())
		          if (((Comparable<E>) q1.first()).compareTo(q2.first()) <= 0)
		             q.enqueue(q1.dequeue()); 
		          else 
		             q.enqueue(q2.dequeue()); 
		     
		      Queue<E> r = (!q1.isEmpty() ? q1 : q2);  
		      while (!r.isEmpty())
		          q.enqueue(r.dequeue()); 
		     } 
		}


}
