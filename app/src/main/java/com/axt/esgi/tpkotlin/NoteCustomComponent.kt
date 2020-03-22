package com.axt.esgi.tpkotlin

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.widget.LinearLayoutCompat

const val DEFAULT_IMAGE_SOURCE = R.drawable.ic_launcher_background
const val DEFAULT_COLOR = Color.RED

class NoteCustomComponent(context: Context, attrs: AttributeSet) : LinearLayoutCompat(context, attrs) {

    private var noteEditText: EditText
    private var noteImageView: ImageView

    init {
        inflate(context, R.layout.note_custom_component, this)
        noteEditText = findViewById(R.id.note_custom_component_edit_text)
        noteImageView = findViewById(R.id.note_custom_component_image)
        setupAttributes(attrs)
    }

    private fun setupAttributes(attrs: AttributeSet?) {
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.NoteCustomComponent, 0, 0)
        noteEditText.setTextColor(typedArray.getColor(R.styleable.NoteCustomComponent_textColor, DEFAULT_COLOR))
        noteEditText.setText(typedArray.getString(R.styleable.NoteCustomComponent_text))
        noteImageView.setImageResource(typedArray.getResourceId(R.styleable.NoteCustomComponent_src, DEFAULT_IMAGE_SOURCE))

        typedArray.recycle()
    }
}