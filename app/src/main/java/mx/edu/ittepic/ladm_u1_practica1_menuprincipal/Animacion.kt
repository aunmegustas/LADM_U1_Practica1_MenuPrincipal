package mx.edu.ittepic.ladm_u1_practica1_menuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal.databinding.ActivityAnimacionBinding
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal.databinding.ActivityMainBinding

class Animacion : AppCompatActivity() {
    lateinit var binding: ActivityAnimacionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.regresar.setOnClickListener {
            var main= Intent(this, MainActivity::class.java)
            startActivity(main)
        }


        }

}