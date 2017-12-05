class Person(val firstName: String, var lastName:
String)

class Person2 constructor(val firstName: String, var
lastName: String)

class Person3 constructor(fName: String, lName:
String) {

    val firstName: String = fName
    var lastName = lName

}