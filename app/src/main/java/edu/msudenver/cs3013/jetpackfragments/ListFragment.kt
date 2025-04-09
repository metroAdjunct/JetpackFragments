package edu.msudenver.cs3013.jetpackfragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ListFragment: Fragment()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("NAV", "========== LIST onCreate 0 ==========")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("NAV", "========== LIST onViewCreated 1 ==========")
        val biggestStates = listOf<View> (
            view.findViewById(R.id.california),
            view.findViewById(R.id.texas),
            view.findViewById(R.id.florida),
            view.findViewById(R.id.newyork),
            view.findViewById(R.id.pennsylvania),
            view.findViewById(R.id.illinois),
            view.findViewById(R.id.ohio),
            view.findViewById(R.id.georgia),
            view.findViewById(R.id.northcarolina),
            view.findViewById(R.id.michigan),
            view.findViewById(R.id.newjersey),
            view.findViewById(R.id.virginia)
        )
        Log.d("NAV", "========== LIST onViewCreated 2 ==========")
        biggestStates.forEach  {
            biggestState ->
            val fragmentBundle = Bundle()
            fragmentBundle.putInt(BIGGEST_STATES_ID, biggestState.id)
            biggestState.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.biggest_states_id_action, fragmentBundle))
        }
        Log.d("NAV", "========== LIST onViewCreated 3 ==========")

    }

    companion object {
        private const val BIGGEST_STATES_ID = "BIGGEST_STATES_ID"
        fun newInstance(param1: String, param2: String) =
            ListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
