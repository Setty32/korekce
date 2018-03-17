package korekce.core

import korekce.core.ui.MainScreen
import javax.swing.JFrame
import javax.swing.WindowConstants

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val frame = JFrame()
            frame.contentPane = MainScreen().mainPanel
            frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            frame.pack()
            frame.isVisible = true
        }
    }
}
