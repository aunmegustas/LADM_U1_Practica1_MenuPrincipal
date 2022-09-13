package mx.edu.ittepic.ladm_u1_practica1_menuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal.databinding.ActivityMainBinding
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal.databinding.ActivityVideosBinding

class Videos : AppCompatActivity() {
    lateinit var binding: ActivityVideosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideosBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.regresar.setOnClickListener {
            var main= Intent(this, MainActivity::class.java)
            startActivity(main)
        }

    }
}