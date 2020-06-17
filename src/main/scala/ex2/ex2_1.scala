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
    //    k2.stanKonta = 10 //wywoła błąd czyli jest readonly

    println()
    println("NBD 2.3")
    val o1 = new Osoba
    val o2 = new Osoba("Jan", "Nowak")
    val o3 = new Osoba("Janina", "Nowak")
    val o4 = new Osoba("1", "2")
    val o5 = new Osoba("!", "@")
    println(o1.przywitanie1)
    println(o2.przywitanie1)
    println(o3.przywitanie1)
    println(o4.przywitanie1)
    println(o5.przywitanie1)


    println()
    println("NBD 2.4")

    def PlusPlus(liczba: Int): Int = liczba + 1

    def zad4(a: Int)(b: Int): Int = a + b + b + b

    val v4 = zad4(1)(PlusPlus(PlusPlus(PlusPlus(10))))
    println(v4)

    println()
    println("NBD 2.5")
    trait Student extends Osoba2 {
      override def podatek: Double = 0
    }

    trait Nauczyciel extends Pracownik {
      override def podatek: Double = pensja * 0.1
    }

    trait Pracownik extends Osoba2 {
      var pensja: Double

      override def podatek: Double = pensja * 0.2

      override def toString: String = super.toString + s"; pensja = $pensja"
    }

    val o21 = new Osoba2("Mateusz", "Osoba", 20)
    //    o21.imie = "Karol" //read-only - zwróci błąd
    val o22 = new Osoba2("Jerzy", "Student", 100) with Student
    val o23 = new Osoba2("Jarosław", "Pracownik", 200) with Pracownik {
      override var pensja: Double = 4000
    }
    val o24 = new Osoba2("Mieczysław", "Nauczyciel", 300) with Nauczyciel {
      override var pensja: Double = 5000
    }

    val o25 = new Osoba2("Bogusław", "PracownikStudent", 10) with Pracownik with Student {
      override var pensja: Double = 1000
    }
    val o26 = new Osoba2("Bogusław", "StudentPracownik", 10) with Student with Pracownik {
      override var pensja: Double = 1000
    }

    println(o21.toString)
    println(o22.toString)
    println(o23.toString)
    println(o24.toString)
    println()
    println(o25.toString)
    println(o26.toString)
  }
}
