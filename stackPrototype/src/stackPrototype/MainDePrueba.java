package stackPrototype;
import javax.swing.JOptionPane;
public class MainDePrueba {

	public static void main(String[] args) {
		int opcion=0;
		String nombreProducto="";
		PilaDePrueba pila = new PilaDePrueba();
		do {
			try {
				opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
						"Menu de opciones\n\n"
						+"1. Insertar un nodo\n"
						+"2. Eliminar un nodo\n"
						+"3.la pila está vacía?\n"
						+"4. mostrar ultimo valor ingresado\n"
						+"5. ¿Cuantos nodos tien la pila?\n"
						+"6. Vaciar pila\n"
						+"7. mostrar contenido de la pila\n"
						+"8. Salir.\n\n"));
				switch(opcion) {
				case 1:
					nombreProducto= JOptionPane.showInputDialog(null,"ingresar valor a guardar en el nodo");
					//Producto productoNuevo= new Producto();
					//productoNuevo.setNombre(nombreProducto);
					pila.Push(nombreProducto);
					
					break;
				case 2:
					if(!pila.isEmpty()) {
						JOptionPane.showMessageDialog(null, "se ha eliminado un nodo con valor: "+pila.elementoEliminado);
					}
					else{
						JOptionPane.showMessageDialog(null, "la pila está vacía");
					}
					break;
				case 3:
					if(pila.isEmpty()) {
						JOptionPane.showMessageDialog(null, "la pila está vacía");
					}
					else {
						JOptionPane.showMessageDialog(null, "la pila no está vacía");
					}
					break;
				case 4:
					if(!pila.isEmpty()) {
						JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila es"
								+ pila.UltimoDato.dato);//importante el .dato del final
					}
					else {
						JOptionPane.showMessageDialog(null, "la pila está vacía");
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "la pila tiene"+pila.tamaño+" nodos");
					break;
				case 6:
					if(!pila.isEmpty()) {
						pila.VaciarPila();
						JOptionPane.showMessageDialog(null, "se ha vaciado la pila");
					}
					else {
						JOptionPane.showMessageDialog(null, "la pila está vacia");
					}
					break;
				case 7:
					pila.MostrarPila();
					break;
				case 8:
					opcion=8;
					break;
				default:
						JOptionPane.showMessageDialog(null,"opción inválida");
				}
			}
			catch(NumberFormatException e){
				
			}
		}while(opcion!=8); 
	}

}
