package rewards

import grails.transaction.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {
        def firstName = params.first
        def totalPoints = params.points.toInteger()
        def welcomeMessage = ""
        
        switch(totalPoints) {
            case 5:
                welcomeMessage = "Welcome back $firstName. This drink is on us."
                break
            case 4:
                welcomeMessage = "Welcome back $firstName. The next drink is free."
                break
            case 2..3:
                welcomeMessage = "Welcome back $firstName. You now have $totalPoints points."
                break
            default:
                welcomeMessage = "Welcome $firstName. Thank you for registering."
                break
        }
    }
}
