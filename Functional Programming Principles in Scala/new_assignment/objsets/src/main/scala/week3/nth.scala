package week3

/**
 * Created by kenvi on 2014-05-17.
 */
object nth {
  def nth[T](n : Int, xs:List[T]):T=
    if(n==0) xs.head
    else nth(n-1,xs.tail)

  var list = new Cons(1,new Cons(2,new Cons(3,new Nil)))

  nth(2,list)

  nth(-1,list)
}
