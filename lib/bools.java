
package lib;
public class bools {
	public boolean Primo (int x) {
		boolean primo=true;
		int divisor=2;
		while ((divisor<x) && (primo==true)) {
			if ((x%divisor)==0) {
				primo=false;
			}
			divisor++;
		}
		return primo;
	}
}
