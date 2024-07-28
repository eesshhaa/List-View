package com.example.listview_whatsapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList: ArrayList<user_data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Ram","Anjili","Kush","Ritik","Ansh")
        val lastMsg = arrayOf("Hiiii","Okaayyyy","Whats up bro","What are you doing","Noicccceeeee")
        val lastMsgTime = arrayOf("6:25 AM","10:25 AM","5:02 PM", "7:30 PM","6:01 PM")
        val phoneNumber = arrayOf("2222222222","8888888888","2525252525","3636363636","9999999999")
        val imgID = intArrayOf(R.drawable.profile1,R.drawable.profile2,R.drawable.profile3,
            R.drawable.profile4,R.drawable.profile5)

      //  userArrayList = ArrayList()

        for(index in name.indices){
            val user_obj = user_data(name[index],lastMsg[index],lastMsgTime[index],phoneNumber[index],imgID[index])
            userArrayList.add(user_obj)
        }
        val listView = findViewById<ListView>(R.id.MainListView)
        listView.adapter = MyAdapter(this,userArrayList)

    }
}