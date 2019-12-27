package com.tech.diffutilsrecyclerviewdemo.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.tech.diffutilsrecyclerviewdemo.Model.Contact
import com.tech.diffutilsrecyclerviewdemo.R
import com.tech.diffutilsrecyclerviewdemo.Utils.MyDiffUtilCallback

class MyRecyclerViewAdapter(var data: MutableList<Contact>) :
    RecyclerView.Adapter<MyRecyclerViewAdapter.ContactViewHolder1>() {

    class ContactViewHolder1(view: View) : RecyclerView.ViewHolder(view) {
        var icon: TextView = itemView.findViewById(R.id.tv_contact_icon)
        var name: TextView = itemView.findViewById(R.id.tv_contact_name)
        var phonenumber: TextView = itemView.findViewById(R.id.tv_contact_phone_number)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ContactViewHolder1(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_recyclerview,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ContactViewHolder1, position: Int) {
        holder.icon.text = data[position].name.substring(0, 2)
        holder.name.text = (data[position].name)
        holder.phonenumber.text = data[position].phonenumber
    }


    override fun onBindViewHolder(holder: ContactViewHolder1, position: Int, payloads: MutableList<Any>) {
        if (payloads.isEmpty())
            super.onBindViewHolder(holder, position, payloads)
        else {
            var bundle: Bundle = payloads[0] as Bundle
            for (key in bundle.keySet()) {
                if (key == "name") {
                    Toast.makeText(
                        holder.itemView.context,
                        "Contact $position : Name Changed",
                        Toast.LENGTH_SHORT
                    ).show()
                    holder.icon.text = data[position].name.substring(0, 2)
                    holder.name.text = data[position].name
                }
                if (key == "phone") {
                    Toast.makeText(
                        holder.itemView.context,
                        "Contact $position : Phone Number Changed",
                        Toast.LENGTH_SHORT
                    ).show()
                    holder.phonenumber.text = data[position].phonenumber
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun onNewData(newData: ArrayList<Contact>) {
        val diffResult = DiffUtil.calculateDiff(MyDiffUtilCallback(newData, data))
        diffResult.dispatchUpdatesTo(this)
        this.data.clear()
        this.data.addAll(newData)
    }

}