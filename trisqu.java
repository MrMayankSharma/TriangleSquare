public class trisqu{
   public static void main(String[] args) {

	Triangle[] tr = new Triangle[3];
	tr[0] = new Triangle(4,9,12);
    tr[1] = new Triangle(9,16,25);
    tr[2] = new Triangle(8,12,14);
    for (int i=0;i<tr.length;i++){
    	System.out.println("Triangle Object :"+(i+1)+" ");
        tr[i].print();
    	}
    
	
	
	Square[] sq = new Square[3];
	sq[0] = new Square(8);
	sq[1] = new Square(32);
	sq[2] = new Square(16);
	for (int i=0;i<sq.length;i++){
		System.out.println("Square Object : "+(i+1)+ " ");
	    sq[i].print();
	}
 }
}

