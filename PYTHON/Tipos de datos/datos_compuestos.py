#Los datos compuestos son un tipo de datos que se forman a partir de datos simples.

#Listas (list): Una lista es una secuencia ordenada y mutable de elementos. Puedes almacenar cualquier tipo de datos en una lista.
lists = [1, 2, 'Hola', [3, 4]]
print(lists[0])

#Tuplas (tuple): Una tupla es similar a una lista, pero es inmutable, lo que significa que no puedes cambiar su contenido después de que se crea.
tuples = (1, 2, 'Hola', (3, 4))
print(tuples[1])

#Conjuntos (set): Un conjunto es una colección no ordenada de elementos únicos, los elementos no se pueden modificar.
set = {1, 2, 'Hola'}


#Diccionarios (dict): Un diccionario es una colección no ordenada de pares clave-valor.
dict = {
    "key": "value"
}
print(dict['key'])