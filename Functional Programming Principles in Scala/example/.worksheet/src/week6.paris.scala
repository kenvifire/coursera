package week6

object paris {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(64); 
   def isPrime(n:Int):Boolean=(2 until n) forall (d => n%d!=0 );System.out.println("""isPrime: (n: Int)Boolean""");$skip(57); val res$0 = 
  (1 until 7) flatMap( i=> (1 until i) map (j => (i,j)));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(112); 
  
 def scalarProduct(xs: List[Double], ys: List[Double]) : Double =
 	for{
 		x in xs
 		y in ys
 		
 	} yeild;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""")}
  
  
}
