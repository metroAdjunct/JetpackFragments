package edu.msudenver.cs3013.jetpackfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val biggestState: TextView?
        get() = view?.findViewById(R.id.biggest_state)
    private val capital: TextView?
        get() = view?.findViewById(R.id.capital)
    private val population: TextView?
        get() = view?.findViewById(R.id.population)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val biggestStatesId = arguments?.getInt(BIGGEST_STATES_ID, 0) ?: 0
        setBiggestStatesData(biggestStatesId)
    }

    fun setBiggestStatesData(biggestStatesId: Int) {
        when(biggestStatesId) {
            R.id.california -> {
                biggestState?.text = getString(R.string.california)
                capital?.text = getString(R.string.capital, "Sacramento")
                population?.text = getString(R.string.population, "39,500,000")
            }
            R.id.texas -> {
                biggestState?.text = getString(R.string.texas)
                capital?.text = getString(R.string.capital, "Austin")
                population?.text = getString(R.string.population, "30,100,000")
            }
            R.id.florida -> {
                biggestState?.text = getString(R.string.florida)
                capital?.text = getString(R.string.capital, "Tallahassee")
                population?.text = getString(R.string.population, "21,500,000")
            }
            R.id.newyork -> {
                biggestState?.text = getString(R.string.newyork)
                capital?.text = getString(R.string.capital, "Albany")
                population?.text = getString(R.string.population, "20,200,000")
            }
            R.id.pennsylvania -> {
                biggestState?.text = getString(R.string.pennsylvania)
                capital?.text = getString(R.string.capital, "Harrisburg")
                population?.text = getString(R.string.population, "13,000,000")
            }
            R.id.illinois -> {
                biggestState?.text = getString(R.string.illinois)
                capital?.text = getString(R.string.capital, "Springfield")
                population?.text = getString(R.string.population, "12,800,000")
            }
            R.id.ohio -> {
                biggestState?.text = getString(R.string.ohio)
                capital?.text = getString(R.string.capital, "Columbus")
                population?.text = getString(R.string.population, "11,800,000")
            }
            R.id.georgia -> {
                biggestState?.text = getString(R.string.georgia)
                capital?.text = getString(R.string.capital, "Atlanta")
                population?.text = getString(R.string.population, "10,700,000")
            }
            R.id.northcarolina -> {
                biggestState?.text = getString(R.string.northcarolina)
                capital?.text = getString(R.string.capital, "Raleigh")
                population?.text = getString(R.string.population, "10,400,000")
            }
            R.id.michigan -> {
                biggestState?.text = getString(R.string.michigan)
                capital?.text = getString(R.string.capital, "Lansing")
                population?.text = getString(R.string.population, "10,077,000")
            }
            R.id.newjersey -> {
                biggestState?.text = getString(R.string.newjersey)
                capital?.text = getString(R.string.capital, "Trenton")
                population?.text = getString(R.string.population, "9,300,000")
            }
            R.id.virginia -> {
                biggestState?.text = getString(R.string.virginia)
                capital?.text = getString(R.string.capital, "Richmond")
                population?.text = getString(R.string.population, "8,600,000")
            }
        }
    }
    companion object {
        private const val BIGGEST_STATES_ID = "BIGGEST_STATES_ID"

        fun newInstance(biggestStatesId: Int) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(BIGGEST_STATES_ID, biggestStatesId)
                }
            }
    }
}