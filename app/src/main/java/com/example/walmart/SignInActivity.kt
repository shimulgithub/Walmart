package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignInActivity : AppCompatActivity() {
    var users = arrayListOf<User>()
    private lateinit var signUpButton: Button
    private lateinit var emailEditText: EditText
    private lateinit var emailPasswordText: EditText
    private lateinit var signInButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_page)
        signUpButton = findViewById(R.id.signup_button)
        emailEditText = findViewById(R.id.email_edit_text)
        emailPasswordText=findViewById(R.id.password_edit_text)
        signInButton = findViewById(R.id.signin_button)
        addUsers()

        signInButton.setOnClickListener {
            commandSignIn(emailEditText.text.toString(),emailPasswordText.text.toString())
        }
        signUpButton.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
    fun commandSignIn( email: String, password: String){
        if (users.filter { it.email == email && it.password == password }.count() > 0){
            startActivity(Intent(this,CategoriesActivity::class.java))
        }else{
            android.widget.Toast.makeText(this, "Wrong username or password", android.widget.Toast.LENGTH_LONG).show()
        }
    }

    fun addUsers(){
        users.add(User("Shahab","Uddin","suddin@gmail.com","123456"))
        users.add(User("Atikur","Rahman","arahman@gmail.com","123456"))
        users.add(User("Kamal","Uddin","kuddin@gmail.com","123456"))
        users.add(User("Abul","azad","aazad@gmail.com","123456"))
        users.add(User("Abdul","Bari","abari@gmail.com","123456"))
    }
}