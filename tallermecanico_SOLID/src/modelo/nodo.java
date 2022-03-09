
package modelo;

import registros.Register;

public class nodo {
    public Register data;
    public nodo next;
    public nodo(Register p){
        data = p;
        next = null;
    }

    public nodo() {
    }

    public Register getData() {
        return data;
    }

    public nodo getNext() {
        return next;
    }

    public void setData(Register data) {
        this.data = data;
    }

    public void setNext(nodo next) {
        this.next = next;
    }
    
}
