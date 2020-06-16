package ex2

import scala.annotation.tailrec

object ex2_1 {
  def main(args: Array[String]) {
    //val - stała/wartość
    //var - zmienna

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
    println(roboczyCzyWolny(dniTygodnia(0)))

    println("NBD 2.2")


    println("NBD 2.1")
  }
}
