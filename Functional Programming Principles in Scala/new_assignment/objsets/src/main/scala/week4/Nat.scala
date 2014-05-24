package week4

/**
 * Created by kenvi on 2014-05-21.
 */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

object Zero extends Nat{
  override def -(that: Nat): Nat = ???

  override def +(that: Nat): Nat = ???

  override def successor: Nat = ???

  override def predecessor: Nat =  throw

  override def isZero: Boolean = true
}
