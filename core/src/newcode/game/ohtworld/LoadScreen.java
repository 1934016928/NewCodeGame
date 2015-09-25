package newcode.game.ohtworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * 加载资源时显示的Screen
 * NewCode 创建于 2015/9/22.
 */
public class LoadScreen implements Screen {

    MainGame game;
    private TextureAtlas texture;
    private Animation rotate;
    private SpriteBatch batch;
    private float stateTime;

    public LoadScreen(MainGame game){
        this.game = game;
    }

    @Override
    public void show() {
        texture = new TextureAtlas(Gdx.files.internal("image/loading.plist"));
        batch = new SpriteBatch();
        rotate = new Animation(0.03f,texture.findRegions("loading"));
}

    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor(0, 0, 0, 0);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stateTime += Gdx.graphics.getDeltaTime();
        batch.begin();
        batch.draw(rotate.getKeyFrame(stateTime, true),Gdx.graphics.getWidth()/2-100,Gdx.graphics.getHeight()/2-50);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        texture.dispose();
        batch.dispose();
    }
}
