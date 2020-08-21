package com.example.exploreremulation

import androidx.lifecycle.ViewModel

class MFfragmentViewModel(private val populateData: PopulateData) : ViewModel() {

    val mfData = populateData.populateData()

}