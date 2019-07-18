package com.wfq.openglestutorial.shape

class Triangle {

    private val vertexShaderCode =
        "attribute vec4 vPosition;" +
                "void main() {" +
                "gl_Position = vPosition;" +
                "}"

    private val fragmentShaderCode =
        "precision mediump float;" +
                "uniform vec4 vColor;" +
                "void main() {" +
                "gl_FragColor = vColor;" +
                "}"

    init {
    }
}