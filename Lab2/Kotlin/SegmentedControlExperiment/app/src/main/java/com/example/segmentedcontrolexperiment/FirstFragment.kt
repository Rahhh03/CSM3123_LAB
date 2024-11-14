package com.example.segmentedcontrolexperiment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    // This method is called to create the view hierarchy associated with the fragment.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Find views by their ID
        val textView: TextView = view.findViewById(R.id.textView)
        val imageButton: ImageButton = view.findViewById(R.id.imageLogo)

        // Set up any listeners or initialize data here
        imageButton.setOnClickListener {
            // Handle button click here (e.g., change text)
            textView.text = "Image Button Clicked!"
        }

        // Optionally, you can set the initial text or any other setup
        textView.text = "This is the First Fragment"

        return view // Return the inflated view
    }
}
