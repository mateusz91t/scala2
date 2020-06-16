package ex2

import scala.annotation.tailrec

object ex2_1 {
  def main(args: Array[String]) {
    //val - stała/wartość
    //var - zmienna

    println()
    println("NBD 2.1")
    val dniTygodnia = List("poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela")

    def roboczyCzyWolny(listaDni: String): String = listaDni match {
      case "poniedziałek" => "dzień roboczy"
      case "wtorek" => "dzień roboczy"
      case "środa" => "dzień roboczy"
      case "czwarte" => "dzień roboczy"
      case "piątek" => "dzień roboczy"
      case "sobota" => "dzień wolny"
      case "niedziela" => "dzień wolny"
      case _ => "nie ma takiego dnia"
    }

    println(roboczyCzyWolny(dniTygodnia(1)))
    println(roboczyCzyWolny(dniTygodnia(6)))
    println(roboczyCzyWolny(dniTygodnia.head))

    println()
    println("NBD 2.2")
    val k1 = new KontoBankowe
    val k2 = new KontoBankowe(2.7)
    println(k1.stanKonta)
    println(k2.stanKonta)
    k1.wplata(10)
    k2.wyplata(1)
    println(k1.stanKonta)
    println(k2.stanKonta)
//    k2.stanKonta = 10 //wywoła błąd

    println()
    println("NBD 2.3")




    println()
    println("NBD 2.3")
  }
}
