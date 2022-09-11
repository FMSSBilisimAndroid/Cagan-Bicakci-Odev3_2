package com.patika.week3appnavigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.patika.week3appnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater)
        return fragmentHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: HomeFragmentArgs by navArgs()

        /**
         * [navArgs] called as args to access arguments
         * inside [fragmentHomeBinding].apply tag, set user value from arguments by calling args.username
         * for logging out an intent created and added new task flag to prevent re login
         * by clicking back button after logout
         */

        fragmentHomeBinding.apply {
            tvWelcome.text = getString(R.string.welcome, args.username)

            btnLogout.setOnClickListener {
                logout()
            }
        }
    }

    private fun logout() {
        val intent = Intent(activity, MemberActivity::class.java)
        intent.addFlags(
            Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        )
        startActivity(intent)
    }
}