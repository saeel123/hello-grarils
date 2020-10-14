package helloworld

class Customer {
    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoint
    static hasMany = [awards: Award, orders: OnlineOrder]

    static constraints = {
        phone()
        firstName(nullable: true, maxSize: 25)
        lastName(nullable: true, maxSize: 25)
        email(nullable: true, email: true )
        totalPoint(nullable: true, max: 10 )
    }
}
