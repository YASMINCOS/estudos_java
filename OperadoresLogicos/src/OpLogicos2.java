
public class OpLogicos2 {

	public static void main(String[] args) {
		int x,y,z;
		x=4;
		y=7;
		z=12;
		boolean r,ou,ouex;
		r=(x<y && y==z)? true: false;
		System.out.println(r);
		
		ou=(x<y || y==z)? true: false;
		System.out.println(ou);
		
		ouex=(x<y ^ y==z)? true: false;
		System.out.println(ouex);
	}
}
