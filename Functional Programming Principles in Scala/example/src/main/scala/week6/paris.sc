package week6

object paris {
  println("Welcome to the Scala worksheet")
  val n = 7
   def isPrime(n:Int):Boolean=(2 until n) forall (d => n%d!=0 )
  (1 until 7) flatMap( i=> (1 until i) map (j => (i,j)))
  
 def scalarProduct(xs: List[Double], ys: List[Double]) : Double =
 	for{
 		x in xs
 		y in ys
 		
 	} yeild
  
  
}