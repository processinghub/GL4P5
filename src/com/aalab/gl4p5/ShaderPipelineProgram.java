package com.aalab.gl4p5;


import com.jogamp.opengl.GL4;

public abstract class ShaderPipelineProgram {
    private GL4 gl;

    protected int program;

    ShaderPipelineProgram(GL4 gl) {
        this.gl = gl;
    }

    //TODO: 从子类里拿到ShaderSrc字符串，编译Shader并返回ID
    public int createAndCompile(int shaderType, String shaderSrc){
        return 0;
    }

    //TODO: 销毁ProgramID
    public void dispose(){

    }

    //TODO: 启动Program
    public void begin(){

    }

    //TODO: 关闭Program
    public void end(){

    }

}
