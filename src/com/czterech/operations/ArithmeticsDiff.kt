package com.czterech.operations

import com.czterech.Interface.ArithmeticsMult

class ArithmeticsDiff : ArithmeticsDiff {
    override fun difference(x: Double, y: Double): Double {
        try{
            return x - y
        }catch (e : ArithmeticException){
            throw Exception("Nie mozna tak odejmowac, z powodu ${e.message}")
        }
    }
}