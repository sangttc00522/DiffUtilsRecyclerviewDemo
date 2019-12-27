package com.tech.diffutilsrecyclerviewdemo.Utils

import android.os.Bundle
import androidx.recyclerview.widget.DiffUtil
import com.tech.diffutilsrecyclerviewdemo.Model.Contact

class MyDiffUtilCallback(
    var newList: MutableList<Contact>,
    var oldList: MutableList<Contact>
) :
    DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }

    override fun getOldListSize(): Int {
        return if (oldList != null) oldList.size else 0
    }

    override fun getNewListSize(): Int {
        return if (newList != null) newList.size else 0
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return newList[newItemPosition] == (oldList[oldItemPosition])
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        var newContact = newList[newItemPosition]
        var oldContact = oldList[oldItemPosition]
        var diff = Bundle()
        if (!newContact.name.equals(oldContact.name)) {
            diff.putString("name", newContact.name)
        }
        if (!newContact.phonenumber.equals(oldContact.phonenumber)) {
            diff.putString("name", newContact.phonenumber)
        }
        if (diff.size() == 0) {
            return null
        }
        return diff
    }
}