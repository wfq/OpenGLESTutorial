package com.wfq.openglestutorial

import android.opengl.GLES20
import android.opengl.GLSurfaceView
import com.wfq.openglestutorial.shape.Triangle
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MyGLRenderer: GLSurfaceView.Renderer {

    private lateinit var mTriangle: Triangle

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        GLES20.glClearColor(0f, 0f, 0f, 1f)
        mTriangle = Triangle()
    }

    override fun onDrawFrame(gl: GL10?) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)
        mTriangle.draw()
    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        GLES20.glViewport(0, 0, width, height)
    }
}