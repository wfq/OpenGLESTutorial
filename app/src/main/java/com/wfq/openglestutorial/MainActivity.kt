package com.wfq.openglestutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wfq.openglestutorial.widget.MyGLSurfaceView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyGLSurfaceView(this))
    }
}
