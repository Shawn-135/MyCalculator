package sg.edu.rp.webservices.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        buttonAC.setOnClickListener {
            textView.text = ""
            textViewResult.text = ""
        }
        button0.setOnClickListener {
            textView.text = "0"
        }
        button1.setOnClickListener {
            textView.text = "1"
        }
        button2.setOnClickListener {
            textView.text = "2"
        }
        button3.setOnClickListener {
            textView.text = "3"
        }
        button4.setOnClickListener {
            textView.text = "4"
        }
        button5.setOnClickListener {
            textView.text = "5"
        }
        button6.setOnClickListener {
            textView.text = "6"
        }
        button7.setOnClickListener {
            textView.text = "7"
        }
        button8.setOnClickListener {
            textView.text = "8"
        }
        button9.setOnClickListener {
            textView.text = "9"
        }
        buttonPlus.setOnClickListener {
            textViewExpression.text = "+"
        }
        buttonMinus.setOnClickListener {
            textViewExpression.text = "-"
        }
        buttonMultiply.setOnClickListener {
            textViewExpression.text = "*"
        }
        buttonDivide.setOnClickListener {
            textViewExpression.text = "/"
        }
        buttonDot.setOnClickListener {
            textViewExpression.text = "."
        }
        buttonPlusMinus.setOnClickListener {
            textViewExpression.text = "+/-"
        }
        buttonModulus.setOnClickListener {
            textViewExpression.text = "%"
        }
        buttonEqual.setOnClickListener {
            val text = textView.text.toString()
            val expression = textViewExpression.text.toString()

            val result = textViewExpression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                textViewResult.text = longResult.toString()
            }
            else {
                textViewResult.text = result.toString()
            }
        }
    }

    fun evaluateExpression(string: String, clear: Boolean) {
        if(clear) {
            textViewResult.text = ""
            textViewExpression.append(string)
        }
        else {
            textViewExpression.append(textViewResult.text)
            textViewExpression.append(string)
            textViewResult.text = ""
        }
    }
}
