package gabriela.arevalo.labpracitco_gabrielaarevalo.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import gabriela.arevalo.labpracitco_gabrielaarevalo.MainActivity
import gabriela.arevalo.labpracitco_gabrielaarevalo.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtCorreo = findViewById<EditText>(R.id.txtCorreo)
        val txtPassword = findViewById<EditText>(R.id.txtPassword)
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener{



            if (txtCorreo.text.toString() == "" &&  txtPassword.text.toString() == ""){
                Toast.makeText(this, "¡¡¡No dejes los campos de texto sin llenar!!!", Toast.LENGTH_SHORT).show()
            }
            else{
                val dashboard = Intent(this, MainActivity::class.java)
                startActivity(dashboard)
            }
        }
    }
}