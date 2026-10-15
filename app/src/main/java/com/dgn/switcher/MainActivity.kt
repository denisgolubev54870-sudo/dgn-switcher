package com.dgn.switcher

import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val file = File(Environment.getExternalStorageDirectory(), "dgn_switch.req")

        findViewById<Button>(R.id.btnHost).setOnClickListener {
            file.writeText("host")
            Toast.makeText(this, "HOST → reboot", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnDevice).setOnClickListener {
            file.writeText("device")
            Toast.makeText(this, "DEVICE → reboot", Toast.LENGTH_SHORT).show()
        }
    }
}
