package com.aalab.gl4p5;

import com.jogamp.opengl.GL4;

public class ComputeShader extends ShaderPipelineProgram {

    public ComputeShader(GL4 gl, String vertFile, String fragFile, String compFile) {
        super(gl);
    }

    //TODO: 分配工作组
    public void beginDispatch(int x, int y, int z){

    }

    //TODO: 断开+删除shaders
    @Override
    public void dispose() {
        super.dispose();
    }
}
