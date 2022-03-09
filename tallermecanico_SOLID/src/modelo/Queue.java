package modelo;

import javax.swing.JOptionPane;
import registros.Register;

public class Queue {

    nodo header;
    nodo last;

    public Queue() {
        header = new nodo(null);
        last = new nodo(null);

    }

    public void add(Register regiter) {
        if (emptyQueue()) {
            nodo newQueue = new nodo(regiter);
            newQueue.next = null;
            header.next = newQueue;
            last.next = newQueue;
        } else {
            nodo newQueue = new nodo(regiter);
            newQueue.next = last.next;
            last.next = newQueue;
        }

    }

    public void pop() {
        nodo delete = header.next;
        if (header.next == last.next) {
            header.next = null;
            last.next = null;
        } else {
            nodo aux = last;
            while (aux.next != delete) {
                aux = aux.next;
            }
            aux.next = null;
            header.next = aux;
        }

    }

    

    public void showAll() {
        if (emptyQueue()) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
        } else {
            nodo reco = last.next;
            while (reco != null) {
                JOptionPane.showConfirmDialog(null, reco.getData().toString());
                reco = reco.next;
            }
        }
    }




    public boolean emptyQueue() {
        if (header.next == null) {
            return true;
        } else {
            return false;
        }
    }

}
