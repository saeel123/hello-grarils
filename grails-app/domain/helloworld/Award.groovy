package helloworld

class Award {
    Date awardDate
    String type
    Integer points
    static belongsTo = [customer: Customer ]

    static constraints = {
    }
}