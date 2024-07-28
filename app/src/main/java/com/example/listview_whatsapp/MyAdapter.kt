package com.example.listview_whatsapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context: Activity, val arrayList: ArrayList<user_data>) : ArrayAdapter<user_data>(context,R.layout.eachitem,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachitem,null)


        val img = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.name)
        val message = view.findViewById<TextView>(R.id.message)
        val mesgTime = view.findViewById<TextView>(R.id.time)

        name.text = arrayList[position].name
        message.text = arrayList[position].lastMsg
        mesgTime.text = arrayList[position].lastMsgTime
        img.setImageResource(arrayList[position].imgID)

        return view
    }
}