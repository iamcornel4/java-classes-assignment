package iamcornel4;
class Pclass{
	public void pmethod () {
	System.out.println("This is parent class");
}
}
class Cclass extends Pclass{
	public void cmethod() {
		System.out.println("This is child class");
		
	}
}
public class Q1 {
	public static void main(String [] args ) {
		Pclass a = new Pclass();
		Cclass b = new Cclass();
		a.pmethod();
		b.cmethod();
		b.pmethod();
	}

}
