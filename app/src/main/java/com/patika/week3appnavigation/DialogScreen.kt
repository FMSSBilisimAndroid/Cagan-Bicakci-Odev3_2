package com.patika.week3appnavigation

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class DialogScreen: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Do you want to reset your password!")
                .setPositiveButton("OK") { _, _ ->
                    findNavController().apply {
                        navigate(R.id.action_dialogScreen_to_homeActivity)
                        backQueue.clear()

                    }
                }
                .setNegativeButton("Cancel") { _, _ ->
                    findNavController().apply {
                        navigate(R.id.loginFragment)
                        backQueue.clear()
                    }
                }
            builder.create()
        }?: throw IllegalStateException("activity can not null")


    }

}