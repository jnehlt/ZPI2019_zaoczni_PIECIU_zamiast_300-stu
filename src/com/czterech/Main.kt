package com.czterech

import com.czterech.operations.ArithmeticsDiv
import com.czterech.operations.ArithmeticsMult
import org.graalvm.compiler.debug.TTY.print

object Main {

    // Czy to faktycznie działa?
    fun main(args: Array<String>) {
        // zmienilem na koltina :DD:D::DD::D::D::D:D:::D
        val multi = ArithmeticsMult()
        print("Wynik mnożenia: ${multi.multiplication(2.toDouble(),2.toDouble()).toString()}")


        val div = ArithmeticsDiv()
        print("Wynik dzielenia: ${div.div(4.toDouble(),2.toDouble()).toString()}")
    }
}
