public class CircularDoublyLinkedList {

    /*
        El nodo header sirve como referencia ya que estara siempre al inicio de la lista y uno de sus dos
        aountadores siempre debera apuntar al final de la lista
    */
    Node header = null;
    /*
        El nodo last sirve como referencia ya que estara siempre al final de la lista y uno de sus
        apuntadores siempre debera apuntar al inicio de la lista
    */
    Node last = null;
    /*Tamaño de la lista*/
    int size;

    CircularDoublyLinkedList() {
        size = 0;
    }

    boolean isEmpty(){
        return header == null;
    }

    /*
        Añade un nuevo nodo a la lista, el nuevo nodo debera estar conectado el nodo que esta al inicio de la lista
        y el nodo inicial debera de tener un apuntador que indique al ultimo nuevo nodo
    */
    void add(int number){
        Node node = new Node(number);

        if ( isEmpty() ){
            header = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        last.next = header;
        header.prev = last;
        size++;
    }

    /*
        Muestra el contenido de la lista empezando desde el fimal hasta el inicio. Al reves
    */
    void showInverse(){
        Node node = last;
        do {
            System.out.println( node.getNumber() );
            node = node.prev;
        }while (node != last);
    }

    /*
        Muestra el contenido de la lista de forma ordenada
    */
    void show(){
        Node node = header;
        do {
            System.out.println( node.getNumber() );
            node = node.next;
        }while (node != header);
    }

    /*
         Buscamos el nodo que corresponda al numero, si existe entonces retornamos el Nodo sino
         simplemente retornamos null indicando que no existe el nodo
    */
    Node search(int number){
        Node node = header;
        do {
            if (number == node.number)
                return node;
            node = node.next;
        }while (node != header);

        return null;
    }

    /*
        El metodo eliminar se compone de tres partes, elimina al inicio, elimina al final y si no cumple
        con ninguno de los casos entonces elimina en medio, el proceso de eliminacion seguira hasta que
        se hayan eliminado todos los nodos que coincidan con el numero
    */
    void delete (int number) {

        /*
            Este metodo se repite hasta que no exista ningun nodo al principio de la lista que coincida
            con las caracteristicas que se buscan eliminar
        */
        while (header.number == number)
            deleteFirst();

        /*
            Este metodo elimina los nodos mientras esten al final de la lista que coincidan con las caracteristicas
            que se buscan eliminar
        */
        while (last.number == number)
            deleteLast();

        /*
            Si no esta al principio ni al final de la lista entonces se elimina de en medio, es impotante que cuando
            se elimina un nodo entonces se deben establecer las nuevas conexiones de los apuntadores (prev y next)
        */
        for (Node aux = header; aux != last; aux = aux.next)
            while(aux.next.number == number) {
                aux.next = aux.next.next;
                aux.next.prev = aux;
                size--;
            }
    }

    /*
        Al ser una lista doblemente ligada circular entonces cuando se elimina un nodo del inicio el nuevo nodo
        que lo sustituye debe apuntar al final de la lista y el nodo que esta al final de la lista ahora debe de
        apuntar al nuevo nodo que esta al incio
    */
    void deleteFirst () {
        if (isValid()){
            header = header.next;
            last.next = header;
            header.prev = last;
            size--;
        }
    }

    /*
        Cuando se elimina al final de la lista, el penultimo nodo ahora se convierte en el ultimo nodo, por lo
        tanto, el nuevo nodo que esta al final de la lista ahora debe de apuntar al nodo que esta al inicio de
        la lista y el nodo que se encuenra al inicio de la lista ahora debra apuntar al nuevo nodo que esta al final
    */
    void deleteLast () {
        if (isValid()) {
            last = last.prev;
            last.next = header;
            header.prev = last;
            size--;
        }
    }

    boolean isValid () {
        if ( isEmpty() ){
            System.out.println("List Empty");
        } else if (header == last){
            header = last = null;
            size = 0;
        }
        return header != null;
    }

    int getSize () {
        return size;
    }

}
