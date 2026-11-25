package net.evergladestudios.mahoganyengine.engine;

import net.evergladestudios.mahoganyengine.engine.graph.Render;
import net.evergladestudios.mahoganyengine.engine.scene.Scene;

public interface IAppLogic {

    void cleanup();

    void init(Window window, Scene scene, Render render);
    void input(Window window, Scene scene, long diffTimeMillis);
    void update(Window window, Scene scene, long diffTimeMillis);
}
