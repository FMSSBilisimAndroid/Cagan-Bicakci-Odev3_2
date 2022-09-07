package com.patika.week3appnavigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //fragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            btnForgetPassword.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_forgetPasswordFragment)
            }

            btnLogin.setOnClickListener {

                findNavController().apply {
                    navigate(R.id.action_loginFragment_to_homeActivity)
                    backQueue.clear()
                }
//                val intent = Intent(activity, HomeActivity::class.java)
//                intent.addFlags(
//                    Intent.FLAG_ACTIVITY_CLEAR_TASK or
//                            Intent.FLAG_ACTIVITY_NEW_TASK
//                )
//                startActivity(intent)
            }

        }
    }


}