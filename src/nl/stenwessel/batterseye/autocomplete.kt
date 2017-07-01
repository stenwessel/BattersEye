package nl.stenwessel.batterseye

import javafx.beans.binding.Bindings
import javafx.scene.control.ComboBox
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class ResizableAutocompleteSkin<T>(comboBox: ComboBox<T>, autoCompleteFilter: ((String) -> List<T>)?,
        height: Double = 24.0) : AutoCompleteComboBoxSkin<T>(comboBox, autoCompleteFilter) {

    init {
        with(listView) {
            fixedCellSize = height
            // Plus 2 pixels for the list view border
            prefHeightProperty().bind(Bindings.min(1000, itemsProperty().integerBinding { it?.size ?: 0 }).multiply(
                    fixedCellSizeProperty()).add(2))
        }
    }
}
