package com.czterech.operations

import com.czterech.Interface.ArithmeticsDiv
import java.util.*

class ArithmeticsDiv : ArithmeticsDiv {
    // poprawilem ten kod bo cos nie dzialalo
    override fun div(x: Double, y: Double): Double{
        try{
            return x / y
        }catch (e : ArithmeticException){
            throw Exception("Nie mozna tak dzielic, z powodu ${e.message}")
        }
    }
}