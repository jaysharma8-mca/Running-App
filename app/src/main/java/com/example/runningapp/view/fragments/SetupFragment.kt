package com.example.runningapp.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.runningapp.R
import com.example.runningapp.databinding.FragmentSetupBinding
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class SetupFragment : Fragment() {

    private lateinit var binding : FragmentSetupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSetupBinding.inflate(inflater, container, false)

        val application = requireActivity().application

        AppCenter.start(application
            ,"12b738f1-310b-45f7-900e-53b6ed26fc28",
            Analytics::class.java,
            Crashes::class.java
        )

        binding.tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
            //throw Exception("Something went wrong")
            //Crashes.generateTestCrash()
        }
        return binding.root
    }

}