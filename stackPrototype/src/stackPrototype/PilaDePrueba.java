package stackPrototype;
import javax.swing.JOptionPane;
public class PilaDePrueba<T2> {
	nodo UltimoDato;
	int tamaño;
	String Lista="";
	public PilaDePrueba(){
		UltimoDato=null;
		tamaño=0;
	}
		nodo end;
	public boolean isEmpty() {
		return UltimoDato==null;
	}
	public void Push(T2 dato){
			nodo nuevoNodo= new nodo(dato);
			nuevoNodo.nodoSiguiente= UltimoDato;
			UltimoDato=nuevoNodo;
			tamaño +=1;
		}
	nodo elementoEliminado= new nodo(null);
	public void pop() {
		
		elementoEliminado= UltimoDato;
		UltimoDato= UltimoDato.nodoSiguiente;
		tamaño -=1;		
	}
	public int tamañoPila() {
		return tamaño;
	}
	public void VaciarPila() {
		while (!isEmpty()) {
			pop();
		}
	}
	public void MostrarPila() {
		nodo recorrido = UltimoDato;
		while(recorrido !=null) {
			Lista += recorrido.dato+"\n";
			recorrido= recorrido.nodoSiguiente;
			
		}
		JOptionPane.showMessageDialog(null,Lista);
		Lista="";
	}
	
	}

