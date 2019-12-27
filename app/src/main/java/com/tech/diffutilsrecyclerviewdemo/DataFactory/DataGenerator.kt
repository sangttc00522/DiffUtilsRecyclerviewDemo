package com.tech.diffutilsrecyclerviewdemo.DataFactory

import com.tech.diffutilsrecyclerviewdemo.Model.Contact
import java.util.*

/**
 * Created by kuliza-319 on 18/2/17.
 */

class DataGenerator {
    companion object {
        fun getData(): ArrayList<Contact> {
            var contacts = ArrayList<Contact>()
            contacts.add(Contact("Raj Suvariya", "9099809050"))
            contacts.add(Contact("Rajat Talesra", "9723124260"))
            contacts.add(Contact("Nishit Chattrala", "8460770916"))
            contacts.add(Contact("Rajan Pipaliya", "8141081381"))
            contacts.add(Contact("Nilay Shrimali", "7046295423"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            contacts.add(Contact("Saurav Pratihar", "9033399314"))
            return contacts
        }

        fun getUpdatedData(): ArrayList<Contact> {
            var contacts = getData()
            contacts[9].phonenumber = "9067250043"
            contacts[10].name = "Rajat Talesra (CEO)"
            return contacts
        }
    }
}
