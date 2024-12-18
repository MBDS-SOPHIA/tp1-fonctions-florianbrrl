//# Pratiquer les fonctions en Kotlin

//- Ecrire une fonction qui affiche les x premiers nombres pa

fun afficheNombresPairs(x: Int): String {
    val result = StringBuilder()
    for (i in 0 until x) {
        result.append("${i * 2}\n")
    }
    return result.toString()
}

//- Ecrire une fonction qui affiche les x premiers nombres de la suite Fibonacci

fun afficheFibonacci(x: Int): String {
    val result = StringBuilder()
    var a = 0
    var b = 1
    for (i in 0 until x) {
        result.append("$a\n")
        val next = a + b
        a = b
        b = next
    }
    return result.toString()
}

// - Ecrire une fonction qui calcule le factoriel d’un nombre x, utiliser 10 par défaut si aucun nombre n’est spécifié.

fun factoriel(x: Int = 10): Long {
    var result: Long = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}

// - Ecrire une fonction qui affiche les x premiers nombres premiers

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun afficheNombresPremiers(x: Int): String {
    val result = StringBuilder()
    var i = 2
    var count = 0
    while (count < x) {
        if (isPrime(i)) {
            result.append("$i\n")
            count++
        }
        i++
    }
    return result.toString()
}

// Print d'exemples

println(
    """
    Les 10 premiers nombres pairs:
    ${afficheNombresPairs(10)}

    Les 10 premiers nombres de la suite Fibonacci:
    ${afficheFibonacci(10)}

    Factoriel de 10:
    ${factoriel()}

    Factoriel de 5:
    ${factoriel(5)}

    Les 10 premiers nombres premiers:
    ${afficheNombresPremiers(10)}
    """.trimIndent()
)
