package helloworld

class Product {
    String name
    String sku
    Float price
    static hasMany = [orderItems: OrderItem]

    static constraints = {

    }
}
