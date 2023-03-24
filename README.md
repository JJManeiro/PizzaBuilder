# Reflexión sobre las preguntas del ejercicio Builder.
## Cual es la función del patrón builder? 
Para mi creo que es para poder crear un objeto con diversos parámetros el cual podemos llamar a través de una variable luego.
O la capacidad de crear un objeto con ciertas variables por defecto.
## ¿Como es su Diagrama de clases? Realiza en el readme el diagrama
Dejaré la foto como un png en el repositorio.
## ¿Podríamos combinarlo con el patrón Factory? Explícalo con algo de código como lo harías.
Creo que es posible, por poner de ejemplo el builder de pizzas. <br/>

Solo tendríamos que hacer una interfaz común, la cual pondríamos en ella una función abstracta para aplicar
en la clase pizza o en otras en el caso de querer más clases. (e.g: bocatas.)<br/>

Luego creariamos una clase factory que de la opción de poner (según un parámetro) la pizza por defecto o el hacer una personalizada.
