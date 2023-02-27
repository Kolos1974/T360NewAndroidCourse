package hu.kolos.karlovitz.demodatingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import hu.kolos.karlovitz.demodatingapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.person_image)
        imageView.setImageResource(R.drawable.clooney3)
    }
}