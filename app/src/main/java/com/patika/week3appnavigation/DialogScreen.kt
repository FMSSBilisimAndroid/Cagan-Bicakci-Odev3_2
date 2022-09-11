package com.patika.week3appnavigation

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class DialogScreen : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Do you want to reset your password!")
                .setPositiveButton("OK") { _, _ ->

                    val args: ForgotPasswordGraphArgs by navArgs()

                    findNavController().apply {
                        val action = DialogScreenDirections.actionGlobalHomeFragment(args.username)
                        navigate(action)
                        backQueue.clear()
                    }
                }
                .setNegativeButton("Cancel") { _, _ ->
                    findNavController().apply {
                        navigateUp()
                    }
                }
            builder.create()
        } ?: throw IllegalStateException("activity can not null")

    }

}