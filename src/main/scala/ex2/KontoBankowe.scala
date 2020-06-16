package ex2

class KontoBankowe(private var _stanKonta: Double = 0) {
  def stanKonta: Double = _stanKonta
  def wplata(double: Double): Unit = {
    _stanKonta += double
  }

  def wyplata(double: Double): Unit = {
    _stanKonta -= double
  }
}
