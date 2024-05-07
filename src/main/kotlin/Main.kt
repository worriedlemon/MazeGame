package mazeGame

import mazeGame.mazeView.MazeView
import javax.swing.SwingUtilities

fun main() {
    SwingUtilities.invokeLater {
        MazeView(true)
    }
}