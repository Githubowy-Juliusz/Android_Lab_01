package laborki.main.watchers

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import kotlin.math.roundToInt

class CelsiusInputTextWatcher(private val fahrenheitOutput: TextView) :
	TextWatcher {

	override fun afterTextChanged(s: Editable) {}

	override fun beforeTextChanged(
		sequence: CharSequence, start: Int,
		count: Int, after: Int
	) {
	}

	override fun onTextChanged(
		sequence: CharSequence, start: Int,
		before: Int, count: Int
	) {
		val celsiusInput = sequence.toString().toDoubleOrNull()
		var result = "-"
		if(celsiusInput != null) {
			val roundedInput = (celsiusInput * 10.0).roundToInt() / 10.0
			result = calculateFromCelsiusToFahrenheit(roundedInput).toString()
		}
		fahrenheitOutput.text = "Fahrenheit: $result"
	}

	private fun calculateFromCelsiusToFahrenheit(input: Double): Double {
		return 32 + (1.8 * input)
	}
}