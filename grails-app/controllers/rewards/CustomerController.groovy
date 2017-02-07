package rewards

class CustomerController {
    static scaffold = true

    def calculationsService

    def lookup() {
        def customerInstance = Customer.list(sort: "lastName")
        [customerInstanceList: customerInstance]
    }

    def customerLookup(Customer lookupInstance) {
        def (customerInstance, welcomeMessage)= calculationsService.processCheckin(lookupInstance)
        render(view: "checkin", model:[customerInstance: customerInstance, welcomeMessage: welcomeMessage])
    }

    def checkin() { }

    def index() {
        params.max = 10
        [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
    }

    def create() {
        [customerInstance: new Customer()]
    }

    def save(Customer customerInstance) {
        customerInstance.save()
        redirect(action: "show", id: customerInstance.id)
    }

    def show(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance = calculationsService.getTotalPoints(customerInstance)
        [customerInstance: customerInstance]
    }

    def edit(Long id) {
        def customerInstance = Customer.get(id)
        [customerInstance: customerInstance]
    }

    def update(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance.properties = params
        customerInstance.save(flush: true)
        redirect(action: "show", id: customerInstance.id)
    }

    def delete(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance.delete(flush: true)
        redirect(action: "index", id: customerInstance.id)
    }

    def profile() {
        def customerInstance = Customer.findByPhone(params.id)
        [customerInstance: customerInstance]
    }

    def updateProfile(Customer customerInstance) {
        customerInstance.save()
        render(view: "profile", model:[customerInstance: customerInstance])
    }

}
