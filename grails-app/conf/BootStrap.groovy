class BootStrap {

    def init = { servletContext ->
        new rewards.Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new rewards.Product(name: "Dark Roast", sku: "DK01", price: 12.95).save()
    }
    def destroy = {
    }
}
