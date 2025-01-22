package com.example.devdemoapp.base

import android.view.LayoutInflater
import android.view.ViewGroup

typealias Inflate<VB> = (LayoutInflater, ViewGroup, Boolean) -> VB
