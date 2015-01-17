
object sort{
  def insert(x:Int,xs : List[Int]):List[Int] = xs match {
    case List() => x::xs
    case y:: ys => if(x <= y ) x::xs else y::insert(x,ys)
  }

  def isSort(xs:List[Int]):List[Int] = xs match {
    case List() => xs
    case x::xs => insert(x,xs)
  }

  val list = List(1,3,4,5,43,4,23,11)

  isSort(list)
}