package com.wfq.openglestutorial

import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import java.nio.ShortBuffer
import javax.microedition.khronos.opengles.GL10

class Square {

    // 顶点坐标
    private val vertices = floatArrayOf(
        -1f, 1f, 0f,
        -1f, -1f, 0f,
        1f, -1f, 0f,
        1f, 1f, 0f
    )

    private val indices = shortArrayOf(0, 1, 2, 0, 2, 3)

    private val vertexBuffer: FloatBuffer =
        ByteBuffer.allocateDirect(vertices.size * 4).run {
            order(ByteOrder.nativeOrder())
            asFloatBuffer().apply {
                put(vertices)
                position(0)
            }
        }

    private val indexBuffer: ShortBuffer =
        ByteBuffer.allocateDirect(indices.size * 2).run {
            order(ByteOrder.nativeOrder())
            asShortBuffer().apply {
                put(indices)
                position(0)
            }
        }

    fun draw(gl: GL10) {
        gl.glFrontFace(GL10.GL_CCW)
        gl.glEnable(GL10.GL_CULL_FACE)
        gl.glCullFace(GL10.GL_BACK)
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY)
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer)
        gl.glDrawElements(GL10.GL_TRIANGLES, indices.size, GL10.GL_UNSIGNED_SHORT, indexBuffer)
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY)
        gl.glDisable(GL10.GL_CULL_FACE)
    }
}