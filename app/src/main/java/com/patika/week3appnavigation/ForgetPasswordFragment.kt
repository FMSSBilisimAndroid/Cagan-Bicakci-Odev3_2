package com.patika.week3appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.patika.week3appnavigation.databinding.FragmentForgetPasswordBinding


class ForgetPasswordFragment : Fragment() {

    private lateinit var fragmentForgetPasswordBinding: FragmentForgetPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentForgetPasswordBinding = FragmentForgetPasswordBinding.inflate(inflater)
        return fragmentForgetPasswordBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        val args: ForgotPasswordGraphArgs by navArgs()

        fragmentForgetPasswordBinding.apply {
            etUsername.setText(args.username)

            btnPasswordReset.setOnClickListener {
                val action= ForgetPasswordFragmentDirections.actionForgetPasswordFragmentToDialogScreen(etUsername.text.toString())
                navController.navigate(action)
            }
        }
    }

}