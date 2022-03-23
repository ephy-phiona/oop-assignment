fun main(){
var characters=Human("Tamara Blessing",16,60)
    characters.eat(3)
    println(characters.Weight)
    println(characters.speak("I am a student in AkiraChix."))
    characters.age(1)
    println(characters.Age)
    var information=User("Alice","Awino","aliceawino@gmail.com","0741454086",498756)
    println(information.email)
    println(information.phonenumber)
    println(information.firstname)
    println(information.password)
}
class Human( var Name:String,var Age:Int,var Weight:Int){


   fun eat(foodWeight:Int): Int{
       var foodWeight=3
       println("I am eating $foodWeight kgs of food." )
       Weight+=foodWeight
       return Weight
}
    fun speak(speech: String): String{
        return speech
    }
fun age(birthday:Int):Int{
    Age+=birthday
    return Age
}
}
class User(var firstname:String,var lastname:String,var email:String,var phonenumber:String,var password:Int){




}