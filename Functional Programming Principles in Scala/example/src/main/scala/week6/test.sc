package week6

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var r:Range = 1 until 5                         //> r  : Range = Range(1, 2, 3, 4)
  var s:Range = 1 to 5                            //> s  : Range = Range(1, 2, 3, 4, 5)
  1 to 10 by 3                                    //> res0: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  6 to 1                                          //> res1: scala.collection.immutable.Range.Inclusive = Range()
  
  val s1 = "Hello World"                          //> s1  : String = Hello World
  s1 filter(c => c.isUpper)                       //> res2: String = HW
  
  s1 exists( c => c.isUpper)                      //> res3: Boolean = true
  
  s1 forall( c => c.isUpper)                      //> res4: Boolean = false
  
  val pair =s1 zip s1                             //> pair  : scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,H), 
                                                  //| (e,e), (l,l), (l,l), (o,o), ( , ), (W,W), (o,o), (r,r), (l,l), (d,d))
  pair unzip                                      //> res5: (scala.collection.immutable.IndexedSeq[Char], scala.collection.immutab
                                                  //| le.IndexedSeq[Char]) = (Vector(H, e, l, l, o,  , W, o, r, l, d),Vector(H, e,
                                                  //|  l, l, o,  , W, o, r, l, d))
  
  
  
  def isPrime(n:Int):Boolean=(2 until n) forall (d => n%d!=0 )
                                                  //> isPrime: (n: Int)Boolean
  
  isPrime(3)                                      //> res6: Boolean = true
}