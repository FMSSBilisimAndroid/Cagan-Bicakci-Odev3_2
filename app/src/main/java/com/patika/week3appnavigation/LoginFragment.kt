package com.patika.week3appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.navigation.fragment.findNavController
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

        fragmentLoginBinding.apply {

            btnForgetPassword.setOnClickListener {
                navController.navigate(R.id.action_loginFragment_to_forgetPasswordFragment)
            }

            btnLogin.setOnClickListener {
                navController.apply {
                    val username = etUsername.text;
                    val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment()
                    navigate(R.id.action_loginFragment_to_homeFragment)
                    backQueue.clear()
                }
            }
        }
    }


}