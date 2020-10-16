import java.util.*

//like c, c++, java programme execution starts from main method
//While learning kotlin we can write our code in a simple kotlin file instead of kotlin class file is saved with .kt extension
fun main(args : Array<String>){
    //1 println is the function to print data on console similar to print functions in Java
    println("Hello World") //Semi colon is optional in Kotlin
    //2 variables in Kotlin are declared with var and val keywords
    // variables declared with val keyword are immutabele they are constants it is similar to final keyword in java
    //Syntax is var var_name : Datatype = value
    val name : String = "Kotlin"
    //datatype is not required, variable memory is allocated based on variable value
    val surname = "Java"
   // surname = "kadari"//Throws compile time error as Val cannot be reassigned
    var age : Int = 10
    var isprogrammingLangauge : Boolean = true
    var anArray : Array<Int> = arrayOf(1,2,3,4)

    println("$name is programming langauge which runs on $surname\nits age is ${age.toDouble()}") //testing type casting
    //We can print with normal conctination also
    println("Java concationation==="+anArray[0]+"==="+anArray[1]+"==="+anArray[2]+"===="+anArray[3])
    //With Kotlin conctatination
    println("Kotlin Concatination===${anArray.get(0)}===${anArray[1]}===${anArray[2]}====${anArray[3]}")
    //Creating an object of MyClass
    var objofmyClass = MyClass()
    objofmyClass.name = "It is a class"
    println("Class name is ${objofmyClass.name}")

    //We numeric data types Byte , Int, Float Shortint, Double, Long
    //Char, Boolean and Array
    //In Kotlin type conversion from smaller data type to higher data type is done using helper functions
    var marks = 10
   // var longmarks : Long = marks//Type mismatch throws an error like found int required long
    var longMarks : Long = 10.toLong();
    println("Marks are $marks and long marks are $longMarks")

    //All operators like arthemetic ,logical, relational etc... are same as in java

    //Below code reads data from console and prints data
    println("Enter your Name :  ")
    var yourName = readLine()
    println("Enter your Age")
    try {
      var age =   Integer.valueOf(readLine())
        println("Hello $yourName Your age is $age")
    }
    catch (e : Exception){
        println("Hey $yourName You Entered incorrect Data")
    }
    //For reading Float, Long etc we have to use Scanner class
    val read = Scanner(System.`in`)
    println("Enter Some Float value")
    val float = read.nextFloat()
    println(float)

}

class MyClass{
    var name = ""
}

/*Output of this programme is
"C:\Program Files\Java\jdk-10.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3.4\lib\idea_rt.jar=52617:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.3.4\bin" -Dfile.encoding=UTF-8 -classpath E:\Kotlin\Project1\out\production\Project1;C:\Users\DELL\.IdeaIC2019.3\config\plugins\Kotlin\kotlinc\lib\kotlin-stdlib.jar;C:\Users\DELL\.IdeaIC2019.3\config\plugins\Kotlin\kotlinc\lib\kotlin-reflect.jar;C:\Users\DELL\.IdeaIC2019.3\config\plugins\Kotlin\kotlinc\lib\kotlin-test.jar;C:\Users\DELL\.IdeaIC2019.3\config\plugins\Kotlin\kotlinc\lib\kotlin-stdlib-jdk7.jar;C:\Users\DELL\.IdeaIC2019.3\config\plugins\Kotlin\kotlinc\lib\kotlin-stdlib-jdk8.jar File1Kt
Hello World
Kotlin is programming langauge which runs on Java
its age is 10.0
Java concationation===1===2===3====4
Kotlin Concatination===1===2===3====4
Class name is It is a class
Marks are 10 and long marks are 10
Enter your Name :
Srikanth
Enter your Age
26
Hello Srikanth Your age is 26
Enter Some Float value
10.0
10.0
Process finished with exit code 0


*/
