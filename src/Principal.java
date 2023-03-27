import java.util.Scanner;
public class Principal {
 public static void main(String[] args) {
 Scanner Scanner = new Scanner(System.in);
 Rectangulo ArreRectan[]=new Rectangulo[20];
 Coordenada ArreCord[]=new Coordenada[50];
 int i;
 double X,Y;
 Coordenada C1=new Coordenada(7.7,2.2);
 Coordenada C2=new Coordenada(1.5,0.3);
 Rectangulo Rec1=new Rectangulo(C1,C2);
 Coordenada C3=new Coordenada(9.4,-2.5);
 Coordenada C4=new Coordenada(4.0,4.2);
 Rectangulo Rec2=new Rectangulo(C3,C4);
ContainerRect Cont1= new ContainerRect(Rec1,Coordenada.distancia(C1, 
C2),Rec1.calculoArea(C1, C2),0);
 
 System.out.println("Cuantos rectangulos desea ingresar?");
 int n = Scanner.nextInt();
 Cont1.setN(n);
 for (i=0;i<n;i++){
 
 System.out.print("Ingrese una esquina del 1er rectangulo: ");
 X = Scanner.nextDouble();
 Y = Scanner.nextDouble();
 System.out.println();
 ArreCord[i*4]=new Coordenada(X,Y);
 
 System.out.print("Ingrese la esquina opuesta del 1er rectangulo: ");
 X = Scanner.nextDouble();
 Y = Scanner.nextDouble();
 System.out.println();
 ArreCord[(i*4)+1]=new Coordenada(X,Y);
 
 ArreRectan[(i*2)]=new Rectangulo(ArreCord[i*4],ArreCord[(i*4)+1]);
 
 System.out.print("Ingrese una esquina del 2do rectangulo:");
 X = Scanner.nextDouble();
 Y = Scanner.nextDouble();
 System.out.println();
 ArreCord[(i*4)+2]=new Coordenada(X,Y);
 
 System.out.print("Ingrese la esquina opuesta del 2do rectangulo:");
 X = Scanner.nextDouble();
 Y = Scanner.nextDouble();
 System.out.println();
 ArreCord[(i*4)+3]=new Coordenada(X,Y);
 ArreRectan[(i*2)+1]=new Rectangulo(ArreCord[(i*4)+2],ArreCord[(i*4)+3]);
 
 System.out.println("Rectangulo A="+ArreRectan[i*2].toString());
 System.out.println("Rectangulo B="+ArreRectan[(i*2)+1].toString());
 Verificador V1=new Verificador(ArreRectan[i*2],ArreRectan[(i*2)+1]);
 V1.Verific(ArreRectan[i*2], ArreRectan[(i*2)+1]);
 }
 }
}