package com.example.to_do_jetpackcomposemvvm.data.models

import android.graphics.Color
import com.example.to_do_jetpackcomposemvvm.ui.theme.HighPriorityColor
import com.example.to_do_jetpackcomposemvvm.ui.theme.LowPriorityColor
import com.example.to_do_jetpackcomposemvvm.ui.theme.MediumPriorityColor
import com.example.to_do_jetpackcomposemvvm.ui.theme.NonePriorityColor

enum class Priority(val color: androidx.compose.ui.graphics.Color) {
    High(HighPriorityColor),
    Medium(MediumPriorityColor),
    Low(LowPriorityColor),
    None(NonePriorityColor)
}