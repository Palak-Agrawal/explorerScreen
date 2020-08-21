package com.example.exploreremulation

class PopulateData {

    fun populateData():  ArrayList<MFData>{
        val mFList : ArrayList<MFData> = emptyList<MFData>() as ArrayList<MFData>
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        mFList.add(MFData("Parag Parikh long term",14.4,"Multi  Cap", 5))
        mFList.add(MFData("Nippon Indian Pharma Fund",22.8,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",18.9,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        mFList.add(MFData("Axis BlueChip Fund Direct",12.5,"Large Cap", 5))
        return  mFList
    }
}