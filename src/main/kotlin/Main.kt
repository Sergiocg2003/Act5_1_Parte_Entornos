/*
crea una función en kotlin que según el valor de una variable que se llame “nota”, decida el valor a imprimir en pantalla,
usando la sentencia When. Siendo < 5 suspenso, entre 5 y menos que 7 aprobado, entre 7 y 8 notable y entre 9 y 10
incluido sobresaliente. Y si el valor es diferente a este rango, que diga “el valor introducido no es correcto”.
 */

fun main() {
    println("Introduzca la nota:")
    val nota = readLine()?.toInt()

    when(nota) {
        in 0..4 -> {
            println("Suspenso")
        }
        5,6 -> {
            println("Aprobado")
        }
        7,8 -> {
            println("Notable")
        }
        9,10 -> {
            println("Sobresaliente")
        }
        else -> {
            println("No es correcto")
        }

    }
}



