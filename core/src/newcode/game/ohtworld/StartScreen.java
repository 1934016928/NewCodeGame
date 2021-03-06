package newcode.game.ohtworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;


/**
 * 项目名称: Game.
 * 项目所属: NewCode.
 * 创 建 人: Var "雨中行".
 * 创建时间: 2015/9/25 16:55.
 * 类 描 述: 游戏的开始界面
 */
public class StartScreen implements Screen {
    MainGame game;

    public StartScreen(MainGame game){
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl20.glClearColor(0, 0, 0, 0);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
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

    }
}
