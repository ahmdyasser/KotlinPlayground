class Rectangle(private var height: Double, private var width: Double) {
    var perimeter = (height + width) * 2
}
fun main() {
    val rect = Rectangle(5.0,2.0)

    print("the perimeter is ${rect.perimeter}")
    var y: Int
}