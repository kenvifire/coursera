package week6

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(26); 
  var r:Range = 1 until 5;System.out.println("""r  : Range = """ + $show(r ));$skip(23); 
  var s:Range = 1 to 5;System.out.println("""s  : Range = """ + $show(s ));$skip(15); val res$0 = 
  1 to 10 by 3;System.out.println("""res0: scala.collection.immutable.Range = """ + $show(res$0));$skip(9); val res$1 = 
  6 to 1;System.out.println("""res1: scala.collection.immutable.Range.Inclusive = """ + $show(res$1));$skip(28); 
  
  val s1 = "Hello World";System.out.println("""s1  : String = """ + $show(s1 ));$skip(28); val res$2 = 
  s1 filter(c => c.isUpper);System.out.println("""res2: String = """ + $show(res$2));$skip(32); val res$3 = 
  
  s1 exists( c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(32); val res$4 = 
  
  s1 forall( c => c.isUpper);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(25); 
  
  val pair =s1 zip s1;System.out.println("""pair  : scala.collection.immutable.IndexedSeq[(Char, Char)] = """ + $show(pair ));$skip(13); val res$5 = 
  pair unzip;System.out.println("""res5: (scala.collection.immutable.IndexedSeq[Char], scala.collection.immutable.IndexedSeq[Char]) = """ + $show(res$5));$skip(72); 
  
  
  
  def isPrime(n:Int):Boolean=(2 until n) forall (d => n%d!=0 );System.out.println("""isPrime: (n: Int)Boolean""");$skip(16); val res$6 = 
  
  isPrime(3);System.out.println("""res6: Boolean = """ + $show(res$6))}
}
