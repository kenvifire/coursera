package week3

object rationals {
	val ra = new Rational(3,4)
	ra.numer
}

class Rational(x:Int,y:Int){
  def numer = x
  def denom = y
}

