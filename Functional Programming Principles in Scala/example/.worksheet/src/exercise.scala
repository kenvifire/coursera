object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(165); 
 	def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int=
 		if(a>b)zero
 		else combine(f(a),mapReduce(f,combine,zero)(a+1,b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(76); 
  def product(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,(x,y)=>x*y,1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$0 = 

 	 product(x=>x*x)(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(22); val res$1 = 
 	 product(x=>x)(1,5);System.out.println("""res1: Int = """ + $show(res$1))}
 	
 	//def fact(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,
 	

}
