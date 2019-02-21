package com.dxdevil.pd.constlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_juhi.setOnClickListener {
            Toast.makeText(applicationContext,"Hi juhi",Toast.LENGTH_SHORT).show()
        }


        bt_rishabh.setOnClickListener {
            Toast.makeText(applicationContext,"Hi Rishabh",Toast.LENGTH_SHORT).show()
        }


        bt_pratik.setOnClickListener {
            Toast.makeText(applicationContext,"Hi Pratik",Toast.LENGTH_SHORT).show()
        }


        bt_parashar.setOnClickListener {
            Toast.makeText(applicationContext,"Hi Parashar",Toast.LENGTH_SHORT).show()
        }
    }
}
