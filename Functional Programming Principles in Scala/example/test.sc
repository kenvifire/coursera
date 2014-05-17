object test {
 	
 	def sum(f:Int=>Int,a:Int,b:Int):Int={
 		def loop(a:Int,acc:Int):Int=
 			if(a>b)acc
 			else
 				loop(a+1,acc+f(a))
 		
 		loop(a,0)
 	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
 	
 	def f(x:Int):Int = x*x                    //> f: (x: Int)Int
 	sum(x=>x,1,100)                           //> res0: Int = 5050
 	
 	

	
var res = "abca".map(x=>(x,1)).groupBy((element:(Char,Int))=>element._1).map(x=>(x._1,x._2.size)).toList
                                                  //> res  : List[(Char, Int)] = List((b,1), (a,2), (c,1))


}