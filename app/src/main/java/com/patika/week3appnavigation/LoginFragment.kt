package com.patika.week3appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.patika.week3appnavigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        /**
         * [findNavController] applied as navController for accessing each elements on ui
         * action variables created for sending arguments with navigation graph
         * after navigating to the action back queue cleared to prevent going back from home
         * also popUpTo and popUpToInclusive tags configured in nav_graph
         */

        navController.apply {
            fragmentLoginBinding.apply {
                btnForgetPassword.setOnClickListener {
                    val action =
                        LoginFragmentDirections.actionLoginFragmentToForgetPasswordFragment(
                            etUsername.text.toString()
                        )
                    navController.navigate(action)
                }

                btnLogin.setOnClickListener {
                    if (etUsername.text.isNullOrBlank()) {
                        Snackbar.make(it, "Please enter an username!", Snackbar.LENGTH_SHORT).show()
                    } else {
                        val action =
                            LoginFragmentDirections.actionLoginFragmentToHomeFragment(etUsername.text.toString())
                        navigate(action)
                        backQueue.clear()
                    }
                }
            }

        }

    }
}