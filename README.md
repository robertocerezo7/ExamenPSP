Enunciado:
Seguimos dandole vuelta en casa al nombre de la gara que adoptamos y hemos decidido hacer un sistema de votaciones en remoto para que opine la familia.

Se requiere un programa java cliente: (3 puntos)
  - Crea la conexión con el servidor y en un bucle infinito recoge por el teclado una cadena
    de texto, que enviará cada vez como mensaje al servidor, y no espera a que este le
    devuelva nada. Cada cadena de texto será un nombre propuesto (un voto)
  - Saldrá del bucle infinito cuando el usuario escriba un asterisco.
  - Gestiona correctamente la salida del cliente y un posible cierre abrupto del servidor

Se requiere un programa servidor que: (7 puntos)
  - Acepte múltiples clientes que deberan ser atendidos simultáneamente.
  - Por cada cadena de texto que le llegue desde un cliente deberá almacenar un voto para
    ese nombre e imprimir como va la votación. Por supuesto, un nombre puede llegar
    varias veces así que tendrá que almacenar votos, y a la hora de mostrar el listado, junto
    a cada nombre deberán aparecer el número de votos.
  - No tiene que enviarle nada en respuesta al cliente.
  - Gestiona correctamente la salida de cada cliente, ya sea de forma controlada o abrupta.
  - Muestra el listado oredenado por orden alfabético.
