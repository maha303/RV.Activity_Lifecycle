package com.example.rvactivity_lifecycle

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    private lateinit var tv:TextView
    private lateinit var tv2:TextView

  //  private lateinit var sharedPreferences: SharedPreferences
  //val time =SimpleDateFormat("hh:mm a",Locale.getDefault()).format(Date())
  val times = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   sharedPreferences = this.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE)

        tv=findViewById(R.id.tv)
        tv2=findViewById(R.id.tv2)
        tv2.text=times.toString()
       // tv2.text="last seen at : "

      //    val timeLast = sharedPreferences.getString("time","0").toString()
      //    tv2.text="last seen at : $timeLast"
      //     tv2.text="last seen at : $time"


    }

    override fun onStart() {
        super.onStart()

        times.add("online")
        tv2.text=times.toString()


        //  with(sharedPreferences.edit()) {
       //     putString("time", time)
     //      apply()

    //    }

    }



    override fun onResume() {
        super.onResume()



    }

    override fun onPause() {
        super.onPause()
        val time3 =SimpleDateFormat("hh:mm a",Locale.getDefault()).format(Date())
        times.add("online last seen at : $time3")
        tv2.text=times.toString()


    }

    override fun onStop() {
        super.onStop()
     //   val time1 =SimpleDateFormat("hh:mm a",Locale.getDefault()).format(Date())
     //   times.add("online last seen at : $time1")
      //  tv2.text=times.toString()


    }

    override fun onDestroy() {
        super.onDestroy()



    }
}