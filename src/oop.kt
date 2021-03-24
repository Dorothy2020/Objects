import java.nio.file.attribute.UserDefinedFileAttributeView

fun main() {
    var food=Human("Dorothy",20,45)
    food.eat(30)
    food.speak("excuse")
    food.birthday()

    var details= User("Dorothy","Akoth","akothdorothy29@gmail.com","+2547154344","doo2")
        println(details.email)
        println(details.phoneNumber)

}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        ++age
        println(age)
    }

    }

    data class User(var firstName:String,var lastname:String,var email:String,var phoneNumber:String,var password:String ) 

    


