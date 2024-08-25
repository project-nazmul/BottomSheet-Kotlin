package com.example.bottomsheetkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomSheet = findViewById<Button>(R.id.bottomSheet)

        bottomSheet.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.bottom_sheet,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.setCancelable(true)

            val buttonClose = view.findViewById<Button>(R.id.button4)
            buttonClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()


        }
    }
}