package week4

import java.util.NoSuchElementException

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T]{
  def isEmpty = false
  
}

class Nil[T] extends List[T]{
  def isEmpty:Boolean  = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Tail.head")
  
}
object test{
	def singleton[T](elem:T) = new Cons[T](elem,new Nil[T])
	singleton(1)
}