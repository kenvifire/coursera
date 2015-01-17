object exercise {
 	def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int,zero:Int)(a:Int,b:Int):Int=
 		if(a>b)zero
 		else combine(f(a),mapReduce(f,combine,zero)(a+1,b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  def product(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,(x,y)=>x*y,1)(a,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int

 	 product(x=>x*x)(3,4)                     //> res0: Int = 144
 	 product(x=>x)(1,5)                       //> res1: Int = 120
 	
 	//def fact(f:Int=>Int)(a:Int,b:Int):Int = mapReduce(f,
 	

}