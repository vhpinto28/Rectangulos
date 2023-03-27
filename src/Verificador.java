
public class Verificador {
 private Rectangulo R1;
 private Rectangulo R2;
 private Verificador V1;
 public Verificador(Rectangulo R1, 
Rectangulo R2) {
 setR1(R1);
 setR2(R2);
 }
 public void setR1 (Rectangulo R1) {
 this.R1=R1;
 }
 public void setR2 (Rectangulo R2) {
 this.R2=R2;
 }
 public String Verific(Rectangulo R1,Rectangulo R2) {
		  int i,j;
		  double array[]=new double[4];
		  Rectangulo auxR;
		  Coordenada Esq1,Esq2,Esq3,Esq4;
		  double X1,X2,X3,X4,Y1,Y2,Y3,Y4,aux = 0;
		  Esq1=R1.getEsquina1();
		  X1=Esq1.getX();
		  Y1=Esq1.getY();
		  Esq2=R1.getEsquina2();
		  X2=Esq2.getX();
		  Y2=Esq2.getY();
		  Esq3=R2.getEsquina1();
		  X3=Esq3.getX();
		  Y3=Esq3.getY();
		  Esq4=R2.getEsquina2();
		  X4=Esq4.getX();
		  Y4=Esq4.getY();
		  X4=aux;
		  
 		if (X2>X3||Y2>Y3){ 
 			System.out.print("Rectangulos A y B se sobreponen");
 			System.out.print("El Area es: "+ R1.calculoArea(Esq1, Esq2)+"");
	 }
 			else if(X2==X3||Y2==Y3){
 				System.out.print("Rectangulos A y B se juntan");
 				System.out.print("El Area es: "+ R1.calculoArea(Esq1, Esq2)+"");
	 }
 			else{ 
 				 array[0]=X1;
 				 array[1]=X2;
 				 array[2]=X3;
 				 array[3]=X4;
 				 for(i=0;i<array.length-1;i++){
 					 for(j=0;j<array.length-i-1;j++){
 						 if(array[j+1]<array[j]){
 							 aux=array[j+1];
 							 array[j+1]=array[j];
 							 array[j]=aux;
 				 }
 		}
 		}
 				 X1=array[1];
 				 X2=array[2];
 				 array[0]=Y1;
 				 array[1]=Y2;
 				 array[2]=Y3;
 				 array[3]=Y4;
 				 for(i=0;i<array.length-1;i++){
 				 for(j=0;j<array.length-i-1;j++){
 				 if(array[j+1]<array[j]){
 				 aux=array[j+1];
 				 array[j+1]=array[j];
 				 array[j]=aux;
 				 }
 				 }
 				 }
 				 Y1=array[1];
 				 Y2=array[2];
 		//variables se almacenaron en X1 Y1 X2 Y2
 				 Esq1.setX(X1);
 				 Esq1.setY(Y1);
 				 Esq2.setX(X2);
 				 Esq2.setY(Y2);
 				 R1.setEsquina1(Esq1);
 				 R1.setEsquina2(Esq2);
 				 if (R1.calculoArea(Esq1, Esq2)==0)
 				{
 				 System.out.print("Rectangulos A y B se juntan");
 				 }
 				 else{
 				 System.out.print("Rectangulos A y B son disjuntos");
 				 System.out.print("El Area es: "+ R1.calculoArea(Esq1, Esq2)+"");
 				 }
 			}
 		 return "error";
 		 }


}
