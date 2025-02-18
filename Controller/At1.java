package Controller;

public class At1 {

	public static void main(String[] args) {
		
	}
	
	public int multi_sem_mult(int x, int y) {
		
		if (y == 0){
			return y;
		}
		else {
			
			return x +  multi_sem_mult(x, y-1);
			
		}
	}

}
