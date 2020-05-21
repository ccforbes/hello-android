package cforbes1.uw.edu.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // used the "basic activity" template to understand the syntax
        // to implement the on click listener
        button.setOnClickListener {
            val messages = this@MainActivity.resources.getStringArray(R.array.personal_greetings)
            val random = (Math.random() * 2).toInt()
            Toast.makeText(applicationContext, messages[random], Toast.LENGTH_LONG).show()
        }
    }


}