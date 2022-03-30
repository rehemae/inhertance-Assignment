fun main(){
    var car=Car("harrier", "XXh","White",5)
    car.carry(10)
    car.identity("white","subaru","legacy")
println(car.calculatingPackingFees(3))
    var bus=Bus("toyota","cc","black",6)
    bus.maxTripFare(400.0)
    bus.calculatingParkingFare(6)


}

class Car(var make:String, var model:String,var color:String, var capacity:Int) {


    fun carry(people: Int) {
        var z = people - capacity
        if (capacity >= people) {
            println("carrying $people passengers")
        } else {
            println("over capacity by $z people")
        }
    }

    fun identity(color: String, make: String, model: String) {
        println("I am a $color $make $model")

    }
   open fun calculatingPackingFees(hours:Int):Int{
        var s=hours*20
       println(s)
        return s

    }
}
 class Bus( var make: String, var model: String,  var color: String, var capacity: Int){


    fun maxTripFare(Fare: Double): Double {
        var maxFare = Fare*20
        return(maxFare)


    }
    fun calculatingParkingFare(hours: Int) {
        var product=hours*20
        println(product)
    }



}
