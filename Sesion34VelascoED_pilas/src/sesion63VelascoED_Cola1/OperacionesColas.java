//clase para logica de negocio -Programacuion contiene los metodos de operaciones de las colas
package sesion63VelascoED_Cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {//inicia clase
    //Estructura inicial y final de la ED cola
    private int frente;
    private int fin;
    protected Object[] listaCola;

    public OperacionesColas(int tamMax) {//constructor que pasa parametros inicio y fin a la cola
        frente = 0;
        fin = -1;
        listaCola = new Object[tamMax];
                JOptionPane.showMessageDialog(null, "Operaciones colas");
    }//constructor inidica y autoriza quien va al fre y quien va al fin
       
      public void insertar(Object dato) throws Exception {//inicia el metodo para insertar nuevos elementos
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
                        JOptionPane.showMessageDialog(null, "Insertar ");
        } else {
            throw new Exception("Error en la cola: Cola LLena");
        }
    }//termina para insertar  
        public int tamMax() {//determina el tamaño de los elementos ED cola
        return listaCola.length;
    }//termina metodo para el numero de elementos

        public boolean colaLlena() {//metodo que indica que cola esta llena
        return fin == tamMax() - 1;
    }//termina el metodos para indicar que cola esta llena
public boolean colaVacia() {//metodo que indica que cola esta vacia
        return frente > fin;
    }//metodo que indica que cola esta vacia
        public void imprimir() {//metodo para imprimir
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];

            if (datoActual != null) {
                 JOptionPane.showMessageDialog(null, "Cola esta LLena de valores \n"+(datoActual)+ ", ");
            }
        }
    }//termina metodo para imprimir
       
       
        public int contarDatos() {//inicia el metodo de contar datos
        int contador = 0;

        for (int i = 0; i < tamMax(); i++) {
            if (listaCola[i] != null) {
                contador++;
            }
        }

        return contador;
    }    
}//termina clase
