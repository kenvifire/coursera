package week3

object rationals {
	val ra = new Rational(3,4)                //> ra  : week3.Rational = 3/4
	ra.numer                                  //> res0: Int = 3
	//val y = new Rational(2,3)
	
	val x = new Rational(1,3)                 //> x  : week3.Rational = 1/3
	val y = new Rational(5,7)                 //> y  : week3.Rational = 5/7
	val z = new Rational(3,2)                 //> z  : week3.Rational = 3/2
	x - (y - z)                               //> res1: week3.Rational = 47/42
	y + y + y                                 //> res2: week3.Rational = 15/7
	x < z                                     //> res3: Boolean = true
//	val strange = new Rational(1,0)
	//strange.add(strange)
	val a = new Rational(3)                   //> a  : week3.Rational = 3/1

	
}

class Rational(x:Int,y:Int){
	require(y != 0,"denominator must not be zero")
	
	def this(x:Int) = this(x,1)
	
	private def gcd(a:Int,b:Int):Int = if (b==0) a else gcd(b,a%b)
	private val g = gcd(x,y)
  def numer = x/g
  def denom = y/g
  
  def <(that: Rational) =
  	numer * that.denom < that.numer * denom
  
  def max(that: Rational) =
  	if(this < that ) that else this
  
  def +(that:Rational) =
  	new Rational(
  	 numer*that.denom+that.numer*denom,
  	 denom*that.denom)
  	 
  override def toString = numer +"/"+denom
  
  def unary_- : Rational = new Rational(-numer,denom)
  
  def -(that:Rational) = this + -that
  
}