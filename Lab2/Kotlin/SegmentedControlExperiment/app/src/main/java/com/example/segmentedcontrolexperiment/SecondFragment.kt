package com.example.segmentedcontrolexperiment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    private lateinit var checkBox: CheckBox
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Initialize views
        checkBox = view.findViewById(R.id.checkBox)
        textView = view.findViewById(R.id.textView)

        // Set up the checkbox listener
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                textView.text = "Checkbox is checked"
            } else {
                textView.text = "Checkbox is unchecked"
            }
        }

        return view
    }
}
