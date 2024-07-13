# CHALLENGE LiterAlura

Este proyecto consta del consumo de una API ---- en la cual se recibe el formato JSON y debemos de realizar el tratado de la informacion para que este sea tratado y depositado en una base de datos que es Postgresql en la cual haciendo uso de Spring y sus dependencias, creamos las tablas respectivas a la base de datos


## Requerimientos
Es necesrio tener una base de datos en Postgresql

```sql
CREATE DATABASE LiterAlura;
```

Se ingresara ese comando atraves de un query, una vez realizado esto es necesario cambiar el parametro en aplications properties si es el caso de que no se encuentre en la misma ruta o mismo puerto que es el por default 3306.

En el proyecto es el puro enfoque del consumo de la API por los cual, de momento, no hay un FrontEnd, por lo tanto el manejo del proyecto se lleva a cabo a traves de la propia terminal ya sea de Visual Studio Code, IntelliJ o cualquier otro editor que se use.
## API de Consumo

#### Get all items

```http
  http://gutendex.com/books/
```
Para esta API no se requiere de ninguna API Key en especial, ya que es de uso abierto.


