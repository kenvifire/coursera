object exercise{

  def mapReduce(f : Int => Int, combine : (Int,Int) => Int, zero :Int)(a:Int, b:Int): Int=
    if(a>b) zero
    else combine(f(a),mapReduce(f,combine,zero)(a+1,b))
  def product(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,(x,y)=>x*y,1)(a,b)
  product(x => x*x)(3,4)

  val tolerance = 0.00001
  def isCloseEnough(x:Double, y:Double)=
    math.abs((x-y) / x) /x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if(isCloseEnough(guess,next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  fixedPoint(x => 1 + x/2)(1)
  def sqrt(x:Double) = fixedPoint(y=>(y+x/y)/2)(1)

  sqrt(2)

  def averageDamp(f:Double => Double)(x:Double) = (x + f(x)) /2





















































  ffffffffffffffffff



































  def




}