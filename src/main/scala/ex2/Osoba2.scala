package ex2

class Osoba2 (protected var _imie: String, protected var _nazwisko: String, protected var _podatek: Double) {
  def imie: String = _imie
  def nazwisko: String = _nazwisko
  def podatek: Double = _podatek

  override def toString: String = s"$imie $nazwisko: podatek = $podatek"
}
