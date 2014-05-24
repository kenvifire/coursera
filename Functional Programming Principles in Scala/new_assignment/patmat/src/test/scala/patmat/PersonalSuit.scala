package patmat

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import patmat.Huffman._
import patmat.Huffman.Leaf
import patmat.Huffman.Fork

/**
 * Created by kenvi on 2014-05-24.
 */
@RunWith(classOf[JUnitRunner])
class PersonalSuit extends FunSuite{
  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)

    val t3 = Fork(Leaf('a',8),Fork(Fork(Leaf('b',3),Fork(Leaf('c',1),Leaf('d',1),"cd".toList,2),"bcd".toList,5),Fork(Fork(Leaf('e',1),Leaf('f',1),"ef".toList,2),Fork(Leaf('g',1),Leaf('h',1),"gh".toList,2),"efgh".toList,4),"bcdefgh".toList,9),"abcdefgh".toList,17)
    //val t3=

  }

  test("test decode"){
    new TestTrees {
      //assert(encode(frenchCode)("huffmanestcool".toList) === secret)
      //decode(frenchCode,secret)  === List('h','u','f','f','m','a','n','e','s','t','c','o','o','l')
      //val table = convert(frenchCode)

      //table.foreach(t=>println(t._1 +"=>" + (t._2 === encodeChar(frenchCode,t._1,List()))))
      println(encodeChar(frenchCode,'t',List()))
      //println(encodeChar(frenchCode,'i',List()))
      println(List('a','b','c').toString())
      assert(List('a','b','c').toString().contains('a'))
    }
  }

}
