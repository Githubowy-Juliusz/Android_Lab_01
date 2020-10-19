package laborki.main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import laborki.main.watchers.CelsiusInputTextWatcher

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val celsiusInput = findViewById<TextInputEditText>(R.id.celsiusInput)
		val fahrenheitOutput = findViewById<TextView>(R.id.fahrenheitOutput)
		val celsiusInputTextWatcher = CelsiusInputTextWatcher(fahrenheitOutput)
		celsiusInput.addTextChangedListener(celsiusInputTextWatcher)
	}
}