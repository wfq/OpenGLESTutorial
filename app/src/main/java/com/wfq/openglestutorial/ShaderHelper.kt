package com.wfq.openglestutorial

import android.opengl.GLES20

fun loadShader(type: Int, shaderCode: String): Int {
    return GLES20.glCreateShader(type).also {
        GLES20.glShaderSource(it, shaderCode)
        GLES20.glCompileShader(it)
    }
}

fun linkProgram(vertexShaderId: Int, fragmentShaderId: Int): Int {
    return GLES20.glCreateProgram().also {
        GLES20.glAttachShader(it, vertexShaderId)
        GLES20.glAttachShader(it, fragmentShaderId)
        GLES20.glLinkProgram(it)
    }
}