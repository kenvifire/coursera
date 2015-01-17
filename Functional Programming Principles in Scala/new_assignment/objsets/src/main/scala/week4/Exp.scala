package week4

import scala.reflect.api.Exprs.Expr

/**
 * Created by kenvi on 2014-05-21.
 */
trait Exp {
  def isNumber : Boolean

  def isSum : Boolean

  def numValue : Int

  def leftOp : Expr
  

}
