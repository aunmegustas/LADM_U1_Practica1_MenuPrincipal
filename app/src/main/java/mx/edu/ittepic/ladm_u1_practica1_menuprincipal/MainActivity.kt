package mx.edu.ittepic.ladm_u1_practica1_menuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_menuprincipal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imagen.setOnClickListener {
            var imagen = Intent(this, Imagen::class.java)
            startActivity(imagen)
        }
        binding.musica.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Apartado de Música")
                .setPositiveButton("Aceptar"){
                    d,i->
                    d.dismiss()
                }
                .setNegativeButton("Cancelar"){
                    d,i->
                    d.cancel()
                    Toast.makeText(this,"Qué tratas de cancelar? No hace nada esta alerta de dialogo.",Toast.LENGTH_LONG)
                        .show()
                }
                .setNeutralButton("Salir"){
                    d,i->
                    finish()
                }
                .show()

        }
        binding.gif.setOnClickListener {

        }
        binding.animacion.setOnClickListener {

        }

    }

}