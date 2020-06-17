package ex2

class Osoba(imie: String = "", nazwisko: String = "") {
  def przywitanie1: String = this.imie match {
    case "" => "Dzień dobry nieznajomy"
    case string: String if string.last == 'a' => s"Dzień dobry Pani $imie $nazwisko"
    case string: String if ('b' to 'z').contains(string.last) => s"Dzień dobry Panie $imie $nazwisko"
    case string: String if string forall Character.isDigit => s"siema liczbo $imie$nazwisko"
    case _ => "domyślne przywitanie"
  }
}