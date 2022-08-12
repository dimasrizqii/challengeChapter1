@file:Suppress("NAME_SHADOWING", "IMPLICIT_CAST_TO_ANY")

import java.util.*
val userInput = Scanner(System.`in`)

fun main() {
    println("-----------------------")
    println("Dimas Rizqi Ibadurrahim")
    println("Binar x KM 3 - Android 2")
    println("-------------------")
    println("Challenge Chapter 1")
    println("------------------------")
    println("1. Pola Bintang Piramida")
    println("2. Pola Bintang Piramida Terbalik")
    println("3. Pola Bintang Diamond")
    println("4. Pola Bintang Bintang X")
    println("5. Pola Bintang Segitiga Siku - Siku")
    println("--------------------------------------")
    println("Masukkan Program yang ingin dilihat : ")

    val pola = SuperPattern()
    val hasil = when(userInput.nextInt()){
        1 -> pola.piramidaBintang()
        2 -> pola.piramidaBintangTerbalik()
        3 -> pola.diamond()
        4 -> pola.xBintang()
        5 -> pola.segitigaSikuSiku()
        else -> "\nKagak ada atuh :("
    }
    println(hasil)
}

open class Pattern {

    protected open fun piramidaBintang(){
        println("-----------------------")
        println("1. Pyramid Star Pattern")
        println("-----------------------------------------------------")
        println("Silahkan masukkan inputan angka yang anda inginkan : ")

        val starCount = userInput.nextInt()
        var j = 0

        for (i in 1..starCount) {
            for (space in 1..starCount - i) {
                print("  ")
            }

            while (j != 2 * i - 1) {
                print("* ")
                ++j
            }

            println()
            j = 0
        }
    }

    protected open fun piramidaBintangTerbalik(){
        println("-------------------------------")
        println("2. Reverse Pyramid Star Pattern")
        println("-----------------------------------------------------")
        println("Silahkan masukkan inputan angka yang anda inginkan : ")

        val starCount = userInput.nextInt()

        for (i in starCount downTo 1) {

            for (space in 1..starCount - i) {
                print("  ")
            }

            for (j in i until 2 * i) {
                print("* ")
            }

            for (j in 0 until i - 1) {
                print("* ")
            }

            println()
        }
    }

    protected open fun diamond(){
        println("-------------------------------")
        println("3. Diamond Star Pattern")
        println("-----------------------------------------------------")
        println("Silahkan masukkan inputan angka yang anda inginkan : ")

        val starCount = userInput.nextInt()
        var j = 0

        for (i in 1..starCount) {
            for (space in 1..starCount - i) {
                print("  ")
            }

            while (j != 2 * i - 1) {
                print("* ")
                ++j
            }

            println()
            j = 0
        }

        for (i in starCount - 1 downTo 1) {

            for (space in 1..starCount - i) {
                print("  ")
            }

            for (j in i until 2 * i) {
                print("* ")
            }

            for (j in 0 until i - 1) {
                print("* ")
            }

            println()
        }
    }

    protected open fun xBintang(){
        println("-----------------")
        println("4. Star X Pattern")
        println("-----------------------------------------------------")
        println("Silahkan masukkan inputan angka yang anda inginkan : ")

        val starCount = userInput.nextInt()
        val count = starCount * 2 - 1
        for(i in 1..count){
            for(j in 1..count){
                if(j==i || (j==count - i + 1))
                {
                    print("*")
                }
                else
                {
                    print(" ")
                }
            }

            println("")
        }
    }

    protected open fun segitigaSikuSiku(){
        println("-----------------")
        println("5. Right Angled Triangle Star Pattern")
        println("-----------------------------------------------------")
        println("Silahkan masukkan inputan angka yang anda inginkan : ")

        val starCount = userInput.nextInt()

        for (i in 1..starCount) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}

class SuperPattern: Pattern() {
    public override fun piramidaBintang(){
        super.piramidaBintang()
    }

    public override fun piramidaBintangTerbalik() {
        super.piramidaBintangTerbalik()
    }

    public override fun diamond() {
        super.diamond()
    }

    public override fun xBintang(){
        super.xBintang()
    }

    public override fun segitigaSikuSiku() {
        super.segitigaSikuSiku()
    }
}
