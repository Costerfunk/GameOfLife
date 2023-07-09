package renderer;

import static org.lwjgl.opengl.GL11.*;

public class Texture {
    private String filepath;
    private int texID;

    public Texture(String filepath) {
        this.filepath = filepath;

        // Generate texture on GPU
        texID = glGenTextures();
        glBindTexture(GL_TEXTURE_2D, texID);

        // Set texture parameters
        // Repeat the image in both directions
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
    }


}
