package week4

/**
 * Created by kenvi on 2014-05-21.
 */
abstract class Boolean {

  def ifThenElse[T](t : => T, e: => T) : T

  def && (x: => Boolean ): Boolean  = ifThenElse[Boolean](x,false)

  def || (x: => Boolean): Boolean   = ifThenElse(true,x)

  def unary_! = ifThenElse(false,true)

  def == (x: Boolean):Boolean       = ifThenElse(x,x.unary_!)

  def != (x:Boolean):Boolean        = ifThenElse(x.unary_!,x)


}

object true extends Boolean{


}
