package com.aalab.gl4p5;

import com.jogamp.opengl.GL4;

public class PBRShader extends ShaderPipelineProgram {

    public PBRShader(GL4 gl, String vertFille, String fragFile) {
        super(gl);
    }

    @Override
    public void dispose() {
        //TODO: 断开+删除shaders
        super.dispose();
    }
}
