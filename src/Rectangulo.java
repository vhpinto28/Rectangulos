
import java.util.*;
public class Rectangulo {
	private Coordenada esquina1; //Definicion de tipo de variables
	private Coordenada esquina2;
	private Rectangulo R1;
	// Constructor de rectangulo 
	public Rectangulo(Coordenada c1, Coordenada c2) {
	setEsquina1(c1);
	setEsquina2(c2);
	}
 	public Rectangulo() {
	this.R1=R1;
	}
	void setR(Rectangulo R1) {
	this.R1=R1;
	}
	public void setEsquina1 (Coordenada coo) {
	this.esquina1=coo;
	}
	public void setEsquina2 (Coordenada coo) {
	this.esquina2=coo;
	}
	public Coordenada getEsquina1 () {
	return esquina1;
	}
	Coordenada getEsquina2 () {
	return esquina2;
	}
	public double calculoArea(Coordenada c1, Coordenada c2) {
	double area,Y,X;
 	X=c1.getX()-c2.getX();
	Y=c1.getY()-c2.getY();
		if (X<0) {
		X=X*-1;
	}
	if(Y<0) {
		Y=Y*-1;
	}
	area=X*Y;
	return area;
	}
	public String toString() {
	return"["+this.esquina1+";"+this.esquina2+"]";
}
}
