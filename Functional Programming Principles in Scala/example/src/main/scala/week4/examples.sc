package week4

object examples {
  val t1 = new NonEmpty(3,new Empty,new Empty)    //> t1  : week4.NonEmpty = {.3.}
  val t2 = t1 incl 4 incl 5                       //> t2  : week4.IntSet = {.3{.4{.5.}}}
  t1 union t2                                     //> res0: week4.IntSet = {.3{.4{.5.}}}
  if(true) 1 else false                           //> res1: AnyVal = 1
  
  def error(msg:String) = throw new Error(msg)    //> error: (msg: String)Nothing
  print(t1)
}

abstract class IntSet{
	def contains(x: Int):Boolean
	def incl(x:Int):IntSet
	def union(other:IntSet):IntSet
}

class Empty extends IntSet{
	def contains(x: Int): Boolean = false
	def incl(x: Int): IntSet = new NonEmpty(x,new Empty,new Empty)
	override def toString = "."
	def union(other:IntSet):IntSet = other
}

class NonEmpty(elem:Int,left:IntSet,right:IntSet) extends IntSet{
		def contains(x: Int):Boolean=
			if(x<elem) left contains x
			else if(x>elem) right contains x
			else true
			
		def incl(x:Int):IntSet =
			if(x<elem) new NonEmpty(elem,left incl x,right)
			else if(x > elem) new NonEmpty(elem,left,right incl x)
			else this
			
		override def toString = "{"+left + elem + right + "}"
		
		def union(other:IntSet):IntSet =
			((left union right) union other) incl elem
}


abstract class Base{
	def foo = 1
	def bar: Int
}

class Sub extends Base{
	override def foo =2
	def bar = 3
}

trait Planar {
	def width:Int
	def hight:Int
	def surface():Int = width * hight
}