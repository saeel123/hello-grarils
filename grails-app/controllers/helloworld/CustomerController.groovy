package helloworld

class CustomerController {
    static scaffold = true

    //def index = { }

    def customerLookup(Customer lookupInstance) {

        

        render(view: "checkin", model:[customerInstance: customerInstance, welcomeMessage:welcomeMessage])
    }

    def checkin = { 
        
    }
}
