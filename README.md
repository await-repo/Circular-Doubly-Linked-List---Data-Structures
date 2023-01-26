## **Lista Circular Doblemente Ligada**

El proyecto contiene las siguientes clases:

* **`CircularDoublyLinkedList`** donde se establece la lógica de la lista circular doblemente ligada.
* **`Node`** contiene la informacion de un nodo.
* **`test`** prueba un ejemplo para observar el funcionamiento de la lista circular simple ligada.

### **Tipo de Lista**

A continuación describimos las caracteristicas de una Lista Simple Doblemente Ligada.

**Lista Circular** En la siguiente imagen vemos que en la lista circular se conecta el inicio con el final (Pueden tener un enlace o dos enlaces dependiendo del tipo de Nodo)

![DoublyCircularLinkedList1](https://user-images.githubusercontent.com/115047831/214826033-77941458-5457-400e-9c7f-a1975a5a821d.png)

### **Tipo de Nodo**

Un **Nodo Doble** tiene dos apuntadores, el primero es el nodo previo y apuntará a el nodo que esta antes de él en la lista, el segundo es el nodo siguiente y apuntara al inmediato depués de él. En una lista circular doblemente ligada el primer nodo de la lista en su nodo previo apunta el último elemento de la lista mientras que el último nodo de la lista apunta con su nodo siguiente al primer nodo.

![Doble](https://user-images.githubusercontent.com/115047831/207787603-10792991-6d67-4c03-953a-11ed90acd389.png)

## Agregar Nodo

**Cuando agregamos un nuevo Nodo siempre se añadira al final de la Lista. En una lista circular el último nodo debe apuntar al inicio de la lista.**

Tenemos la siguiente lista con los siguientes nodos: El Nodo 1 (Naranja) es el primero nodo en la lista **(Header)**, el Nodo 2 (Azul), el Nodo 3 (Verde) y el Nodo 4 (Rojo) el cual es el último nodo **(Last)**. Notese como en las listas circulares ningún nodo apunta a null ya que el último nodo apunta al primer nodo y el primer nodo apunta al último nodo.

![DoublyCircularLinkedList2](https://user-images.githubusercontent.com/115047831/214827406-b89aacc2-e04a-4788-94d0-061f39020020.png)

Ahora que agregamos el Nodo 5 (Morado) debemos saber que la **variable last** esta apuntando al Nodo 5 (Morado) ya que ahora es el último nodo de la lista.

![DoublyCircularLinkedList3](https://user-images.githubusercontent.com/115047831/214828710-92ccbe2d-5cb3-448f-91b4-29a6c5703111.png)

## Eliminar Nodo

**Se elimina un Nodo por su valor númerico, se elimnarán todos los valores con este dígito.**

En el siguiente ejemplo podemos observar que el Nodo 1 (Naranja) se repite 5 veces en la lista, el objetivo es eliminar todos los nodos que coinciden con el número 1, independientemente de su posición en la lista deberán ser eliminados. El método **`delete`** se compone de tres partes, si identifica que el Nodo ha eliminar está al inicio de la lista  entonces ejecutará el método **`deleteFirst`** mientras que detecte que el valor sigue al inicio de la lista. Posteriormente buscará el nodo que esta al final de la lista, si coincide con el número a eliminar continuara eliminandolo ejecutando el método **`deleteLast`** hasta que no este al final de la lista. Finalmente buscará el valor númerico del nodo unicamente en el medio de la lista.

![DoublyCircularLinkedList4](https://user-images.githubusercontent.com/115047831/214830683-27a3c44f-c6c6-46a5-9b74-081e53c992c3.png)

En la siguiente imagen podemos observar que todos los Nodos 1 (Naranja) han sido removidos de la lista.

![DoublyCircularLinkedList5](https://user-images.githubusercontent.com/115047831/214831680-27f152e2-e206-46e8-9e9a-7aa175aa9ab2.png)

## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir la **Lista Circular Doblemente Ligada**. La clase **test** no se incluye en el diagrama UML porque solo contiene el método main y únicamente es utilizada para demostrar el funcionamiento de los métodos de la lista.

![UML (3)](https://user-images.githubusercontent.com/115047831/214832085-5d2c2ac6-86bf-4547-aba8-eb8eb1fc6a67.png)
