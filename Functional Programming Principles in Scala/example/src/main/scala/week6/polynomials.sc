package week6

object polynomials {
  class Poly(val terms:Map[Int,Double]){
  	def + (other:Poly) = new Poly(terms ++ (other.terms map adjust))
  	
  	def adjust(term:(Int,Double)):(Int,Double) = {
  		val (exp,coeff) = term
  		exp -> (coeff + terms(exp))
  		
  		
  	}
  	
  	override def toString =
  		(for ((exp,coeff) <- terms.toList.sorted) yield coeff+"X^"+ exp) mkString " + "
  }
  
  
  val p1 = new Poly(Map(1 -> 2.0,3 -> 4.0,5 -> 6.2))
                                                  //> p1  : week6.polynomials.Poly = 2.0X^1 + 4.0X^3 + 6.2X^5
  val p2 = new Poly(Map(0 -> 3.0,3->7.0))         //> p2  : week6.polynomials.Poly = 3.0X^0 + 7.0X^3
  
  p1+p2                                           //> java.util.NoSuchElementException: key not found: 0
                                                  //| 	at scala.collection.MapLike$class.default(MapLike.scala:228)
                                                  //| 	at scala.collection.AbstractMap.default(Map.scala:58)
                                                  //| 	at scala.collection.MapLike$class.apply(MapLike.scala:141)
                                                  //| 	at scala.collection.AbstractMap.apply(Map.scala:58)
                                                  //| 	at week6.polynomials$Poly.adjust(week6.polynomials.scala:9)
                                                  //| 	at week6.polynomials$Poly$$anonfun$$plus$1.apply(week6.polynomials.scala
                                                  //| :5)
                                                  //| 	at week6.polynomials$Poly$$anonfun$$plus$1.apply(week6.polynomials.scala
                                                  //| :5)
                                                  //| 	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike
                                                  //| .scala:244)
                                                  //| 	at scala.collection.TraversableLike$$anonfun$map$1.apply(TraversableLike
                                                  //| .scala:244)
                                                  //| 	at scala.collection.immutable.Map$Map2.foreach(Map.scala:130)
                                                  //| 	at scala.collection.TraversableLike$class.map(TraversableLike.scala:244)
                                                  //| 
                                                  //| 	at scala.collection.AbstractTraversable.map(Traversable.scala:105)
                                                  //| 	at week6.polynomials$Poly.$plus(we
                                                  //| Output exceeds cutoff limit.
}