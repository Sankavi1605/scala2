object Q{
    var str:String ="Hello"
    var len:Int=str.length()
    def reverse(str1:String,len1:Int):Unit=len1 match{
            case x if(len1>=0)=>print(str1(len1))
            reverse(str1,len1-1)
            case _ =>println("")
    }
      

    def filterstring(strings:List[String]):List[String]={
        strings.filter(_.length>5)
    }
    def mean(num1:Int,num2:Int):Float={
        val mean= (num1+num2).toFloat/2
        Math.round(mean*100)/100.0f
    
    }
    def sumEven(numbers:List[Int]):Int={
        numbers.filter(_%2 == 0).sum
    }
    def main(args:Array[String]):Unit={
        reverse(str,len-1)
         println(filterstring(List("scala","Programming")))
         println(mean(12,45))
          println(sumEven(List(1,2,3,4,5,6)))
    }

}