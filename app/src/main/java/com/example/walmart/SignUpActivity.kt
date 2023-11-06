package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class SignUpActivity : AppCompatActivity() {
    private lateinit var saveButton: Button
    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_page)
        saveButton = findViewById(R.id.button)
        firstName = findViewById(R.id.firstName)
        lastName = findViewById(R.id.lastName)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        saveButton.setOnClickListener {
            saveSignUp()
        }
    }
    fun saveSignUp(){

        val firstName = firstName.text.toString()
        val lastName = lastName.text.toString()
        val email = email.text.toString()
        val password = password.text.toString()

        if (firstName.length == 0 || lastName.length == 0 || email.length == 0 || password.length == 0)
        {
            android.widget.Toast.makeText(this, "Please provide all required information", android.widget.Toast.LENGTH_LONG).show()
        }
        else
        {
            val intent = Intent(this,SignInActivity::class.java)
            intent.putExtra("firstName",firstName)
            intent.putExtra("lastName",lastName)
            intent.putExtra("email",email)
            intent.putExtra("password",password)
            startActivity(intent)
        }
    }
}