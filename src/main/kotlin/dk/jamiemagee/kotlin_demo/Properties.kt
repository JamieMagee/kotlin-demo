class PersonProperties constructor(private val firstName: String, private var lastName: String) {

    fun getFullName() = "$firstName $lastName"
}

class PersonProperties2 constructor(private var firstName: String, private var lastName: String) {

    var fullName
        get() = "$firstName $lastName"
        set(value) {
            val split = value.split(" ")
            firstName = split[0]
            lastName = split[1]

        }
}