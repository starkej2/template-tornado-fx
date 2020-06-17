package me.jeffreystarke.template.view

import me.jeffreystarke.template.app.Styles
import tornadofx.*

class MainView : View("Hello World!") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}