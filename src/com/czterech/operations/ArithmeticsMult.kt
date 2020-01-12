package com.czterech.operations

import com.czterech.Interface.ArithmeticsMult

class ArithmeticsMult : ArithmeticsMult {
    override fun multiplication(x: Double, y: Double): Double {
        try{
            return x * y
        }catch (e : ArithmeticException){
            throw Exception("Nie mozna tak dzielic, z powodu ${e.message}")
        }
    }
}