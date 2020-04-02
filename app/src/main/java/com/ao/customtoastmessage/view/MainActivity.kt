package com.ao.customtoastmessage.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ao.customtoastmessage.R
import com.ao.customtoastmessage.base.Toasta
import com.ao.customtoastmessage.base.Toasta.Companion.makeToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnView()
    }

    fun btnView() {
        button.setOnClickListener {
            makeInfoToast()

        }
        button2.setOnClickListener {
            makeSuccessToast()
        }
        button3.setOnClickListener {
            makeWarningToast()
        }
        button4.setOnClickListener {
            makeErrorToast()
        }
        button5.setOnClickListener {
            basic()
        }

    }


    fun makeInfoToast() {
        makeToast(this, "This is an Info Toast Message").show()
        
        Toasta.makeToast(this, "This is an Info Toast Message").show()
    }


    fun makeSuccessToast() {
        makeToast(
            this,
            "This is a Success Toast Message",
            Toasta.CUSTOM_DURATION_SHORT,
            Toasta.CUSTOM_TYPE_SUCCESS,
            Toasta.CUSTOM_GRAVITY_TOP
        ).show()

    }

    fun makeWarningToast() {
        Toasta.makeToast(
            this,
            "This is a Warning Toast Message",
            Toasta.CUSTOM_DURATION_SHORT,
            Toasta.CUSTOM_TYPE_WARNING,
            Toasta.CUSTOM_GRAVITY_CENTER
        ).show()
    }

    fun makeErrorToast() {
        makeToast(
            this,
            "This is an Error Toast Message",
            Toasta.CUSTOM_DURATION_LONG,
            Toasta.CUSTOM_TYPE_ERROR
        ).show()
    }

    private fun basic() {
        Toast.makeText(this, "This is an Basic Toast Message", Toast.LENGTH_SHORT).show()
    }
}
