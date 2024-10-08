object Q1 extends App {
    val obj = new Rational(1,2)
    val obj2 = new Rational(4,5)
    println(obj.neg)
    val x = obj.add(obj2)
    println(x)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}