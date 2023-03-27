
public class ContainerRect {
	int n,numRec,i;
	 int arrN[]=new int[20];
	 Rectangulo arrRec[]=new Rectangulo[20];
	 double arrDist[]=new double[20];
	 double arrArea[]=new double[20];
	 public ContainerRect(Rectangulo R, double dist, double area, int i){
	 this.i=i;
	 arrRec[i]=R;
	 arrDist[i]=dist;
	 arrArea[i]=area;
	 
	 }
	 public int getN() {
	 return n;
	 }
	 public void setN(int n) {
	 this.n = n;
	 }
	 
	 public String toString(int i) {
	 
	 return this.i+"["+arrRec[i]+"]"+"["+arrDist[i]+"]"+"["+arrArea[i]+"]";
	 }

}