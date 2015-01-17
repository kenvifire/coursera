package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)

    val t3 = Fork(Leaf('a',8),Fork(Fork(Leaf('b',3),Fork(Leaf('c',1),Leaf('d',1),"cd".toList,2),"bcd".toList,5),Fork(Fork(Leaf('e',1),Leaf('f',1),"ef".toList,2),Fork(Leaf('g',1),Leaf('h',1),"gh".toList,2),"efgh".toList,4),"bcdefgh".toList,9),"abcdefgh".toList,17)
    //val t3=

  }

  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }

  test("weight of another large tree"){
    new TestTrees{
      assert(weight(t2) == 9)
    }
  }

  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a','b','d'))
    }
  }

  test("chars of another larger tree"){
    new TestTrees{
      assert(chars(t1) === List('a','b'))
    }
  }

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }

  test("times "){
    new TestTrees {
      times(List('a','b','a'))  === List(('a',2),('b',1))
    }
  }

  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e',1), Leaf('t',2), Leaf('x',3)))
  }



  test("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3), Leaf('x',4)))
  }

  test("combine of a singleton or nil "){
    new TestTrees {
      val leaflist = List(Leaf('e',1))
      assert(singleton(leaflist))
      combine(leaflist) === leaflist
      combine(Nil) === Nil
    }
  }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
//      println("====t1 encode ====")
//      println(encodeChar(t3,'a',List()))
//      println(encodeChar(t3,'b',List()))
//      println(encodeChar(t3,'c',List()))
//      println(encodeChar(t3,'d',List()))
//      println(encodeChar(t3,'e',List()))
//      println(encodeChar(t3,'f',List()))
//      println(encodeChar(t3,'g',List()))
//      println(encodeChar(t3,'h',List()))
//      println(encode(t1)("ab".toList))
//      println(decode(t1,List(0,1)))
//      println("====t1========")
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }

//  test("decoding the secret"){
//    new TestTrees {
//
//    }
//  }

  test(" convert & code bits ") {
    new TestTrees {
      val table =convert(t2)
      assert(table === List(('a',List(0,0)),('b',List(0,1)),('d',List(1))))
      assert(codeBits(table)('a') === List(0,0))
      assert(codeBits(table)('b') === List(0,1))
      assert(codeBits(table)('d') === List(1))

    }
  }
  test("test quick encode"){
    new TestTrees {
        assert(quickEncode(t2)(List('a','b','d')) === List(0,0,0,1,1))
       // println(decodedSecret)

    }
  }

  test("demo encode"){
    new TestTrees {
      println("===demo====")
//      val bits:List[Bit] = encode(t3)("abcdefgh".toList)
//      "abcdefgh".toList.foreach(c => println(encodeChar(t3,c,List())))
//      println(bits)
//      println(decode(t3,bits))
      println(decode(t3,List(0)))
      println(decode(t3,List(1,0,0)))
      println(decode(t3,List(1,0,1,0)))
      println(decode(t3,List(1,0,1,1)))
      println(decode(t3,List(1,1,0,0)))
      println(decode(t3,List(1,1,0,1)))
      println(decode(t3,List(1,1,1,0)))
      println(decode(t3,List(1,1,1,1)))
      println("===demo====")
    }
  }
  test("french code"){
    new TestTrees{
      //print(convert(frenchCode))
      //println("-----")
      assert(quickEncode(frenchCode)(List('h','u','f','f','m','a','n','e','s','t','c','o','o','l')) === secret)
    }
  }

  test(" encode french"){
    new TestTrees{
      assert(encode(frenchCode)("huffmanestcool".toList) === secret)
      decode(frenchCode,secret)  === List('h','u','f','f','m','a','n','e','s','t','c','o','o','l')

      //print(decode(frenchCode,secret))
      val table = convert(frenchCode)

      //table.foreach(t=>println(t._1 +"=>" + (t._2 === encodeChar(frenchCode,t._1,List()))))
    }

  }
  test("decoding the secret"){
    new TestTrees {
      assert(decode(frenchCode,secret) === "huffmanestcool".toList)
    }
  }

  test("decoded secret returns the right secrent"){
    new TestTrees {
      assert(decodedSecret === "huffmanestcool".toList)
    }
  }

  test("encode some text with french code"){
    new TestTrees{
    }
  }

  test("decode and quickdecode is identity "){
    new TestTrees{
      val test = "afajfoiaognaoithoaeihwtoiwahogtaoghoiaehtiogoiagh";
      assert(decode(frenchCode,quickEncode(frenchCode)(test.toList)) === test.toList)
    }
  }

}
