package week4

object examples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  val t1 = new NonEmpty(3,new Empty,new Empty);System.out.println("""t1  : week4.NonEmpty = """ + $show(t1 ));$skip(28); 
  val t2 = t1 incl 4 incl 5;System.out.println("""t2  : week4.IntSet = """ + $show(t2 ));$skip(14); val res$0 = 
  t1 union t2;System.out.println("""res0: week4.IntSet = """ + $show(res$0));$skip(24); val res$1 = 
  if(true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(51); 
  
  def error(msg:String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(12); 
  print(t1)}
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
