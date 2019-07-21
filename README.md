### 专有名词列表
图形渲染管线


### 方法简介
###### glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, java.nio.Buffer ptr)
告诉OpenGL该如何解析顶点数据；
1. index: 指定要配置的顶点属性。以下两种方法二选一。
    ```
    // 1.通过在顶点着色器中使用 layout(location = int) 给属性配置位置
    layout (location = 0) attribute vec3 position;
    
    // 2.使用方法 glGetAttribLocation(String attributeName) 获取属性位置
    GLES20.glGetAttribLocation("position")
    ```
2. size: 指定顶点属性的大小。顶点属性是一个vec3，它由3个值组成，所以大小是3。
3. type: 指定顶点属性数据类型。
4. normalized: 是否希望数据被标准化。如果我们设置为GL_TRUE，所有数据都会被映射到0（对于有符号型signed数据是-1）到1之间。
5. stride: 步长，定义在连续的顶点属性组之间的间隔，单位为字节。
6. ptr: 顶点缓冲对象。

###### glEnableVertexAttribArray(int attrLocation)

启用顶点属性，顶点属性默认是禁用的。
attrLocation: 顶点数据位置。