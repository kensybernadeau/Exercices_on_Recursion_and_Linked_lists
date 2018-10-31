
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
			
				// TODO Auto-generated method stub
				System.out.println("Testing Implementation A:");
				double a=System.nanoTime();
				System.out.println(" "+fibA(40)+"  ");
				double b=System.nanoTime();
				System.out.println("Time="+(b-a)+" ns");
				
				
				System.out.println("Testing Implementation B:");
				double c=System.nanoTime();
				System.out.println(" "+fibB(40)+"  ");
				double d=System.nanoTime();
				System.out.println("Time="+(d-c)+" ns");
			
			
		

	}

	public static long fibA(int n){
					if (n == 1 || n == 0) return 1; 
					   else return fibA(n-1) + fibA(n-2);
				}
				public static Pair<Long> fibB(int n){
					if (n==0 || n==1) return new Pair<Long>(1L, 1L);
					
					  Pair<Long> p = fibB(n-1); 
					  return new Pair(p.getFirst() + p.second(), p.getFirst());
				}

}
