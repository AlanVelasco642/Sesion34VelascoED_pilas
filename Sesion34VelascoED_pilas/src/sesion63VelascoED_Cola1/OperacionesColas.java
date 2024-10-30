//clase para logica de negocio -Programacuion contiene los metodos de operaciones de las colas
package sesion63VelascoED_Cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {//inicia clase
    //Atributos y caracteristicas de las colas
    private int frente;
    private int fin;
    protected Object[] listaCola;
    //constructor que inicializa los componenetes principales de las colas
    public OperacionesColas(int tamMax) {//inicia constructor
        this.frente=0;
        this.fin=-1;
        listaCola= new Object[tamMax];
    }//termina constructor
    //metodo insertar los elementos de la estructura cola
    public void insertar(Object dato)throws Exception{
        if (!colaLlena()) {
            fin++;
            listaCola[fin]=dato;
        } else {
            JOptionPane.showMessageDialog(null, "Error 1 al insertar: Cola llena");
        }
        
    }
    //metodo para identificar cola llena
    public boolean colaLlena(){
        int tamMax=0;
        return fin == tamMax-1;
    }//metodo para identificar cola llena
    
     //tamaño de la ED cola
    public int tamMax(){
        return listaCola.length;
    }//tamaño de la ED cola
    
    //metodo para imprimir elementos de la cola
    public void imprimr(){
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual=listaCola[i];
            if (datoActual!=null) {
                JOptionPane.showMessageDialog(null, datoActual+"  :  ");               
            }
            
        }
    }
    
}//termina clase
