class BootStrap {

    def init = { servletContext ->
        new helloworld.Product(name: "tea", sku:"T001", price: 15).save()
        new helloworld.Product(name: "cofee", sku:"C001", price: 20).save()
    }
    def destroy = {
    }
}
