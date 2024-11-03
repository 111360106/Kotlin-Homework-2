package com.example.kotlinlab5

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment : Fragment() {

    private fun log(event: String) = Log.e("ThirdFragment", event)

    override fun onAttach(context: Context) { super.onAttach(context); log("onAttach") }
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); log("onCreate") }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_third, container, false).also { log("onCreateView") }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        log("onViewCreated")
    }

    override fun onStart() { super.onStart(); log("onStart") }
    override fun onResume() { super.onResume(); log("onResume") }
    override fun onPause() { super.onPause(); log("onPause") }
    override fun onStop() { super.onStop(); log("onStop") }
    override fun onDestroyView() { super.onDestroyView(); log("onDestroyView") }
    override fun onDestroy() { super.onDestroy(); log("onDestroy") }
    override fun onDetach() { super.onDetach(); log("onDetach") }
}
