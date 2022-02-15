package com.neppplus.kotlingrammaruitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val id = "admin"
            val password = "asdf"

            val inputId = loginID.text.toString()
            val inputPs = loginPS.text.toString()

            if (id == inputId && password == inputPs) {
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            } else if (id == inputId) {
                Toast.makeText(this, "비밀번호가 틀렸습니다", Toast.LENGTH_SHORT).show()
            } else if (password == inputPs) {
                Toast.makeText(this, "아이디가 틀렸습니다", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }

        }


    }
}