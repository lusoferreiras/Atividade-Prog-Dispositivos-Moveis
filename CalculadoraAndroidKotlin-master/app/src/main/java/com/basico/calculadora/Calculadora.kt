package com.basico.calculadora

import kotlinx.android.synthetic.main.activity_main.*

class Calculadora {
    companion object {
        fun getCalcular(expressao:String): Int {
            var resultado:Int = 0

            val num = expressao.split("[+-/x]".toRegex()).toTypedArray()
            val op = expressao.replace("\\s+".toRegex(),"").split("\\d".toRegex()).toTypedArray()
            var i:Int = 1

            resultado = resultado + num[0].toString().trim().toInt()
            for(itemOp in op ){
                if(itemOp.contains("[+-/x]".toRegex())){
                    when (itemOp) {
                        "+"-> {
                            resultado = resultado + num[i].toString().trim().toInt()
                        }
                        "-"-> {
                            resultado = resultado - num[i].toString().trim().toInt()
                        }
                        "x"-> {
                            resultado = resultado * num[i].toString().trim().toInt()
                        }
                        "/"-> {
                            resultado = resultado / num[i].toString().trim().toInt()
                        }
                    }
                    i++
                }


            }

            return resultado
        }
    }
}