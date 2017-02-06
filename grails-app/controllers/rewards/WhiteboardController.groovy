package rewards

class WhiteboardController {
    def calculationsService

    // def index() { }

    def conditions() {
        def welcomeMessage = calculationsService.welcome(params)

        render welcomeMessage
    }

}
