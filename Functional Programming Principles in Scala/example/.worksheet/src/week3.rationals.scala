package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
	val ra = new Rational(3,4);System.out.println("""ra  : week3.Rational = """ + $show(ra ));$skip(10); val res$0 = 
	ra.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(58); 
	//val y = new Rational(2,3)
	
	val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(27); 
	val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(27); 
	val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(13); val res$1 = 
	x - (y - z);System.out.println("""res1: week3.Rational = """ + $show(res$1));$skip(11); val res$2 = 
	y + y + y;System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(7); val res$3 = 
	x < z;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(84); 
//	val strange = new Rational(1,0)
	//strange.add(strange)
	val a = new Rational(3);System.out.println("""a  : week3.Rational = """ + $show(a ))}

	
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
