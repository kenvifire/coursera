object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(157); 
 	
 	def sum(f:Int=>Int,a:Int,b:Int):Int={
 		def loop(a:Int,acc:Int):Int=
 			if(a>b)acc
 			else
 				loop(a+1,acc+f(a))
 		
 		loop(a,0)
 	};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(28); 
 	
 	def f(x:Int):Int = x*x;System.out.println("""f: (x: Int)Int""");$skip(18); val res$0 = 
 	sum(x=>x,1,100);System.out.println("""res0: Int = """ + $show(res$0));$skip(115); 
 	
 	

	
var res = "abca".map(x=>(x,1)).groupBy((element:(Char,Int))=>element._1).map(x=>(x._1,x._2.size)).toList;System.out.println("""res  : List[(Char, Int)] = """ + $show(res ))}


}
