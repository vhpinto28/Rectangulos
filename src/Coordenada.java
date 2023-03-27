
import java.util.*;
public class Coordenada{
private double x;
private double y;
private Coordenada c;
 //Constructor, initialize x, y attributes to zero
public Coordenada( ){
	x=0;
	y=0;
}
//Constructor
public Coordenada(double x, double y ){
	this.x = x;
	this.y = y;
}
//Constructor
public Coordenada(Coordenada c ){
	this.c=c;
}
//Metodos setter
void setX(double x) {
	this.x =x;
}
void setY(double y){
	this.y =y;
}
//métodos getter
double getX(){
 return x;
}
double getY(){
 return y;
}
//método que calcula la distancia euclideana
public double distancia(Coordenada c){
	double DistX, DistY, distancia;
    DistX=c .getX();
    DistY=c .getY();
    distancia=DistX-DistY;
    if (distancia<0){
          distancia=distancia*-1;
     }
     return distancia;
}

//método de clase que calcula la distancia euclideana
public static double distancia(Coordenada c1, Coordenada c2){
    double DistX = 0,DistY=0,distancia;
    DistX=c1.getX()-c2.getX();
    DistX=c1.getY()-c2.getY();
    
   //obtener valores absolutos
   if(DistX<0){
      DistX=DistX*-1;
    }
   if(DistY<0){
      DistY=DistX*-1;
     }
     distancia=Math.sqrt(DistX*DistX+DistY*DistY);
      return distancia;
}
//método que devuelve los valores de una coordenada 
public String toString(){
	return"("+x + ";" + y + ")";
}
}
