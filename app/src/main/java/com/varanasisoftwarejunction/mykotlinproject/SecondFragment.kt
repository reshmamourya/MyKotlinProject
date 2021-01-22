package com.varanasisoftwarejunction.mykotlinproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    public fun doAdd(view:View)
    {
        val tv: TextView = view.findViewById<TextView>(R.id.tvResult)
        try {

            val ed1:EditText  = view.findViewById<EditText>(R.id.ed1)
            val ed2:EditText  = view.findViewById<EditText>(R.id.ed2)
            var x:Int =ed1.text.toString().toInt()
            var y:Int =ed2.text.toString().toInt()
            var sum:Int=x+y
            tv.text = sum.toString()
        }
        catch(ex:Exception)
        {
            tv.text="" + ex.message
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bttnAdd).setOnClickListener {
            doAdd(view)
        }
        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}