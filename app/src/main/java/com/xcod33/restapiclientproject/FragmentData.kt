package com.xcod33.restapiclientproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.xcod33.restapiclientproject.databinding.FragmentDataBinding
import com.xcod33.restapiclientproject.modeldata.MovieData
import com.xcod33.restapiclientproject.modeldata.SearchData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FragmentData : Fragment() {
    private var _binding: FragmentDataBinding? = null
    private val binding get() = _binding!!
    private val list = ArrayList<MovieData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDataBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvData.setHasFixedSize(true)
        binding.rvData.layoutManager = LinearLayoutManager(context)

        RClient.instances.getMovies().enqueue(object: Callback<SearchData> {
            override fun onResponse(call: Call<SearchData>, response: Response<SearchData>) {
                val responseCode = response.code()

                response.body()?.let { list.addAll(it.data) }
                val adapter = MovieAdapter(list)
                binding.rvData.adapter = adapter
            }

            override fun onFailure(call: Call<SearchData>, t: Throwable) {

            }
        })

    }


}